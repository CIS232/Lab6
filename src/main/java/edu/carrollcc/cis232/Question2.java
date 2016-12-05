package edu.carrollcc.cis232;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Palindrome:");
		String pal = keyboard.nextLine();
		if (isPalindrome(pal))
			System.out.println(pal + " is a palindrome");
		else
			System.out.println(pal + " is not a palindrome");*/
	}

	public static boolean isPalindrome(String string) {
		if (string.replaceAll("[^0-9]","").toLowerCase().length() == 0 || string.replaceAll("[^0-9]","").toLowerCase().length() == 1)
			return true;
		if (string.toLowerCase().charAt(0) == string.toLowerCase().charAt(string.length() - 1))
		
			return isPalindrome(string.substring(1, string.length() - 1));

		return false;
	}

}
