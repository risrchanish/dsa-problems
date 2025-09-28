package medium.leetcode;
/*
 * Given a string s consisting only of characters a, b and c.

	Return the number of substrings containing at least one occurrence of all 
	these characters a, b and c.
 */

import java.util.Map;
import java.util.HashMap;

public class SubstringContainingChars {
	
	 public static int numberOfSubstrings(String s) {
	        int n = s.length();
	        int count = 0; 
	        int left = 0;  

	       Map<Character, Integer> hashMap = new HashMap<>();

	      for(int right = 0; right < n; right++)
	      {
	        char c = s.charAt(right);

	        Integer value = hashMap.get(c);

	        if(value == null)
	        {
	            hashMap.put(c,1);
	        }
	        else
	        {
	            hashMap.put(c,value+1);
	        }

	        while(hashMap.getOrDefault('a',0) > 0 && 
	                hashMap.getOrDefault('b',0) > 0 && 
	                hashMap.getOrDefault('c',0) > 0)
	        {
	            count += n-right; // (n-1) - (right-1) 

	            char leftChar = s.charAt(left);

	            hashMap.put(leftChar, hashMap.get(leftChar)-1);
	            left++;
	        }

	      }

	      return count;
	    }

	public static void main(String[] args) {
		
		String str = "abcabc";
		System.out.println(numberOfSubstrings(str));

	}

}
