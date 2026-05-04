package java_demo;

import java.util.Scanner;

public class nested_if_prog1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Student's Score: ");
		int score = input.nextInt();
		
		if (score >= 85)
		{
			System.out.println("Student's attendence: ");
			int att = input.nextInt();
			
			if (att >= 90) 
			{
				System.out.println("Eligible for exams");
			}
			
			else 
			{
				System.out.println("Not eligible for exams");
			}
			
		}
		
		else 
		{
			System.out.println("Disqualified");
		}

	}

}
