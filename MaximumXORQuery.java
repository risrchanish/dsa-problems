package generalpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You are given a sorted array nums of n non-negative integers and 
 * an integer maximumBit. You want to perform the following query n times:

	Find a non-negative integer k < 2maximumBit such that 
	nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k is maximized. 
	k is the answer to the ith query.
	Remove the last element from the current array nums.
	Return an array answer, where answer[i] is the answer to the ith query.
 */

public class MaximumXORQuery {
	
public static int[] getMaximumXor(int[] nums, int maximumBit) {
        
        List<Integer> arrayList = new ArrayList<>();      
        int n = nums.length;
        int xorSum = 0;
        int max = (int)Math.pow(2,maximumBit) - 1;
        

        for(int i = 0; i < n; i++)
        {
            xorSum = xorSum ^ nums[i];
            arrayList.add(xorSum);

        }

        int[] result = new int[n];

        for(int i = 0; i < n; i++)
        {
            result[n-i-1] = max - arrayList.get(i);
        }

        return result;
    }

	public static void main(String[] args) {
		

		int[] num = {2,3,4,7};
		int maxBit = 3;
		
		System.out.println(Arrays.toString(getMaximumXor(num,maxBit)));
	}

}
