package generalpractice;

import java.util.Arrays;

/*
 * There is a hidden integer array arr that consists of n non-negative integers.

	It was encoded into another integer array encoded of length n - 1, such that 
	encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

	You are given the encoded array. You are also given an integer first, 
	that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.
 */

public class XORedArray {
	
	 public static int[] decode(int[] encoded, int first) {

	        int n = encoded.length;
	        int arr[] = new int[n+1];

	        for(int i = 0; i < n; i++)
	        {
	            arr[0] = first;
	            arr[i+1] = encoded[i]^arr[i];
	        }

	        return arr;
	    }

	public static void main(String[] args) {
		
		int[] encoded = {1,2,3};
		int first = 1;
		
		
		System.out.println(Arrays.toString(decode(encoded,first)));

	}

}
