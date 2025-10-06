package medium.leetcode;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 
 */

import java.util.ArrayList;
import java.util.List;

public class ValidParanthesisPair {
	
	public static List<String> generateParenthesis(int n) 
	{
        
        List<String> result = new ArrayList<>();

        backTrack(result, "",0, 0, n);

        return result;
        
    }

    private static void backTrack(List<String> result, String s, int open, int close, int max)
    {
        if(s.length() == 2*max)
        {
            result.add(s);
            return;
        }

        if(open < max)
        {
            backTrack(result,s + "(", open+1,close,max);
        }
        if(close < open)
        {
            backTrack(result,s+")",open,close+1,max);
        }
    }

	public static void main(String[] args) {
		
		int n = 3;
		System.out.println(generateParenthesis(n));

	}

}
