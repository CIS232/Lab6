package edu.carrollcc.cis232;

public class Question1 {

	public static void main(String[] args) {
		
	}
	
	public void run() throws IllegalArgumentException {

	}

	public static int maxElement(int[] array) {
		return maxElement(array, 0);
	}

	private static int maxElement(int[] array, int index) {
		try {
			return index < array.length ? Math.max(array[index], maxElement(array, index + 1)) : Integer.MIN_VALUE;
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		return index < array.length ? Math.max(array[index], maxElement(array, index + 1)) : Integer.MIN_VALUE;
	}
}
