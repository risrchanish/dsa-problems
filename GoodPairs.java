package generalpractice;
/*
 * Given an array of integers nums, return the number of good pairs.

	A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 */

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
	
		// Helper method
	    private static int pairCount(int count)
	    {
	        
	        if(count <= 1)
	        {
	           return 0;
	        }

	      return (count-1) + pairCount(count-1);

	   // This is sum of first K natural numbers

	      /*
	      So, first n natural numbers formula is 

	        So, this recursive call we can replace by this. 
	            (n*(n-1))/2.
	      */

	      // return (count*(count-1))/2;
	    }

	    public static int numIdenticalPairs(int[] nums)
	    {
	        
	    	int calculate = 0;
	    	
	        Map<Integer, Integer> hashMap = new HashMap<>();
	        
	        for(int i = 0; i < nums.length; i++)
	        {
	        	Integer value = hashMap.get(nums[i]);

	        	if(value == null)
	        	{
	        		hashMap.put(nums[i], 1);
	        	}
	        	else
	        	{
	        		hashMap.put(nums[i], value+1);
	        	}
	       }

	        for(Integer keys : hashMap.values())
	        {
	        	calculate += pairCount(keys);
	        }

	        return calculate;

	    }   

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1,1,3};
		
		System.out.println(numIdenticalPairs(nums));

	}

}
