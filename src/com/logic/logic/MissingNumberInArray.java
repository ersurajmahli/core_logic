package com.logic.logic;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,5,4,8,9,6,7};
		int totalSum = 0;
		int arraySum = 0;
		for(int i=1;i<=10;i++) {
			totalSum+=i;
		}
		//System.out.println(totalSum);

		for(int i=0;i<input.length;i++) {
			arraySum+=input[i];
		}
		//System.out.println(arraySum);
		
		System.out.println("Missing number is :"+(totalSum-arraySum));

	}

}
