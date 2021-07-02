package com.nt.test;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecodeTest {

	public static void main(String[] args) {
		
		String str="Welcome to Coding";
		
		byte[] bytes=str.getBytes();
		
		byte[] encodedBytes=Base64.encodeBase64(bytes);
		
		String encStr=new String(encodedBytes);
		
		System.out.println("Encoded String:: "+encStr);
		
		byte[] decBytes=Base64.decodeBase64(encodedBytes);
		
		String decStr=new String(decBytes);
		
		System.out.println("Decoded String:: "+decStr);
		
	}

}
