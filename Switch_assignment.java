package java_demo;

import java.util.Scanner;

public class Switch_assignment {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter salary: ");
		int salary1 = input.nextInt();
		
		System.out.println("Enter salary2: ");
		int salary2 = input.nextInt();
		
		System.out.println("Enter salary3: ");
		int salary3 = input.nextInt();
		
		System.out.println("Display salary: ");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Salary: "+salary1);
			break;

		case 2:
			System.out.println("Salary: "+salary2);
			break;
			
		case 3:
			System.out.println("Salary: "+salary3);
			break;
					
		default:
			System.out.println("Invalid number");
			break;
		

		}

	}

}
