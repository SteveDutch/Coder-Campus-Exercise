package com.coderscampus.exercise;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main (String[] args) {
		System.out.println("Type a number between 50 and 300");
		//int output = 1;
		//whileLoop();
		// Scanner readInput = new Scanner (System.in);
		
//			String userInput = readInput.nextLine();
//			Integer convertedUserInput = Integer.parseInt(userInput);
			// Object output = whileLoop(convertedUserInput);
			
			System.out.println("The number you typed in was: " + whileLoop());
//			readInput.close();

	}

	private static int whileLoop() {
		//int convertedUserInput = 1;
		
		Scanner readInput = new Scanner (System.in);
		String userInput = readInput.nextLine();
		Integer convertedUserInput = Integer.parseInt(userInput);
		System.out.println(convertedUserInput + "vor");
		while (convertedUserInput > 300 || convertedUserInput < 50 ) {
			System.out.println("Oops, that number wasn't between 50 and 300, try again:");
			System.out.println(convertedUserInput + "hinter");
			convertedUserInput = 1;
			whileLoop();
		  } 
		int output = convertedUserInput;
		return output;

	}

}
