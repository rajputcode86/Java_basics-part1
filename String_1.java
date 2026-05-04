package java_demo;

public class String_1 {

	public static void main(String[] args) {
		
		String word= "Superntural";
		String word2="Life";
		String word3= "Superntural";
		
		System.out.println(word.length());
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
		System.out.println(word.concat(word2));
		System.out.println(word.equals(word2));
		System.out.println(word.equalsIgnoreCase(word3));
		System.out.println(word.contains(word3));
		System.out.println(word.charAt(0));
		System.out.println(word.replaceAll(word3, word2));
		System.out.println(word.indexOf(word3));
		

	}

}
