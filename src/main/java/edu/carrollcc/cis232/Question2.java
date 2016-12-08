package edu.carrollcc.cis232;

import java.util.StringTokenizer;

public class Question2 {

	public static void main(String[] args) {
		String palindrome = "RaCecar";
		
		StringTokenizer tokens = new StringTokenizer(palindrome, " !@#$%^&*()_-+.,><?/'`~{}[]");
		
		while(tokens.hasMoreTokens()){
			String token = tokens.nextToken();
			System.out.printf(palindrome, token);
			
			if(isPalindrome(palindrome.toLowerCase()))
	            System.out.println(palindrome + " is a palindrome");
	        else
	            System.out.println(palindrome + " is not a palindrome");
		}
	}
	
	//write static isPalindrome method here
	public static boolean isPalindrome(String palindrome){
		
		StringTokenizer tokens = new StringTokenizer(palindrome, " !@#$%^&*()_-+.,><?/'`~{}[]");
		
		if(palindrome.length() == 0 || palindrome.length() == 1){
		     return true; 
		}

        if(palindrome.charAt(0) == palindrome.charAt(palindrome.length()-1)){
        	return isPalindrome(palindrome.substring(1, palindrome.length()-1));

           
        }
		
		
		return false;
		
	}
}
