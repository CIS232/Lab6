package edu.carrollcc.cis232;

//Write a static method named maxElement in edu.carrollcc.cis232. Question1 class
//that takes only an int[] as an argument and returns the largest value. The method
//should use recursion to find the largest element. If the int[] argument has no
//elements or is null, throw an IllegalArgumentException. Demonstrate the method in
//the Question1 main method.
//HINT: Pass the max element as an argument in the recursive call. If the next value
//beats it, replace the max for the next recursive call.

public class Question1 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};		//call
		System.out.println(maxElement(numbers));
	}

	public static int maxElement(int[] numbers){
		if(numbers == null || numbers.length == 0){		//b
			throw new IllegalArgumentException();
		}
		return maxElement(numbers, numbers.length - 1, 0, 0);
	}
	
	public static int maxElement(int[] numbers, int startIndex, int endIndex, int m){ //Put my trust in FindLongestString
		if(startIndex > endIndex){
			return m;
		}
		if(numbers[startIndex] > m){
			m = numbers[startIndex];
		}
		
		return maxElement(numbers, startIndex + 1, endIndex, m);
	}
}