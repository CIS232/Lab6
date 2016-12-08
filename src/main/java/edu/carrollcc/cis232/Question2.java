package edu.carrollcc.cis232;

public class Question2 {

	public static void main(String[] args) {

	}
	
	//write static isPalindrome method here
	public static boolean isPalindrome(String str){
		
	String s = str.toLowerCase().replaceAll("[^a-z0-9]","");
		
	if(s.length() == 0 || s.length()==1)return true;
	
	if(s.charAt(0)==s.charAt(s.length()-1)) 
		
		return isPalindrome(s.substring(1, s.length()-1));
	
	return false;
	
}
}