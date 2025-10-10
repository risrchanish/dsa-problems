package medium.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given the string s, return the size of the longest substring containing each vowel an even number of times. 
 * That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.
 * 
 * Eg:
 * 1. Input: s = "eleetminicoworoep"
 * 
 * 2. Input: s = "leetcodeisgreat"
 * 
 * 3. Input: s = "bcbcbc"
 * 
 * Constraints: s contains only lowercase English letters.
 */

public class LongestSubstringOfVowels {
	
	 public static int findTheLongestSubstring(String s) {
	        // Map to store the first index where each state occurred
	        Map<Integer, Integer> seen = new HashMap<>();
	        seen.put(0, -1); // base case: all vowels even at index -1

	        int state = 0; // 5-bit state: a=bit0, e=bit1, i=bit2, o=bit3, u=bit4
	        int maxLen = 0;

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            // Flip the corresponding bit if it's a vowel
	            if (c == 'a') state ^= (1 << 0);
	            else if (c == 'e') state ^= (1 << 1);
	            else if (c == 'i') state ^= (1 << 2);
	            else if (c == 'o') state ^= (1 << 3);
	            else if (c == 'u') state ^= (1 << 4);

	            // If we've seen this state before, update maxLen
	            if (seen.containsKey(state)) {
	                maxLen = Math.max(maxLen, i - seen.get(state));
	            } else {
	                seen.put(state, i);
	            }
	        }

	        return maxLen;
	    }

	public static void main(String[] args) {
		
		System.out.println(findTheLongestSubstring("eleetminicoworoep"));

	}

}
