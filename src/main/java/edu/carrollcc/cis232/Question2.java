package edu.carrollcc.cis232;

public class Question2 {

	public static void main(String[] args) {
String t="Kayak";
System.out.println(isPalindrome(t));
	}
	public static boolean isPalindrome(String s)  {
		
		return isPalindrome(s,s.indexOf(0)+1,s.length()-1);
	
		
	}
	public static boolean isPalindrome (String s,int index, int base )throws StringIndexOutOfBoundsException
	{
		//index=s.indexOf(0);
		//base=s.lastIndexOf(s.length());
		if(s.length()<0){
			return false;
		}
		if(s.isEmpty()){
			return true;
			
		}
		if(s.toUpperCase().charAt(index)==s.toUpperCase().charAt(base)){
			
			return false;
			
		}
		
		else{
			return false;
		}
	}
	//write static isPalindrome method here
}
