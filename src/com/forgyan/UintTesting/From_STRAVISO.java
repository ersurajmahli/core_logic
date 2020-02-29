package com.forgyan.UintTesting;

import java.util.function.Function;
import java.util.function.Supplier;

public class From_STRAVISO {
	
	//--------------------- Bitwise Operation Start----------------------------//
	//--------------------- JDK 7 Way ----------------------//
	public static int bitwiseOperation() {
		int t = 0;
		t = t++ + t;
		return t;
	}
	//--------------------- JDK 8 Way ----------------------//
	public static Supplier<Integer> bitWiseOperaion = ()->{
		int t = 0;
		t = t++ + t;
		return t;
	};
	//--------------------- Bitwise Operation End----------------------------//
	
	
	
	
	//--------------------- Find Number of Words in String Start----------------------------//
	//--------------------- JDK 8 Ways ----------------------//
	public static Function<String, Integer> noOfWords = (s)-> {
		String[] sArr = s.split(" ");
		bitwiseOperation();
		return sArr.length;
	};
	//--------------------- Find Number of Words in String End----------------------------//
	
	public static void main(String[] args) {
		From_STRAVISO obj = new From_STRAVISO();
		obj.bitwiseOperation();
	}
	
}
