package com.qa.main;

import java.util.Scanner;

public class Runner {
	
	
	
	public static void main(String[] args) {
		
		int number;
		int number2;
		int Answer;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert first number here");
		number = input.nextInt();
		System.out.println("Insert second number here");
		number2 = input.nextInt();
		input.nextLine();
		System.out.println("What method are you using? (+,-,*,/)");
		char operator = input.nextLine().charAt(0);
		
		if (operator == '+') {
			Answer = (number +number2);
			System.out.println("Answer="+Answer);
			
		}
		if(operator == '-') {
			Answer = (number-number2);
			System.out.println("Answer=" + Answer);
		}
		if (operator == '*') {
			Answer = (number + number2);
			System.out.println("Answer=" + Answer);
			
		}
		if (operator == '/') {
			Answer = (number + number2);
			System.out.println("Answer=" + Answer);
		}
		
		
	
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
