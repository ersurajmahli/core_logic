package com.logic.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import com.logic.UintTesting.From_STRAVISO;
import com.logic.twitter.TwitterSource;

public class MyApp {

	public static void main(String[] args) {
		System.out.println(TwitterSource.booleanFromString());
		System.out.println(From_STRAVISO.bitwiseOperation());
		System.out.println(From_STRAVISO.noOfWords.apply("My name is Suraj Mahli, Your name is Sainee Kumari"));
		System.out.println(From_STRAVISO.bitWiseOperaion.get());
		
		int[] arr =  {4,5,6,7,8,9,01};
		int i = Arrays.stream(arr).sum();
		System.out.println(i);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int k = 0;k<10;k++) {
			list.add(i);
		}
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println(min.getAsInt());
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max.getAsInt());
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg.getAsDouble());
		OptionalInt secondHi = Arrays.stream(arr).findAny();
		System.out.println(secondHi.getAsInt());
	}

}
