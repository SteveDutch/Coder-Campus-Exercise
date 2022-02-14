package com.coderscampus.exercise;

import java.util.Scanner;

public class ReadingUserInput {
//vermutlich nicht schön, but it works
	public static void main (String[] args) {
		//wow! thanks to an IDE, daher der Vorschlag des TRY (und mehr verstanden habe ich es dadurch auch)
		Scanner readInput = new Scanner (System.in);		
			System.out.println("Type a number between 50 and 300");
			String userInput = readInput.nextLine();
			Integer convertedUserInput = Integer.parseInt(userInput);
			readInput.close();
			System.out.println(convertedUserInput.getMessage());			
			
			 /*catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("that wasn't a number! programm terminates with showing the Stacktrace now!!");
			e.printStackTrace();
		}*/
	}

}
	
