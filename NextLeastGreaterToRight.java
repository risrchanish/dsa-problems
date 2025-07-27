package generalpractice;

import java.util.ArrayList;

/*
 * 
 * Given an array nums of n integers, replace every element with the 
 * least greater element on its right side in the array. 
 * If there are no greater elements on the right side, replace it with -1.
 */

public class NextLeastGreaterToRight {
	
	public static ArrayList<Integer> findLeastGreater(int[] arr) {

	      ArrayList<Integer> resultList = new ArrayList<>();

	      for(int i = 0; i < arr.length; i++)
	        {
	          int leastGreat = Integer.MAX_VALUE;
	          int j =  i+1;

	          while(j < arr.length)
	            {
	              if(arr[i] < arr[j] && leastGreat > arr[j])
	              {
	                leastGreat = arr[j];
	              }
	              
	              j++;
	            }
	          if(leastGreat == Integer.MAX_VALUE)
	          {
	            leastGreat = -1;
	          }

	          resultList.add(leastGreat);
	        }

	      return resultList;

	    }


	public static void main(String[] args) {
		
		int arr[] = {8,58,71,18,31,32,63,92,43,3,91,93,25,80,28};
		
		findLeastGreater(arr);

	}

}
