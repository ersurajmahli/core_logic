package com.forgyan.exceptionHandling;

public class FinallyKewordExample {
	
	public static void withoutCatchBlock() {
		try {
			System.out.println("try block");
		}finally {
			System.out.println("catch block");
		}
	}
	
	public static void noExceptionThrown() {
		try {
			System.out.println("try block");
		}catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
	}
	
	public static void exceptionThrownNotHandled() {
		try {
			System.out.println("try block");
			throw new Exception("exception occured");
		}catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		
	}

}
