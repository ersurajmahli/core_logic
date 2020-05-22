package com.forgyan.patterndraw;

public class DrawLine implements Draw {

	@Override
	public void draw(String input) {
		boolean xFix = false;
		boolean yFix = false;
		boolean drawLine = false;
		System.out.println("Command :"+input);
		String[] inp = input.split(" ");
		int x1 = Integer.parseInt(inp[1]);
		int y1 = Integer.parseInt(inp[2]);
		int x2 = Integer.parseInt(inp[3]);
		int y2 = Integer.parseInt(inp[4]);

		int width = Integer.parseInt(inp[5]);
		System.out.println("Width :"+width);
		int height = Integer.parseInt(inp[6]);
		System.out.println("Height :"+height);
		
		
		System.out.println("(x1,y1):("+x1+","+y1+")");

		System.out.println("(x2,y2):("+x2+","+y2+")");
		
		if(x1==x2) {
			xFix = true;
		}
		else {
			yFix = true;
		}
		
		for(int i = 1;i<=height+2;i++) {
			for(int j=1;j<=width+2;j++) {
				if(i==1 || i==(height+2)) {
					System.out.print("-");
				}else {
					if(j==1 || j==(width+2)) {
						System.out.print("|");
					}else {
						if(yFix) {
							if((i==y1+1) && (j>=x1+1) && (j<=x2+1)) {
								drawLine = true;
								if(drawLine) {
									System.out.print("x");
								}
							}else {
								if(!drawLine) {
									yFix = true;
									System.out.print(" ");
								}else {
									System.out.print(" ");
									yFix = false;
								}
							}
						}else if(xFix){
							if(i==y1 && j<=x1+1) {
								System.out.print("X");
							}else if(i>y1 && i<=y2 && j<x1+1){
								System.out.print(" ");
							}else if(i>=y1+1 && i<=y2+1 && j==x1+1){
								System.out.print("X");
							}else {
								if(!drawLine) {
									xFix = true;
									System.out.print(" ");
								}
							}
						}else {
							System.out.print(" ");
						}
					}
				}
			}
			System.out.println();
		}
	}

}
