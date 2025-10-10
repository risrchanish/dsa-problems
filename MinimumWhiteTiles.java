package hard.leetcode;
/*
 * You are given a 0-indexed binary string floor, which represents the colors of tiles on a floor:

floor[i] = '0' denotes that the ith tile of the floor is colored black.
On the other hand, floor[i] = '1' denotes that the ith tile of the floor is colored white.
You are also given numCarpets and carpetLen. You have numCarpets black carpets, 
each of length carpetLen tiles. Cover the tiles with the given carpets such that the number 
of white tiles still visible is minimum. Carpets may overlap one another.

Return the minimum number of white tiles still visible.

Eg: 

Input: floor = "10110101", numCarpets = 2, carpetLen = 2

floor = "11111", numCarpets = 2, carpetLen = 3
 */

public class MinimumWhiteTiles {
	
	 public static int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
	        int n = floor.length();
	        Integer[][] memo = new Integer[n + 1][numCarpets + 1];
	        return dp(0, numCarpets, floor, carpetLen, memo);
	    }

	    private static int dp(int i, int k, String floor, int carpetLen, Integer[][] memo) {
	        if (i >= floor.length()) return 0;
	        if (memo[i][k] != null) return memo[i][k];

	        // Option 1: Place carpet here
	        int useCarpet = k > 0 ? dp(i + carpetLen, k - 1, floor, carpetLen, memo) : Integer.MAX_VALUE;

	        // Option 2: Don't place carpet here
	        int noCarpet = (floor.charAt(i) == '1' ? 1 : 0) + dp(i + 1, k, floor, carpetLen, memo);

	        memo[i][k] = Math.min(useCarpet, noCarpet);
	        return memo[i][k];
	    }

	public static void main(String[] args) {
		
		String floor = "11111"; int numCarpets = 2; int carpetLen = 3;
		
		System.out.println(minimumWhiteTiles(floor,numCarpets,carpetLen));
	}

}
