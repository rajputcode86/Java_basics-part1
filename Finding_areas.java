package java_demo;

import java.util.Scanner;

public class Finding_areas {

	public static void main(String[] args) {
		// triangle, rectangle, square, circle
		
		// Triangle
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base: ");
		double base = input.nextDouble();
		
		System.out.println("Enter height: ");
		double height = input.nextDouble();
		
		// formula to calculate triangle
		double area = 0.5 * base * height;
		
		System.out.println(" Triangle area is: " + area);
		
		System.out.println("-----------------------------");
		
		// Rectangle

		System.out.println("Enter length: ");
		double length = input.nextDouble();
		
		System.out.println("Enter width: ");
		double width = input.nextDouble();
		
		// formula to find out Area
		double Tri_area = length * width;
		
		System.out.println(" Rectangle area is: " + Tri_area);
		
		System.out.println("-----------------------------");
		
		// Square

		System.out.println("Enter side: ");
		double side = input.nextDouble();
		
		
		// formula to find out Area of square
		double square_area = side * side;
		
		System.out.println(" Square area is: " + square_area);
		
		System.out.println("-----------------------------");
		
		
		// Circle

		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		
		
		// formula to find out Area of circle
		double circle_area = 3.14 *radius *radius;
		
		System.out.println(" Square area is: " + circle_area);

	}

}
