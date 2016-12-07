package edu.carrollcc.cis232;

public class Question1 {

	static int largestnumber;

	public static void main(String[] args) {
		int[] numbers = { -100, -8, -1000, -8888 };
		System.out.println(maxElement(numbers));
	}

	public static int maxElement(int[] numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("Empty Array");
		}
		if (numbers.length == 1) {
			return numbers[0];
		}
		return maxElement(numbers, numbers.length-1);
	}

	public static int maxElement(int[] numbers, int index) {
		
		if (index >= 0){
			if (index < numbers.length - 1) {
				if (largestnumber > numbers[index]){
					maxElement(numbers, index -1);
				}else{
					largestnumber = numbers[index];
					maxElement(numbers, index - 1);
				}
			} else {
				if (numbers[index] > numbers[index - 1]) {
					largestnumber = numbers[index];
					
				} else {
					largestnumber = numbers[index - 1];
				}
			}
			maxElement(numbers, index - 1);
		}
		
		return largestnumber;
	}
}
