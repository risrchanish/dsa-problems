package generalpractice;

import java.util.ArrayList;
import java.util.List;

/*
 * There are n kids with candies. You are given an integer array candies, 
  	where each candies[i] represents the number of candies the ith kid has, 
  	and an integer extraCandies, denoting the number of extra candies that you have.

	Return a boolean array result of length n, where result[i] is true if, after 
	giving the ith kid all the extraCandies, they will have the greatest number of 
	candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */

//brute force approach 
// Time complexity O(n^2)

public class MaxCandies {
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
	{
        
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            int j = 0;
            int total = candies[i] + extraCandies;
            while(j < n)
            {
                if(total >= candies[j])
                {
                    j++;
                }
                else
                {
                    break;
                }
            }

            if(j <= n-1)
            {
                result.add(false);
            }

            else
            {
                result.add(true);
            }
        }

        return result;

    }
	
	

	public static void main(String[] args) {
		
		int[] candies = {2,3,5,1,3};
		
		int extra = 3;
		
		System.out.println(kidsWithCandies(candies,extra));
	}

}
