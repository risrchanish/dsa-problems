package generalpractice;

/*
 * Given an array of integers of length N and a target integer x, your task is to find the last index at which x appears in the array. If x is not found, return -1.

You must solve this recursively, and the array should be traversed from index 0 (not from the end).


 */

public class LastIndex {
	
	public static int lastIndex(int[] arr, int x) {

	      int lastIndex = -1;
	      for(int i = 0; i < arr.length; i++)
	        {
	          if(arr[i] == x)
	          {
	            lastIndex = i;
	          }
	        }
	      return lastIndex;
	    }

	public static void main(String[] args) {
		

		int arr[] = {1,2,3,2,5};
		lastIndex(arr,2);
	}

}
