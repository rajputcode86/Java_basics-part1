package java_demo;

import java.util.Scanner;

public class else_if_vowels {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter char: ");
		
		char ch = input.next().charAt(0);
		ch = Character.toLowerCase(ch);
		
		if (ch == 'a'||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Const");
		}
		

	}

}
