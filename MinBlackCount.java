package generalpractice;

/*
 * You are given a set of playing cards which can either be red or black card.
		These cards are aligned in a sequence, you have to determine 
		how many minimum cards needs to be replaced in order to create 
		a segment of atleast k black cards.


 */


public class MinBlackCount {
	
	public static int solve(int n, String s, int k) {
        int minReplacements = Integer.MAX_VALUE;
        int rCount = 0;

        // First window of size k
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'R') rCount++;
        }
        minReplacements = rCount;

        // Slide the window
        for (int i = k; i < n; i++) {
            if (s.charAt(i - k) == 'R') rCount--; // remove leftmost
            if (s.charAt(i) == 'R') rCount++;     // add rightmost
            minReplacements = Math.min(minReplacements, rCount);
        }

        return minReplacements;
    }

	public static void main(String[] args) {
		String str = "BBBRRBBBRRRR";
		int n = str.length();
		int k = 7;
		System.out.println(solve(n,str,k));

	}

}
