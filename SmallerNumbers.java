package generalpractice;

import java.util.Arrays;
import java.util.HashMap;

/*
  Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
  That is, for each nums[i] you have to count the number of valid j's 
  such that j != i and nums[j] < nums[i].

	Return the answer in an array.
 */

public class SmallerNumbers {
	
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
	        
	        int n = nums.length;
	        int[] result = new int[n];

	        HashMap<Integer,Integer> hashMap = new HashMap<>();
	        int[] sorted = nums.clone();
	        Arrays.sort(sorted);

	        for(int i = 0; i < n; i++)
	        {
	           if(hashMap.containsKey(sorted[i]))
	           {
	            hashMap.put(sorted[i],hashMap.get(sorted[i-1]));
	           }
	           else
	           {
	            hashMap.put(sorted[i],i);
	           }
	           
	        }

	        for(int i = 0; i < n; i++)
	        {
	            result[i] = hashMap.get(nums[i]);
	        }
	        return result;
	    }


	public static void main(String[] args) {
		
		int[] arr = {8,1,2,2,3};
		
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

	}

}
