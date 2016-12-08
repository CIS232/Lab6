package edu.carrollcc.cis232;

//Write a static boolean method named isPalindrome that uses recursion to determine
//whether a String argument is a palindrome. The method should return true if the
//argument reads the same forward and backwards. Demonstrate the method in the
//Question2 main method.
//HINT: Clear the string of any symbols and spaces. Make the letters the same case.
//Start by checking the first letter matches the last letter and recurse to check
//that the second letter matches the second to last letter and so on until there
//is one or no letters to check.

public class Question2 {

	public static void main(String[] args) {

	}
	
	public static boolean isPalindrome(String p)
    {
        String string = p.toLowerCase().replaceAll("[a-z0-9]", string);	//clear string
        if(string.length() == 0 || string.length() == 1)
        	return true;
        if(string.charAt(0) == string.charAt(string.length() - 1)) 	//unsure about this line
        	return isPalindrome(string.substring(1, string.length() - 1));		//and this line
        return false;
    }
}