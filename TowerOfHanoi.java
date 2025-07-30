package generalpractice;

/*
 * You are given n disks placed on rod 1, arranged in ascending order from bottom to top 
 * (i.e., the smallest disk is at the top). The goal is to move all the disks 
 * from rod 1 to rod 3 using rod 2 as an auxiliary rod. However, the movement of disks must follow two rules:

	1. Only one disk can be moved at a time.
	2. A disk can only be placed on top of a larger disk or an empty rod.
 * Your task is to determine the minimum number of steps required to transfer all the disks 
 * from rod 1 to rod 3 following the above rules.

Constraint: n <= 12

 */

public class TowerOfHanoi {
	

	public static long countMoves(int n) 
	{

	      if(n == 0)
	      {
	        return 0;
	      }
	      
	      return (long)Math.pow(2,n)-1;

	  }
	public static void main(String[] args) {
		

		countMoves(3);
	}

}
