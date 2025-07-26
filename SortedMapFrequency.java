package generalpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, your task is to implement a map that stores each number
 *  and its frequency, and then return each number with its frequency in sorted form.
.
 */

public class SortedMapFrequency {
	
	public static Map<Integer, Integer> mapImplementation(int[] arr) {

	      HashMap<Integer,Integer> resultMap = new HashMap<>();
	 
	      // sorting first
	       ArrayList<Integer> newList = new ArrayList<>();
	       for(int copied : arr)
	         {
	           newList.add(copied);
	         }
	       Collections.sort(newList);
	       
	       // getting the map with frequency
	      
	      for(int copied : arr)
	        {
	          Integer value = resultMap.get(copied);

	          if(value == null)
	          {
	            resultMap.put(copied,1);
	          }
	          else
	          {
	            resultMap.put(copied,value+1);
	          }
	        }

	      return resultMap;

	  }

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,1,3,3};
		
		mapImplementation(arr);
	}

}
