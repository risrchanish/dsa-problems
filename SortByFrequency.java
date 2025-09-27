package medium.leetcode;

/*
 * 
 */

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.*;

public class SortByFrequency {
	
	  public String frequencySort(String s) {
	        
	        /*
	            1. Convert the array into character array.
	            2. Use HashMap to count the frequencies.
	            3. Get the map shorted based on frequencies in descending order
	            3. Take a entrySet and get the keys and values.
	            4. return the String.
	        */
	        char[] chars = s.toCharArray();
	        Map<Character,Integer> hashMap = new HashMap<>();

	        for(char ch : chars)
	        {
	            Integer value = hashMap.get(ch);
	            {
	                if(value == null)
	                {
	                    hashMap.put(ch, 1);
	                }
	                else
	                {
	                    hashMap.put(ch, value+1);
	                }
	            }
	        }

	        // getting the sorted based on frequency/values

	       Map<Character,Integer> sortedMap = hashMap.entrySet().stream()
	            .sorted((e1,e2) -> Integer.compare(e2.getValue(), e1.getValue()))
	            .collect(Collectors.toMap(entry -> entry.getKey(), 
	                                        entry -> entry.getValue(),
	                                        (v1,v2) -> v1,
	                                        () -> new LinkedHashMap<>()));

	   // Using Stream() API

	   return sortedMap.entrySet().stream()
	            .map(entry -> String.valueOf(entry.getKey()).repeat(entry.getValue()))
	                .collect(Collectors.joining());


	}

	public static void main(String[] args) {
		
		
		
	}

}
