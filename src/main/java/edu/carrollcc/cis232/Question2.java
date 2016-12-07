package edu.carrollcc.cis232;

public class Question2 {

	public static void main(String[] args) {
		String initPhrase1 = "I saw desserts; I'd no lemons, alas no melon. Distressed was I.";
		String initPhrase2 = "Now saw ye no mosses or foam, or aroma of roses! So money was won.";
		String initPhrase3= "Ere hypocrisies or poses are in, my hymn I erase. So prose I, sir, copy here.";

		String finalPhrase=(initPhrase1.replaceAll("[-+.'|{};?! ^:,]","")).toLowerCase();
		
        	if(isPalindrome(finalPhrase)){
            		System.out.println(initPhrase1 + " is a palindrome!");
		}else{
            		System.out.println("That's not a palindrome.");
		}
	}
	
	public static boolean isPalindrome(String phrase){
		if(phrase.length() < 2){
			return true; 
		}
		if(phrase.charAt(0) == phrase.charAt(phrase.length()-1)){
			return isPalindrome(phrase.substring(1, phrase.length()-1));
		}
		return false;
    	}
}
