package edu.carrollcc.cis232;

public class Question1 {

	public static void main(String[] args) {

	}

	public static int maxElement(int[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Empty Array");
		}
		return maxElement(array, 0);
	}

	private static int maxElement(int[] array, int index) {
		return index < array.length ? Math.max(array[index], maxElement(array, index + 1)) : Integer.MIN_VALUE;

	}
}
