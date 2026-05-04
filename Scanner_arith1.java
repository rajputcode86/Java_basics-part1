package java_demo;

import java.util.Scanner;

public class Scanner_arith1 {

	public static void main(String[] args) {
		
	Scanner input= new Scanner (System.in);
	

	System.out.print("Enter ID 1: ");
	int id1 = input.nextInt();
	System.out.println("Enter name: ");
	String name1 = input.next();
	System.out.println("Enter salary: ");
	int salary1 = input.nextInt();
	
	
	System.out.print("Enter ID2: ");
	int id2 = input.nextInt();
	System.out.println("Enter name2: ");
	String name2 = input.next();
	System.out.println("Enter salary2: ");
	int salary2 = input.nextInt();
	
	
	System.out.print("Enter ID3: ");
	int id3 = input.nextInt();
	System.out.println("Enter name3: ");
	String name3 = input.next();
	System.out.println("Enter salary3: ");
	int salary3 = input.nextInt();
	
		System.out.println("ID"+"\t"+"Name"+"\t"+"Salary"+"\t"+"\n" );
		System.out.println(id1+"\t"+name1+"\t"+salary1+"\t" );
		System.out.println(id2+"\t"+name2+"\t"+salary2+"\t" );
		System.out.println(id3+"\t"+name3+"\t"+salary3+"\t" );
	}
	

}
