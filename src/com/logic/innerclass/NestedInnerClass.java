package com.logic.innerclass;

class Outer{
	private static int t = 9;
	public int t2 = 98;
	 class Inner{
		public int t1 = 8;
		public void show() {
			System.out.println("Inner Class :"+t);
		}
		
		public  void name() {
			
		}
	}
	
	public void show() {
		System.out.println("Outer Class "+t2);
	}
	
}

public class NestedInnerClass {

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.show();
		System.out.println(in.t1);
		
		Outer out = new Outer();
		out.show();
		System.out.println("---------------- :"+out.t2);
	}

}
