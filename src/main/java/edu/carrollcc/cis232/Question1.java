package edu.carrollcc.cis232;

public class Question1 {

	public static void main(String[] args) throws IllegalArgumentException{
		int[] x = new int[]{4,8,15,16,23,42};
		System.out.println(MaxElement(x,(x.length-1)));
	}

	//Write static maxElement method here
	public static int MaxElement(int[] array, int counter) throws IllegalArgumentException
	{
	    if (counter > 0) 
	    {
	        return Math.max(array[counter], MaxElement(array, counter-1));
	    } else 
	    {
	        return array[0];
	    }
	}
}
