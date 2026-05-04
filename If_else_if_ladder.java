package java_demo;

import java.util.Scanner;

public class If_else_if_ladder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("English: ");
		int eng = input.nextInt();
		
		System.out.println("Math: ");
		int math = input.nextInt();
		
		System.out.println("Sci: ");
		int sci = input.nextInt();

		//Total
		int avg = (eng + math + sci)/3;

		System.out.println(avg);
		
		System.out.println("Total = " + avg);

		if (avg >= 95)
		{
			System.out.println("Dist");
		}
		else if(avg >= 85)
		{
			System.out.println("First");
		}
		
		else if (avg >= 70)
		{
			System.out.println("Second");
		}
		
		else if(avg >= 50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
