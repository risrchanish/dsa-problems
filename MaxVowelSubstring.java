package medium.leetcode;

/*
 * Given a string s and an integer k, return the maximum number of vowel letters 
 * in any substring of s with length k.

	Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * 
 * 
 */

public class MaxVowelSubstring {
	
	 public static int maxVowels(String s, int k) {
	        
	        int maxCount = 0, currentCount = 0;
	        int n = s.length();

	        for (int i = 0; i < n; i++) {
	            // Add right character
	            if (isVowel(s.charAt(i))) {
	                currentCount++;
	            }

	            // Remove left character if window exceeds size k
	            if (i >= k && isVowel(s.charAt(i - k))) {
	                currentCount--;
	            }

	            // Update maxCount once window reaches size k
	            if (i >= k - 1) {
	                maxCount = Math.max(maxCount, currentCount);
	            }
	        }

	        return maxCount;
	    }

	    private static boolean isVowel(char c) {
	        return "aeiou".indexOf(c) != -1;
	    }

	public static void main(String[] args) {
		
		String s = "abciiidef";
		
		System.out.println(maxVowels(s, 3));
				

	}

}
