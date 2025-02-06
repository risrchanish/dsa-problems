
/* 
 	ROHAN LOVES 0 (1)
	Rohan loves 0. He has been assigned a task by his coach to check 
	whether it is possible to find a subarray in the array nums with a sum of 0.
	Rohan thinks that this task is quite easy as he knows the brute-force method, 
	but his coach has strictly instructed him to think of an optimized approach.
	
	1st parameter int [] arr is an array 
	2nd parameter n is the length of array. 
	
	Constraints:

	(1 <=nums.length <= 10^4)
	(-10^4 <=nums[i] <= 10^4)
 
 * */

/*  Thought on this approach(Brute force):
 * While finding the prefixSum starting from 0th index in order to find 0 
 * one of the previous left indices will be equal to the sum 
 * because that particular index element will be extra from 0.
 * So, I used two loops one is moving constantly towards end to find prefixSum
 * while left starts from 0 till right-1 to match the elements. 
 * If match found then return true else false.
 * 
 * Time complexity: Worst case o(n^2). 
 * 
*/

package rohanloves0;

public class Solution {
	
	static boolean isZero(int[] arr, int n) {

	      int prefixSum = 0;
	      
	      
	      for(int right = 0; right < n; right++)
	        {
	          if(arr[right] == 0)
	          {
	            return true;
	          }
	          int left = 0;
	          prefixSum += arr[right];

	          while(left < right)
	            {
	              if(prefixSum == arr[left])
	              {
	                return true;
	              }
	              left++;
	            }
	        }
	      return false;
	  }

	public static void main(String[] args) {
		
		int[] arr = {1,4,-2,-2,5,-4,3};
		int n = arr.length;
		
		System.out.println(isZero(arr,n));
	}

}
