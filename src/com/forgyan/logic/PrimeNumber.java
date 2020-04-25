package com.forgyan.logic;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime number is divisible only by 1 and itself
		
		int n = 15; //find and print prime number up to n
		
		for(int i=1 ; i<=15 ; i++) {//outer loop to cover up to n, 
			boolean isPrime = true;
			
			if(i==1) {// 1 is not prime number
				isPrime = false;
			}
			else if(i==2) {// 2 is a prime number
				isPrime = true;
			}else {
				for(int j=2 ; j<=(i/2) ; j++) {// any number should be divided up to its half, after after result will in fraction
					if(i%j==0) {// if number divisible by other then percentile will be 0 i.e. not prime
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime) {
				System.out.println(i +",is a prmie number");
			}
		}

	}

}
