package com.forgyan.patterndraw;

import java.util.Scanner;

public class Painting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Command");
		String command = sc.nextLine();
		Draw draw = null;
		if(command.toUpperCase().startsWith("C")) {
			draw = new DrawCanvas();
			draw.draw(command);
		}else if(command.toUpperCase().startsWith("L")) {
			draw = new DrawLine();
			draw.draw(command);
		}
	}

}
