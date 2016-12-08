package edu.carrollcc.cis232;

public class Question2 {

	public static void main(String[] args) {
		String initPhrase1 = "I saw desserts; I'd no lemons, alas no melon. Distressed was I.";
		String initPhrase2 = "Now saw ye no mosses or foam, or aroma of roses! So money was won.";
		String initPhrase3= "Ere hypocrisies or poses are in, my hymn I erase. So prose I, sir, copy here.";
		
		String x = initPhrase1;
        	if(isPalindrome(x)){
            		System.out.println(x + " is a palindrome!");
		}else{
            		System.out.println(x + " is not a palindrome.");
		}
	}
	
	public static boolean isPalindrome(String phrase){
		String interimP=phrase.toLowerCase();
		String finalPhrase=(interimP.replaceAll("[^a-z0-9]",""));
		if(finalPhrase.length() < 2){
			return true; 
		}
		if(finalPhrase.charAt(0) == finalPhrase.charAt(finalPhrase.length()-1)){
			return isPalindrome(finalPhrase.substring(1, finalPhrase.length()-1));
		}
		return false;
    	}
}
