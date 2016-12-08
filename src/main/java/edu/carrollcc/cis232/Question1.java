package edu.carrollcc.cis232;

import static org.junit.Assert.assertNotNull;

public class Question1 {

	public static void main(String[] args)
	{
			int[] array = {1,20,3,4,5};
			System.out.println(maxElement(array));
	}
	
	public static int maxElement(int[] numbers) throws IllegalArgumentException{
		if (numbers == null)
		{
			throw new IllegalArgumentException();
		}
		else if (numbers.length == 0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			return findMax(numbers, 0, numbers.length - 1, numbers[0]);
		}
		
		
			
	}
	
	public static int findMax(int[] numbers, int startIndex, int endIndex, int max){
		if(startIndex > endIndex){
			return max;
		}
		
		if(numbers[startIndex] > max){
			max = numbers[startIndex];
		}
			
		return findMax(numbers, startIndex + 1, endIndex, max);
	}
}
