package generalpractice;

public class MaxProductElements {

	 public static int maxProduct(int[] nums) {
	        
	        // O(n) time complexity
	        int max = 0;
	        int secondMax = 0;

	        for(int i = 0; i < nums.length; i++)
	        {
	            if(nums[i] >= max)
	            {
	                secondMax = max;
	                max = nums[i];
	            }
	            else if(nums[i] > secondMax)
	            {
	                secondMax = nums[i];
	            }
	        }

	        return (max-1)*(secondMax-1);
	    }
	 
	public static void main(String[] args) {
		
		int[] nums = {1,5,4,5};
		
		System.out.println(maxProduct(nums));

	}

}
