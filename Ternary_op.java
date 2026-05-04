package java_demo;

import java.util.Scanner;

public class Ternary_op {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = input.nextInt();
		
		String result = (age >= 20)?"Valid":"Invalid";
		System.out.println(result);

	}

}
