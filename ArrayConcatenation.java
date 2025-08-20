package generalpractice;
/*
 * Given an integer array nums of length n, you want to create an array ans of length 2n 
  where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

	Specifically, ans is the concatenation of two nums arrays.

	Return the array ans.
 */

public class ArrayConcatenation {
	
	public static int[] getConcatenation(int[] nums) 
	{
        
        int n = nums.length;
        int[] result = new int[2*n];
        for(int i = 0; i < n; i++)
        {
            result[i] = nums[i];
            result[i+n] = nums[i];
        }
        return result;
    }

	public static void main(String[] args) {
		
		int[] result = {1,2,1};
		
		System.out.println(getConcatenation(result));

	}

}
