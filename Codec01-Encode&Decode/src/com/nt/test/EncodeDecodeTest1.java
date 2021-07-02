package com.nt.test;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;


public class EncodeDecodeTest1 {

	public static void main(String[] args) {
		
		String str="Welcome to Coding";
		
		byte[] bytes=str.getBytes();
		
		Encoder encoder=Base64.getEncoder();
		
		String encStr=encoder.encodeToString(bytes);
		
		System.out.println("Encoded String:: "+encStr);
		
		Decoder decoder=Base64.getDecoder();
		
		byte[] decBytes=decoder.decode(encStr);
		
		String decStr=new String(decBytes);
		
		System.out.println("Decoded String:: "+decStr);
		
	}

}
