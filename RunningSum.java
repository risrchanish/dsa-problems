package generalpractice;

import java.util.Arrays;

/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

	Return the running sum of nums.

 
 */

public class RunningSum {
	
		public static int[] runningSum(int[] nums) 
		{
        
			int sum = 0;
			int n = nums.length;
			int[] runningSum = new int[n];

			for(int i = 0; i < n; i++)
			{
				sum += nums[i];
				runningSum[i] = sum;
			}
			return runningSum;
		}

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		System.out.println(Arrays.toString(runningSum(nums)));
	}

}
