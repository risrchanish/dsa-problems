package generalpractice;

import java.util.HashMap;

/*
 * You have been given an array of elements. You need to return the most frequent element. 
 * In case of more than one element having the same highest frequency, 
 * return the smallest of those elements.
 */

public class MostFrequestElement {
	
	public static int MostFrequent(int[] arr) {

	      HashMap<Integer,Integer> frequency = new HashMap<>();
	      int maxRepeat = 0;
	      int largeValue = 0;
	      

	      for(int copied : arr)
	        {
	          Integer value = frequency.get(copied);
	          if(value == null)
	          {
	            frequency.put(copied,1);
	          }
	          else
	          {
	            frequency.put(copied,value+1);
	          }

	          Integer storedValue = frequency.get(copied);
	          if(maxRepeat < storedValue)
	          {
	            maxRepeat = storedValue;
	            largeValue = copied;
	          }
	// If I am further getting smaller values with same frequency
	          else if(maxRepeat == storedValue && largeValue > copied)
	            {
	              largeValue = copied;
	            }
	        }

	      return largeValue;

	  }

	public static void main(String[] args) {
		

		int arr[] = {5,5,5,6,6,6,7,7,8};
		MostFrequent(arr);
		
	}

}
