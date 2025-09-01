package generalpractice;

/*
 * The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

	For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
	Given an integer array nums, choose four distinct indices w, x, y, and z such that the product 
	difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.

 
 */

public class MaxProductDiff {
	
    public static int maxProductDifference(int[] nums) {
        
        int n = nums.length;
/*
        Arrays.sort(nums); // nlog(n)

        return (nums[n-2] * nums[n-1]) - (nums[0] * nums[1])
*/

        // o(n) time complexity
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int secondMax = 0;
        int secondMin = 0;

        for(int i = 0; i < n; i++)
        {
            int maxNumber = nums[i];

            if(maxNumber > max)
            {
                secondMax = max;
                max = maxNumber;
            }
            else if(secondMax < maxNumber)
            {
                secondMax = maxNumber;
            }

            if(min > maxNumber)
            {
                secondMin = min;
                min = maxNumber;
            }
            else if(secondMin > maxNumber)
            {
                secondMin = maxNumber;
            }
        }

        return (max*secondMax - min*secondMin);
    }

	public static void main(String[] args) {
		
		int[] num = {5,6,2,7,4};
		System.out.println(maxProductDifference(num));
	}

}
