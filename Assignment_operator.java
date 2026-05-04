package java_demo;

import java.util.Scanner;

public class Assignment_operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input x: ");
		int x = sc.nextInt();
		
		System.out.println("Input y: ");
		int y = sc.nextInt();
		
		System.out.println(x +" and "+ y);
		
		System.out.println(x*=y);
		System.out.println(x/=y);
		System.out.println(x%=y);

		

		
	}

}
