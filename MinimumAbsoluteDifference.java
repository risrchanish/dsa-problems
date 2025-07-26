package generalpractice;

import java.util.ArrayList;

/*
 * Given a 0-indexed integer array nums and an integer x, 
 * find the minimum absolute difference between any two elements in the array
 *  that are at least k indices apart. Return the minimum absolute difference found.

 */

import java.util.List;

public class MinimumAbsoluteDifference {
	
	public static int minAbsoluteDifference(List<Integer> nums, int x) {

	      int minDiff = Integer.MAX_VALUE;
	      for(int i = 0; i < nums.size(); i++)
	        {
	          int j = i+x;
	          while(j < nums.size())
	          {
	            int diff = Math.abs(nums.get(i) - nums.get(j));
	            if(minDiff > diff)
	            {
	              minDiff = diff;
	            }
	            j++;
	          }
	        }

	      return minDiff;
	   }

	public static void main(String[] args) {
		
		List<Integer> newList = new ArrayList<>(List.of(5,3,2,10,15));

		minAbsoluteDifference(newList,1);
	}

}
