package com.logic.array;

import java.util.Scanner;

public class ShiftArrayIndexValuesToRight {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int[] A = {1,4,6,9,11,12,10};
		
		System.out.println("Orginal Array");
		
		for(int i = 0; i<A.length; i++) {
			System.out.print(A[i]+",");
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Inter number of place to shift");
		
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int shift = 0; shift<t;shift++) {
			int current = A[0];
			int afterCurrent = A[0];
			
			for(int i=0; i<A.length-1;i++) {
				afterCurrent = A[i+1];
				A[i+1]=current;
				current = afterCurrent;
				A[0]=current;
			}
		}
		
		System.out.println("Array After Shifting");
		
		for(int i = 0; i<A.length; i++) {
			System.out.print(A[i]+",");
		}

	}

}
