package java_demo;

import java.util.Scanner;

public class Switch_prog2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter colors and choose between (red, yellow, white, black, green): ");
		String color = input.next();
		
		switch (color) {
		case "red":
			System.out.println("Red rose");
			break;
			
		case "yellow":
			System.out.println("Yellow sunflower");
			break;
			
		case "white":
			System.out.println("White Tiger");
			break;
			
		case "black":
			System.out.println("Black panther");
			break;
			
		case "green":
			System.out.println("Green Army");
			break;

		default:
			System.out.println("Not Valid");
			break;
		}

	}

}
