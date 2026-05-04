package java_demo;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = input.nextInt();
		
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		
		System.out.println("Enter operator (+, -, *, /)");
		String op = input.next();
		
		switch (op) {
		case "+":
			System.out.println("Addition of a and b = " + (a+b));
			break;

		case "-":
			System.out.println("Substraction of a and b = " + (a-b));
			break;
			
		case "*":
			System.out.println("Multiplication of a and b = " + (a*b));
			break;
			
		case "/":
			System.out.println("Division of a and b = " + (a/b));
			break;
			
		default:
			System.out.println("Invalid number");
			break;
		}
		
	}

}
