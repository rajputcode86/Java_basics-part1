package java_demo;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		System.out.println("Enter age: ");
		int age = input.nextInt();
		
		if (age % 2 == 0)
		{
			System.out.println("It's even");
		}
		
		else
		{
			System.out.println("It's odd");
		}

	}

}
