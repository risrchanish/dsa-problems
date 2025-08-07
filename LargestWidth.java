package generalpractice;

/*
 * A ramp in an integer array nums is a pair (i, j) where i < j and nums[i] <= nums[j]. 
  	The width of such a ramp is j - i.

		Given an integer array nums, return the maximum width of a ramp in nums. 
		If there is no ramp in nums, return 0.
 */

public class LargestWidth {
	
	public static int larWidthRamp(int[] nums) {

	      int length = nums.length;
	      int maxDiff = 0;

	      for(int  i = 0; i < length; i++)
	        {
	          int j = length-1;
	          while(j > i)
	            {
	              if(nums[j] > nums[i])
	              {
	                int diff = j - i;
	                maxDiff = Math.max(maxDiff,diff);
	              }
	              j--;
	            }
	        }
	      return maxDiff;

	   }

	public static void main(String[] args) {
		
		int[] arr = {6, 0, 8, 2, 1, 5};
		System.out.println(larWidthRamp(arr));

	}

}
