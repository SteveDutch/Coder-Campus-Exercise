package com.coderscampus.exercise;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main (String[] args) {
		System.out.println("Type a number between 50 and 300");
			
			System.out.println("The number you typed in was: " + whileLoop());

	}

	private static int whileLoop() {
				
		Scanner readInput = new Scanner (System.in);
		String userInput = readInput.nextLine();
		Integer convertedUserInput = Integer.parseInt(userInput);
		System.out.println(convertedUserInput + "before loop");
		
		while (convertedUserInput > 300 || convertedUserInput < 50 ) {
			System.out.println("Oops, that number wasn't between 50 and 300, try again:");
			System.out.println(convertedUserInput + "inside loop");
			
			whileLoop();
		  } 
		int output = convertedUserInput;
		return output;

	}

}
