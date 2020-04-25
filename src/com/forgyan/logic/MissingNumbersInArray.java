package com.forgyan.logic;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3,5,6,8,9,10};
		int[] check = new int[11];
		
		for(int a : input) {
			check[a]=1;
		}
		for(int i= 1; i<=10; i++) {
			if(i*check[i]==0) {
				System.out.println(i);
			}
		}
	}

}
