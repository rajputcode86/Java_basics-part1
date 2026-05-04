package java_demo;

import java.util.Scanner;

public class Ternary_op1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the alphabets: ");
		String alpb = input.next();
		
		String result = (alpb.equals("a") || alpb.equals("e") || alpb.equals("i") || alpb.equals("o") || alpb.equals("u"))?"Vowel":"Const";
		System.out.println(result);

	}

	}


