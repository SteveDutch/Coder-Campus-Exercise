package com.coderscampus.exercise;

import java.util.Scanner;

public class WhileLoop {
	public void loopWhile (int i) {
		
		while (i < 50 || i > 300) {
			System.out.println("Oops, that number wasn't between 50 and 300, try again:");Scanner readInput = new Scanner (System.in);
			String userInput = readInput.nextLine();
			Integer convertedUserInput = Integer.parseInt(userInput);
			//Object output = getMessage(convertedUserInput);
			
			i = convertedUserInput;
		}
	}
}
