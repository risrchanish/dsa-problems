/*
 ROHAN LOVES 0 (2)
Rohan loves 0. He has been assigned a task by his coach to find all the indexes of an array having length n, 
such that on those indexes i, (0 <= i <= n-1), the absolute difference between PrefixSum[i] and SuffixSum[i] is 0.

Return a list of integers representing the indexes where the absolute difference between PrefixSum[i] and SuffixSum[i] is 0. 
If no such index exists, return -1.
 */



package codingpractice;
import java.util.List;
import java.util.ArrayList;

public class PrefixSumSolution {

	public static List<Integer> solve(List<Integer> arr) {

	      int prefixSum = 0;
	      int totalSum = 0;
	      int n = arr.size();
	      List<Integer> list = new ArrayList<>();    

	      if(n == 0)
	      {
	        list.add(-1);
	        return list;
	      }
	      for(int num : arr)
	        {
	          totalSum += num;
	        }

	      for(int i = 0; i < n; i++)
	        {
	          int suffixSum = totalSum - prefixSum - arr.get(i);
	          if(suffixSum == prefixSum)
	          {
	            list.add(i);
	          }

	          prefixSum += arr.get(i);
	        }
	      return list;
	    }
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(4,2,-3,1,6)); 
		System.out.println(solve(list));
	}

}
