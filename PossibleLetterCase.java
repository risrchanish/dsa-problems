package medium.leetcode;

import java.util.List;
import java.util.ArrayList;

/*
 * Given a string s, you can transform every letter individually to be lowercase or uppercase 
  	to create another string.

	Return a list of all possible strings we could create. Return the output in any order.

 

Example 1:

Input: s = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]

Example 2:

Input: s = "3z4"
Output: ["3z4","3Z4"]
 
 */

public class PossibleLetterCase {

	public static List<String> letterCasePermutation(String s) 
	{
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(char[] chars, int index, StringBuilder path, List<String> result) 
    {
        if (index == chars.length) 
        {
            result.add(path.toString());
            return;
        }

        char ch = chars[index];
        if (Character.isLetter(ch)) 
        {
            // Lowercase branch
            path.append(Character.toLowerCase(ch));
            backtrack(chars, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);

            // Uppercase branch
            path.append(Character.toUpperCase(ch));
            backtrack(chars, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        } else 
        {
            // Digit branch (unchanged)
            path.append(ch);
            backtrack(chars, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }
	public static void main(String[] args) {
		
		String s = "a1b2";
		
		System.out.println(letterCasePermutation(s));
	}

}
