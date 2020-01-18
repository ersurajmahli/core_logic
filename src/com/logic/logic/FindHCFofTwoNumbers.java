package com.logic.logic;

import java.util.Scanner;

public class FindHCFofTwoNumbers {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers with comma separated");
		
		sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		
		int separator = numbers.indexOf(",");
		int firstNumber = Integer.parseInt(numbers.substring(0, separator).trim());
		int seconNumber = Integer.parseInt(numbers.substring(separator+1, numbers.length()).trim());
		int hcf = 1;
		
		for(int i = 1; i<=firstNumber || i<=seconNumber; i++) {
			if(firstNumber%i==0 && seconNumber%i==0) {
				hcf = i;
			}
		}
		
		System.out.println("Highest common factor is :"+hcf);

	}

}
