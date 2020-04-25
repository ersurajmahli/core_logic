package com.forgyan.logic;

public class SumNUmberInsideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "suraj 5 kapil 6 8";
		String[] splt = s.split(" ");
		int sum = 0;
		for(int t=0; t<splt.length; t++) {
			try {
				sum += Integer.parseInt(splt[t]);
			}catch (Exception e) {
				// TODO: handle exception
				//e.printStackTrace();
			}
		}
		System.out.println(sum);
	}

}
