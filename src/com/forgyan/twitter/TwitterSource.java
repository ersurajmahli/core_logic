package com.forgyan.twitter;

public class TwitterSource {
	
	public static void main(String[] args) {
		System.out.println(booleanFromString());
	}
	
	public static boolean booleanFromString(){
		/* Only String value "true" inboxed true by Boolean wrapper class as true, rest inboxed as false */
		boolean b1 = Boolean.valueOf("false");
		boolean b2 = Boolean.valueOf("false");
		return(b1||b2);
	}

}
