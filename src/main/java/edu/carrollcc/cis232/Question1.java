package edu.carrollcc.cis232;

public class Question1 {

	public static void main(String[] args) {
		int [] numbers = { -100, -8, -1000, -8888};
		
		System.out.println(maxElement(numbers));
	}
	
	public static int maxElement(int[] numbers){
		if (numbers == null || numbers.length == 0){
			throw new IllegalArgumentException();
		}
		return maxElement(numbers, 0, numbers.length - 1, numbers[0] );
	}
	//Write static maxElement method here
	public static int maxElement(int[] numbers, int first, int last, int max){
		
		if (first>last){
			return max;
		}
		else if (numbers[first]> max){
			max = numbers[first];
		}
		
		return maxElement(numbers, first + 1, last, max);
		
	}
}
