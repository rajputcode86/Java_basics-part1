package java_demo;

import java.util.Scanner;

public class nested_if_prog2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		if (age >= 18) 
		{
			System.out.println("Choose between Germany and Sweden");
			System.out.println("What's your citizenship: ");
			
			String country = input.next();
						
			if (country.equals("Germany") || country.equals("Sweden")) 
			{
				System.out.println("Eligible to vote in European union");
			}
			
			else 
			{
				System.out.println("You can't vote");
			}
				
		}
		
		else
		{
			System.out.println("You are under age");
		}

	}

}
