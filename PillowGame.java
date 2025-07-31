package generalpractice;

/*
 * There are n people standing in a line labelled from 1 to n. 
 * The first person in the line is holding a pillow initially. 
 * Every second, the person holding the pillow passes it to the next person standing in the line. 
 * Once the pillow reaches the end of the line, the direction changes, 
 * and people continue passing the pillow in the opposite direction.

For example, once the pillow reaches the nth person they pass it to the n - 1th person, 
then to the n - 2th person and so on. Given the two positive integers n and time, 
return the index of the person holding the pillow after time seconds.

Constraints:
2 <= n <= 1000
1 <= time <= 1000


 */

public class PillowGame {
	
	public static int passThePillow(int n, int time) {

	      int reminder = time % (n-1);
	      int quotent = time/(n-1);
	      if(quotent % 2 != 0)
	      {
	        return n-reminder; // backward direction
	      }
	      return reminder+1; // forward direction       
	    }

	public static void main(String[] args) {
		
		System.out.println(passThePillow(5,15));

	}

}
