package generalpractice;

/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

	A subsequence of a string is a new string that is formed from the original string 
		by deleting some (can be none) of the characters without disturbing 
		the relative positions of the remaining characters. 
		(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
		
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 
 */

public class SequenceString {
	
	 public static boolean isSubsequence(String s, String t) {

	        /*
	            1. convert the strings into char array.
	            2. start matching the elements till the lengths of the arrays.
	            3. handle the edge cases.

	        */
	        
	        char[] charS = s.toCharArray();
	        char[] charT = t.toCharArray();
	        int count  = 0;
	        int n = charT.length; 

	        // edge case 

	        if(charS.length == 0 && n >= 0)
	        {
	            return true;
	        }

	        else if(charS.length > 0 && n > 0)
	        {
	            for(int i = 0; i < n; i++)
	            {
	                if(charT[i] == charS[count] && count < charS.length)
	                {
	                    count++;
	                }
	                
	                if(count == charS.length)
	                {
	                    return true;
	                }              
	            }
	        }  
	        return false;
	    }

	public static void main(String[] args) {
		
		String s = "";
		String t = "";
		System.out.println(isSubsequence(s,t));
	}

}
