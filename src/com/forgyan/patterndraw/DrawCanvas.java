package com.forgyan.patterndraw;

public class DrawCanvas implements Draw {

	@Override
	public void draw(String input) {
		String[] inp = input.split(" ");
		int width = Integer.parseInt(inp[1]);
		System.out.println("Width :"+width);
		int height = Integer.parseInt(inp[2]);
		System.out.println("Height :"+height);
		
		for(int i = 1;i<=height+2;i++) {
			for(int j=1;j<=width+2;j++) {
				if(i==1 || i==(height+2)) {
					System.out.print("-");
				}else {
					if(j==1 || j==(width+2)) {
						System.out.print("|");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
