package com.nt.filter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.List;
import java.util.StringTokenizer;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

@Provider
public class RestSecurityFilter implements ContainerRequestFilter {

	@Context
	private ResourceInfo resource;
	@Context
	private HttpHeaders head;

	@Override
	public void filter(ContainerRequestContext req) throws IOException {

		Method m = resource.getResourceMethod();

		if (!m.isAnnotationPresent(PermitAll.class)) {

			if (m.isAnnotationPresent(DenyAll.class)) {
				req.abortWith(Response.ok("This Request Can not be processed").status(Status.FORBIDDEN).build());

				return;
			}

			List<String> reqHeaders = head.getRequestHeaders().get("Authorization");

			if (reqHeaders == null || reqHeaders.isEmpty()) {
				req.abortWith(
						Response.ok("Provide Authorization Header in Request").status(Status.UNAUTHORIZED).build());

				return;
			}

			List<String> userDetails = getUserAndPwd(reqHeaders.get(0));

			if (m.isAnnotationPresent(RolesAllowed.class)) {

				List<String> roles = Arrays.asList(m.getAnnotation(RolesAllowed.class).value());

				if (!isValidUser(userDetails, roles)) {
					req.abortWith(Response.ok("Invalid User Details Provided").status(Status.UNAUTHORIZED).build());
					return;
				}
			} else {
				if (!isValidUser(userDetails, Arrays.asList("ALLPERMIT"))) {
					req.abortWith(Response.ok("Invalid User Details Provided").status(Status.UNAUTHORIZED).build());
					return;
				}

			}

		}

	}

	private List<String> getUserAndPwd(String auth) {

		auth = auth.replace("Basic ", "");

		Decoder decoder = Base64.getDecoder();

		byte[] bytes = decoder.decode(auth);

		auth = new String(bytes);

		StringTokenizer st = new StringTokenizer(auth, ":");

		return Arrays.asList(st.nextToken(), st.nextToken());
	}

	private boolean isValidUser(List<String> userDetails, List<String> roles) {
		boolean flag = false;
		if (userDetails != null && roles != null) {
			if ("admin".equals(userDetails.get(0)) && "nareshi".equals(userDetails.get(1))
					&& (roles.contains("ALLPERMIT") || roles.contains("ADMIN")))
				flag = true;
			else if ("emp".equals(userDetails.get(0)) && "nareshi".equals(userDetails.get(1))
					&& (roles.contains("ALLPERMIT") || roles.contains("EMP")))
				flag = true;
		}
		return flag;
	}

}
