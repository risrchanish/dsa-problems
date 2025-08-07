package generalpractice;

/*
 * Given an array of n integers nums, a 132 pattern is a subsequence of 
  	three integers nums[i], nums[j], and nums[k] such that (i < j < k) and (nums[i] < nums[k] < nums[j]).
	Return true if there is a 132 pattern in nums, otherwise, return false.
 */

public class PatternMatcher {
	
	public static boolean find132pattern(int[] nums) {

	      int length = nums.length;
	      if(length < 3)
	      {
	        return false;
	      }

	      for(int i = 0; i < length; i++)
	        {
	          int j = i+2;
	          if(j < length)
	          {
	            if(nums[i] < nums[j] && nums[j] < nums[j-1])
	            {
	              return true;
	            }
	          }
	        }

	      return false;
	   }

	public static void main(String[] args) {
		
		int[] arr = {3,1,4,2};
		
		System.out.println(find132pattern(arr));

	}

}
