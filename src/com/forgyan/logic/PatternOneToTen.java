package com.forgyan.logic;

public class PatternOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 1;
		for(int i =0; i<=3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(t+"\t");
				t++;
			}
			System.out.println();
		}
	}

}
