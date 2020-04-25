package com.forgyan.string;

public class ObjectStringDetails {

	public static void main(String[] args) {
		String s = new String("suraj");
		String s2 = "suraj";
		String s3 = "suraj";
		
		System.out.println(s==s2);
		System.out.println(s2==s3);
		
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s3));

	}

}
