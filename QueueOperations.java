package generalpractice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

/*
 * You are given an array of integers and another integer 'k'. 
  	Your task is to perform the following operations in the given order:

Implement a queue with integers from the given array.
Remove the first element of the queue.
Print the first element of the queue.
Find if the integer 'k' exists in the queue.
Finally, return the queue.
 */

public class QueueOperations {
	
	public static Queue<Integer> solve(Vector<Integer> v, int k) {

	      Set<Integer> hashSet = new HashSet<>(v); // using for finding the value O(1).

	      /* Implement a queue with integers from the given array.
	          Time complexity O(n)
	        */
	      Queue<Integer> queueOperation = new LinkedList<>(v);
	      

	      /* Remove the first element of the queue.
	          Time complexity O(1)
	        */
	      queueOperation.poll();

	      /* Print the first element of the queue.
	          Time complexity O(1)
	        */
	      System.out.println(queueOperation.peek());

	      /*
	      if(hashSet.contains(k))
	      {
	        System.out.println("Yes");
	      }
	      else
	      {
	        System.out.println("No");
	      }
	      */
	      /* Find if the integer 'k' exists in the queue.
	         Time complexity O(n) 
	        */
	      if(queueOperation.contains(k))
	         {
	            System.out.println("Yes");
	         }
	      else
	      {
	        System.out.println("No");
	      }

	      // Return the queue.
	      return queueOperation;

	    }

	public static void main(String[] args) {
		
		int k = 9;
		Vector<Integer> vector = new Vector<>(List.of(1,9,11,3,2));
		
		System.out.println(solve(vector,k));
	}

}
