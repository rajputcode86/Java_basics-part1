package java_demo;

import java.util.Scanner;

public class nested_if {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the age: ");
		int age = input.nextInt();
		
		
		if (age >= 18) {
			
			System.out.println("Enter the weight: ");
			int weight = input.nextInt();
			
			if (weight >= 60) 
			{
				System.out.println("Eligible for blood donate");
			}
			
			else
			{
				System.out.println("Not eligible for blood donation");
			}
			
		}
		
		else 
		{
			System.out.println("Under age");
		}
			
			
		
	
	}

}
