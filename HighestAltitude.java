package generalpractice;

/*
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. 
  	The biker starts his trip on point 0 with altitude equal 0.

	You are given an integer array gain of length n where gain[i] is the net gain in altitude between 
	points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 
 */

public class HighestAltitude {
	
	 public static int largestAltitude(int[] gain) {
	        
	        int n = gain.length;
	        int[] altitudes = new int[n+1];
	        int max = 0;
	        
	        altitudes[0] = 0;

	        for(int i = 0; i < n; i++)
	        {
	            altitudes[i+1] = gain[i] + altitudes[i];

	            if(max <= altitudes[i+1])
	            {
	                max = altitudes[i+1];
	            }
	        }

	        return max;
	    }

	public static void main(String[] args) {
		
		int[] gain = {-5,1,5,0,-7};
		System.out.println(largestAltitude(gain));

	}

}
