package NaturalLanguageCalculator;

import java.util.Scanner;

public class NLCalculator {
	
	private static double firstNumValue;
	private static double secondNumValue;
	
	private static double result = 0;
	
	//@SuppressWarnings("resource")
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	Scanner obj = new Scanner(System.in);
		
	System.out.println("Please enter a calculation:");
	String userInput = obj.nextLine();
	
	String[] tokens = userInput.split(" ");
	
	String firstNum = tokens[0];
	String operator = tokens[1];
	String secondNum = tokens[2];
	
	System.out.println("First number is " + firstNum);
	System.out.println("The operator is " + operator);
	System.out.println("Second number is " + secondNum);
	
	
	switch (firstNum){
	
	case "zero":
	case "ZERO":
		firstNumValue = 0;	 
	break;
	case "one":
	case "ONE":
		firstNumValue = 1;
	break;
	case "two":
	case "TWO":
		firstNumValue = 2;
	break;
	case "three":
	case "THREE":
		firstNumValue = 3;
	break;
	case "four":
	case "FOUR":
		firstNumValue = 4;
	break;
	case "five":
	case "FIVE":
		firstNumValue = 5;
	break;
	case "six":
	case "SIX":
		firstNumValue = 6;
	break;
	case "seven":
	case "SEVEN":
		firstNumValue = 7;
	break;
	case "eight":
	case "EIGHT":
		firstNumValue = 8;
	break;
	case "nine":
	case "NINE":
		firstNumValue = 9;
	break;
	case "ten":
	case "TEN":
		firstNumValue = 10;
	break;
}
	
	switch (secondNum){
	case "zero":
	case "ZERO":
		secondNumValue = 0;	 
	break;
	case "one":
	case "ONE":
		secondNumValue = 1;
	break;
	case "two":
	case "TWO":
		secondNumValue = 2;
	break;
	case "three":
	case "THREE":
		secondNumValue = 3;
	break;
	case "four":
	case "FOUR":
		secondNumValue = 4;
	break;
	case "five":
	case "FIVE":
		secondNumValue = 5;
	break;
	case "six":
	case "SIX":
		secondNumValue = 6;
	break;
	case "seven":
	case "SEVEN":
		secondNumValue = 7;
	break;
	case "eight":
	case "EIGHT":
		secondNumValue = 8;
	break;
	case "nine":
	case "NINE":
		secondNumValue = 9;
	break;
	case "ten":
	case "TEN":
		secondNumValue = 10;
	break;
		
}
	
	switch (operator){
	
	case "plus":
	case "PLUS":
        result = firstNumValue + secondNumValue;
        break;
		
	case "add":
	case "ADD":
		result = firstNumValue + secondNumValue;
		break;
	
	case "subtract":
	case "SUBTRACT":
		result = firstNumValue - secondNumValue;
		break;
	
	case "minus":
	case "MINUS":
		result = firstNumValue - secondNumValue;
		break;
	
	case "less":
	case "LESS":
		result = firstNumValue - secondNumValue;
		break;
	
	case "multiplied-by":
	case "MULTIPLIED-BY":
		result = firstNumValue * secondNumValue;
		break;
	
	case "times":
	case "TIMES":
		result = firstNumValue * secondNumValue;
		break;
	
	case "divided-by":
	case "DIVIDED-BY":
		if (secondNumValue == 0)
			throw new UnsupportedOperationException("Cannot divide by zero");		
			
		result = firstNumValue / secondNumValue;
		break;
	
	case "over":
	case "OVER":
		if (secondNumValue == 0)
			throw new UnsupportedOperationException("Cannot divide by zero");		
			
		result = firstNumValue / secondNumValue;
		break;
	}
	
	// Display result
	System.out.println("first number value " + firstNumValue);
	System.out.println("second number value " + secondNumValue);
	System.out.println("Result: " + result);
	
	obj.close();
	
	}
		
	
}
