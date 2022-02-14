package com.coderscampus.exercise;

import java.util.Scanner;

public class ReadingUserInput {
//vermutlich nicht schön, but it works
	public static void main (String[] args) {
		Scanner readInput = new Scanner (System.in);		
			System.out.println("Type a number between 50 and 300");
			String userInput = readInput.nextLine();
			Integer convertedUserInput = Integer.parseInt(userInput);
			Object output = getMessage(convertedUserInput);
			System.out.println("The number you typed in was: " + output);			
			readInput.close();
			
	}

	private static Object getMessage(Integer param) { 
		if (param >= 50 && param <= 300) {
		  return param; 
		  } else {param = null;} 
		return param;
  
	}

}
	
