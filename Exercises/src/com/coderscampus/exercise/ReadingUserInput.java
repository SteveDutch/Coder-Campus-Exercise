package com.coderscampus.exercise;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main (String[] args) {
		System.out.println("Type a number between 50 and 300");
		
			System.out.println("The number you typed in was: " + whileLoop());

	}

	private static int whileLoop() {
	//vermutlich extrem umständlich - but fpr now it works!			
		Scanner readInput = new Scanner (System.in);
		String userInput = readInput.nextLine();
		Integer convertedUserInput = Integer.parseInt(userInput);
		
		int output = convertedUserInput;
		int i = convertedUserInput;
		while (i > 300 || i < 50 ) {
			System.out.println("Oops, that number wasn't between 50 and 300, try again:");
						
			String userInput2 = readInput.nextLine();
			convertedUserInput = Integer.parseInt(userInput2);
			
			i = convertedUserInput;
			output = convertedUserInput;
			
		  } 
		
		return output;

	}

}
