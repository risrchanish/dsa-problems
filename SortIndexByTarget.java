package generalpractice;

/*
 * You are given a 0-indexed integer array nums and a target element target.

	A target index is an index i such that nums[i] == target.

	Return a list of the target indices of nums after sorting nums in non-decreasing order. 
	If there are no target indices, return an empty list. 
	The returned list must be sorted in increasing order.

 
 */

import java.util.ArrayList;
import java.util.List;

public class SortIndexByTarget {
	
public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> targetList = new ArrayList<>();
        int n = nums.length;
        int match = 0;
        int smaller = 0;

    // Counting the smaller numbers than target

        for(int i = 0; i < n; i++)
        {
            if(nums[i] == target)
            {
                match++;
            }
            else if(nums[i] < target)
            {
                smaller++;
            }
        }

        // Adding smaller count till the total matched count

        for(int i = 0; i < match; i++)
        {
            targetList.add(smaller); 
            smaller++;
        }

        return targetList;
    }

	public static void main(String[] args) {
		
		int[] arr = {1,2,5,2,3}; 
		int target = 2;
		
		System.out.println(targetIndices(arr,target));

	}

}
