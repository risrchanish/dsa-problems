package medium.leetcode;

/*
 * A string s is nice if, for every letter of the alphabet that s contains, 
 * it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, 
 * and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

	Given a string s, return the longest substring of s that is nice. 
	If there are multiple, return the substring of the earliest occurrence. 
	If there are none, return an empty string.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestNiceString {
	
	public static String longestNiceSubstring(String s) {
        
        String result = "";
        int length = s.length();
        int maxLength = 0;

        for(int i = 0; i < length; i++)
        {
            for(int j = i+1; j <= length; j++)
            {
                String sub = s.substring(i,j);
                if(check(sub) && sub.length() > maxLength)
                {
                    maxLength = sub.length();
                    result = sub;
                }
            }
        }
        return result;
    }

    private static boolean check(String str)
    {
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray())
        {
            set.add(c);
        }

        for(char ch : set)
        {
            if(Character.isLetter(ch))
            {
                char c = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                if(!set.contains(c))
                {
                    return false;
                }
            }
        }
        return true;
    }

	public static void main(String[] args) {
		
		String s = "YaZaAay";
		
		System.out.println(longestNiceSubstring(s));
	}

}
