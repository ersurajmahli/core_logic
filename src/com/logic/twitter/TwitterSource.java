package com.logic.twitter;

public class TwitterSource {
	
	public static boolean booleanFromString(){
		/* Only String value "true" inboxed by Boolean wrapper class as true, rest inboxed as false */
		boolean b1 = Boolean.valueOf("1");
		boolean b2 = Boolean.valueOf("0");
		return(b1||b2);
	}

}
