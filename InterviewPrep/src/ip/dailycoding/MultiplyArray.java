package ip.dailycoding;

import java.util.Arrays;

public class MultiplyArray {
	/*
	 * Given an array of integers, return a new array such that each element at
	 * index i of the new array is the product of all the numbers in the original
	 * array except the one at i. For example, if our input was [1, 2, 3, 4, 5], the
	 * expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1],
	 * the expected output would be [2, 3, 6].
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiplyArray();
		
		int[] input = {2,3,5};
		
		System.out.println( Arrays.toString(multiplyArray(input)));
	}
	
	private static int[] multiplyArray(int[] input) {
		
		int[] result =new int[input.length];


		for(int i=0;i<input.length;i++) {
			result[i]= multiply(i,input);
		}
		
		return result;
	}
	
	private static int multiply(int i,int[] input) {
		int mul=1;
		
		for(int j=0;j<input.length;j++) {
			if(j!=i) {
				mul*=input[j];
			}
		}
		
		return mul;
	}

}
