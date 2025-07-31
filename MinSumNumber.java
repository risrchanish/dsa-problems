package generalpractice;

/*
 * You are given a task to minimize the total outcome of a sum of numbers. 
 * You can perform one operation that is you can choose a number 'k' and get 
 * absolute difference of k with every individual number that forms the sum.
For example: suppose the numbers are (1,2,3) then you can choose a k to perform 
the following operation to minimize the outcome:- |1-x| + |2-x| +|3-x| = result. 
Your task is to minimize the result.

Constraints:

1<=n<=10^5

1<=a[i]<=10^5


 */

public class MinSumNumber {
	public static int solve(int[] arr) {

	      int sum = 0;
	      int minSum = Integer.MAX_VALUE;
	      int length = arr.length;
	      int required = 0; 

	      for(int i = 0; i < length; i++)
	        {
	          int j = 0;
	          int k = arr[i];
	          while(j < length)
	            {
	              sum = sum + Math.abs(k - arr[j]);
	                j++;
	            }
	          if(minSum > sum)
	          {
	            required = arr[i];
	            minSum = sum;
	          }
	        }
	      return required;
	  }

	public static void main(String[] args) {
		
		int[] arr = {1,6};
		System.out.println(solve(arr));

	}

}
