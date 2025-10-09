package medium.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a string expression of numbers and operators, return all possible results from 
 * computing all the different possible ways to group numbers and operators. 
 * You may return the answer in any order.

	The test cases are generated such that the output values fit in a 32-bit integer and 
	the number of different results does not exceed 104.
	
Constraints:

1 <= expression.length <= 20
expression consists of digits and the operator '+', '-', and '*'.
All the integer values in the input expression are in the range [0, 99].
The integer values in the input expression do not have a leading '-' or '+' denoting the sign.
	
 */

public class AddParanthesisResults {
	
	private static List<Integer> diffWaysToCompute(String expression) {
        
        Map<String, List<Integer>> memo = new HashMap<>();

        return possibleResult(expression, memo);
    }
	
	 private static List<Integer> possibleResult(String expr, Map<String, List<Integer>> memo)
	    {
	        if(memo.containsKey(expr))
	        {
	            return memo.get(expr);
	        }

	        List<Integer> results = new ArrayList<>();
	        for(int i = 0; i < expr.length(); i++)
	        {
	            char c = expr.charAt(i);

	            if(c == '+' || c == '-' || c == '*')
	            {
	                List<Integer> left = possibleResult(expr.substring(0,i), memo);
	                List<Integer> right = possibleResult(expr.substring(i+1), memo);

	                for(int copyL : left)
	                {
	                    for(int copyR : right)
	                    {
	                        if(c == '+')
	                        {
	                            results.add(copyL+copyR);
	                        }
	                        else if(c == '-')
	                        {
	                            results.add(copyL-copyR);
	                        }
	                        else if(c == '*')
	                        {
	                            results.add(copyL*copyR);
	                        }
	                    }
	                }
	            }

	        }

	        if(results.isEmpty())
	        {
	            results.add(Integer.parseInt(expr));
	        }

	        memo.put(expr,results);

	        return results;
	    } 

	public static void main(String[] args) {
		
		String s = "2*3-4*5";
		
		System.out.println(diffWaysToCompute(s));

	}

}
