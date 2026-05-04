package java_demo;

import java.util.Scanner;

public class Marriage_app {

	public static void main(String[] args) {
					
				Scanner input = new Scanner(System.in);

				System.out.println("Enter age: ");
				int age = input.nextInt();

				if (age >= 50 && age <= 100) {
					System.out.println("Your age is "+age+" and you are too old to marry");
				}
				
				else if(age >= 30 && age <= 50)
				{
					System.out.println("Your age is "+age+" and you are a perfect match to marry");
				}
				
				else if (age >= 18 && age <= 30)
				{
					System.out.println("Your age is "+age+" and you are too young to marry");
				}
				
				else if(age <= 18)
				{
					System.out.println("It's school time");
				}
				else
				{
					System.out.println("Invalid input");
				}
				
			}


}
