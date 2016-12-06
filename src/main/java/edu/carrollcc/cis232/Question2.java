package edu.carrollcc.cis232;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Palindrome:");
		String pal = keyboard.nextLine();
		if (isPalindrome(pal))
			System.out.println(pal + " is a palindrome");
		else
			System.out.println(pal + " is not a palindrome");
	}

	public static boolean isPalindrome(String string) {
		String clean = string.toUpperCase().replaceAll("[^A-Z0-9]","");
		if (clean.length() == 0 || clean.length() == 1)
			return true;
		if (clean.charAt(0) == clean.charAt(clean.length() - 1))
		
			return isPalindrome(clean.substring(1, clean.length() - 1));

		return false;
	}

}
