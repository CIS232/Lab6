package edu.carrollcc.cis232;

public class Question1 {

	public static void main(String[] args) throws IllegalArgumentException {

	}

	// Write static maxElement method here
	public static int maxElement(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Error");
		}
		return maxElement(numbers, 0);
	}

	public static int maxElement(int[] numbers, int i) {
		if (i > 0) {
			return Math.max(numbers[i], maxElement(numbers, i - 1));
		} else {
			return numbers[0];
		}

	}
}