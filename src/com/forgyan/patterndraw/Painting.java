package com.forgyan.patterndraw;

import java.util.Scanner;

public class Painting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Command");
		String command = sc.nextLine();
		
		if(command.toUpperCase().startsWith("C")) {
			Draw draw = new DrawCanvas();
			draw.draw(command);
		}
	}

}
