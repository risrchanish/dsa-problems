package generalpractice;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/*
 * You are given an array of 'n' elements. Implement these elements 
 * in a queue and return that queue. In Python, you can use from collections import deque.
 */

public class QueueWithArrayDeque {
	
	 public static Queue<Integer> enqueue(List<Integer> nums) {
		 
		 
		 // Choosen ArrayQueue for better performance 
		 
		 /*
		  * We could have also done with linkedList<>() for more concise.
		  * 
		  * return new LinkedList<>(nums);
		  */
		 Queue<Integer> dQueue = new ArrayDeque<Integer>();
		 
		 for(Integer num : nums)
		 {
			 dQueue.offer(num);
		 }
		 
		 return dQueue;
	 }

	      

	public static void main(String[] args) {
		

		List<Integer> intList = List.of(7,9,12,45,78,22,90,66);
		System.out.println(enqueue(intList));
	}

}
