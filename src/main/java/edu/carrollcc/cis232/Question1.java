package edu.carrollcc.cis232;
public class Question1 {

	public static void main(String[] args) {
		int[]t={1,24,676,2};
		t= null;
		System.out.println(maxElement(t));
		
	}

	//Write static maxElement method here
	 public static int maxElement(int[] n )throws IllegalArgumentException{
		 if(n==null||n.length==0){
			 throw new IllegalArgumentException();
		 }
		 return maxElement(n,0,0);
		 
	 }
	 public static int maxElement(int[] n, int index, int maxElement){
		 if (index< n.length){
			 if( n[maxElement]< n[index]){
				maxElement= index;
				 
			 }
			 return maxElement(n, index+1,maxElement);
		 }
		 else{
			 return n[maxElement];
		 }
	 }
}
