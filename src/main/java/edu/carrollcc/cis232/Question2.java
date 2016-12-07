package edu.carrollcc.cis232;

public class Question2 {

	public static void main(String[] args) {

	}

	public static boolean isPalindrome(String string) {

		String cleanedString = string.toUpperCase().replaceAll("[^A-Z0-9]", "");

		if (cleanedString.length() <= 1) {
			return true;
		}

		if (cleanedString.charAt(0) == cleanedString.charAt(cleanedString.length() - 1)) {

			String leftoverString = cleanedString.substring(1, cleanedString.length() - 1);
			
			return isPalindrome(leftoverString);
		}
		return false;
	}
}
