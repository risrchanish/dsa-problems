package generalpractice;

import java.util.Arrays;

/*
 * Given an array of integers temperatures representing the daily temperatures, 
  		return an array answer such that answer[i] is the number of days you have to wait 
  		after the i-th day to get a warmer temperature. If there is no future day for which 
  		this is possible, keep answer[i] == 0 instead.
 */

public class WarmTemperatureCount {
	
	public static int[] dailyTemperatures(int[] temperatures) {

	      int i = 0;
	      int j = i + 1;
	      int length = temperatures.length;
	      int[] diff = new int[length];

	      int count = 0;
	      
	      while(j < length)
	        {
	          
	          if(temperatures[j] > temperatures[i])
	          {
	            count++;
	            diff[i] = count;
	            i++;
	            j = i;
	            count = 0;
	          }
	            else if(i + count == length-1)
	            {
	              diff[i] = 0;
	              i++;
	              j = i;
	              count = 0;
	            }
	          else
	          {
	            count++;
	          }
	          j++;
	        }
	  
	      return diff;
	  }

	public static void main(String[] args) {
		
		int[] arr = {73,74,75,71,69,72,76,73};
		
		System.out.println(Arrays.toString(dailyTemperatures(arr)));
		
		

	}

}
