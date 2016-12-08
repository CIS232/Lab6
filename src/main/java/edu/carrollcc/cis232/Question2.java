package edu.carrollcc.cis232;

public class Question2 {

	public static void main(String[] args) {
		String phrase = "12345";
		
		
		
		System.out.println(isPalindrome(phrase));
	//	System.out.println(findLongest(phrase));
	}
	
	public static boolean isPalindrome(String input)
	{
		boolean palindrome = false;
		input = input.replaceAll("[^a-zA-Z0-9]+", "");
		input = input.replaceAll(" ", "");
		input = input.toLowerCase();
		String reversedInput = reverse(input);
		
		if (input.equals(reversedInput))
		{
			palindrome = true;
		}
		
		return palindrome;
	}
	
	public static String reverse(String input){
		if(input == null || input.length() == 0){
			return input;
		}
		
		char lastLetter = input.charAt(input.length()-1);
		
		return String.valueOf(lastLetter) + reverse(input.substring(0, input.length() - 1));
	}

}
