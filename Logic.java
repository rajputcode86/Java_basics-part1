package java_demo;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter th evalue of x: ");
		int x = s.nextInt();
		System.out.println("Enter th evalue of y: ");
		int y = s.nextInt();
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x!=y | x<=y);
		System.out.println(x!=y | x==y);
		System.out.println(x==y | x<=y);
		System.out.println(x!=y | x<=y);
		
		
	}

}
