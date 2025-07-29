package generalpractice;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given an integer n, representing a list of integers from 1 to n, sorted in increasing order.

Perform the following elimination process until only one number remains:

Remove the first element and every second element from left to right.
Then from right to left, remove the last and every second element.
Repeat the above two steps alternately (left-to-right, then right-to-left), 
continually removing every second remaining element.
Your task is to return the last number that remains in the list.
 */

public class LastNumberStanding {
	
	public static int lastRemaining(int n) {

	      List<Integer> intList = new ArrayList<>();
	      for(int i = 1; i <= n; i++)
	        {
	          intList.add(i);
	        }
	      while(intList.size() != 1)
	        {
	          int i = 0;
	          intList.remove(i);
	          while(i+1 < intList.size())
	            {
	              i = i+1;
	              intList.remove(i);
	            }
	          if(intList.size() != 1)
	          {
	            
	            intList.remove(intList.size()-1);
	            int j = intList.size();
	            while(j-2 >= 0)
	            {
	              j = j-2;
	              intList.remove(j);
	            }
	          }
	          
	        }
	      return intList.get(0);

	    }

	public static void main(String[] args) {
		
		lastRemaining(9);

	}

}
