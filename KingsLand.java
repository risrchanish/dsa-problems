package generalpractice;

import java.util.ArrayList;
import java.util.List;

/*
 * You have been given a land in the form of an array of size n. On each index, 
 * there is a king who wants to determine its property. Land at each index has some value. 
 * Every king considers every land to its left and right his property until 
 * he does not see land of value bigger than his. Note that the value of individual land
 * does not change based on the consideration of kings. 
 * You have to print the value of land that each king considers to be his.
 */

public class KingsLand {
	
	 public static List<Integer> kingsLand(ArrayList<Integer> landValues) {
		 
		 // applying brute force
		 
	        int n = landValues.size();
	        List<Integer> result = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int kingValue = landValues.get(i);
	            int sum = kingValue;

	            // Check left
	            for (int k = i - 1; k >= 0; k--) {
	                if (landValues.get(k) > kingValue) break;
	                sum += landValues.get(k);
	            }

	            // Check right
	            for (int j = i + 1; j < n; j++) {
	                if (landValues.get(j) > kingValue) break;
	                sum += landValues.get(j);
	            }

	            result.add(sum);
	        }

	        return result;
	    }

	public static void main(String[] args) {
		
		ArrayList<Integer> landValues = new ArrayList<>(List.of(4,3,5,1,2));
		
		System.out.println(kingsLand(landValues));

	}

}
