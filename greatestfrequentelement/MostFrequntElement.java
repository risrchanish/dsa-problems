package greatestfrequentelement;


/*
 * You have been given an array of elements. You need to return the most frequent element. 
 * In case of more than one element having the same highest frequency, return the smallest of those elements.
 * 
 * Sample Input:
 * 5 5 5 6 6 6 7 7 8
 * Sample Output:
 * 5
 */


import java.util.HashMap;
import java.util.Map;


public class MostFrequntElement {
	
	public static int mostFrequent(int [] arr)
	{
		// Using a map value to count the frequency of each key(array element) 
		Map<Integer, Integer> map = new HashMap<>();
	      int greater = 0;
	      int updatedValue = 0;

	      for(int copy : arr)
	        {
	          Integer value = map.get(copy);
	          if(value == null)
	          {
	            map.put(copy,1);
	          }
	          else
	          {
	            map.put(copy, value + 1);
	          }
	          if(map.get(copy) > greater)
	          {
	            greater = map.get(copy);
	            updatedValue = copy;
	          }
	          else if(map.get(copy) == greater && updatedValue > copy)
	          {
	            updatedValue = copy;
	          }
	        }
	      return updatedValue;
	}

	public static void main(String[] args) {
		
		int[] arr = {5 ,5 ,5 ,6 ,6 ,6 ,7 ,7 ,8};
		System.out.println(mostFrequent(arr));
		
	}

}
