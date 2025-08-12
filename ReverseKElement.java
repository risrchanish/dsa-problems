package generalpractice;


/*
 * You are given a queue and an integer 'k'. 
 * Your task is to reverse the order of the first 'k' elements of the queue.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class ReverseKElement {
	
	public static Queue<Integer> solve(Queue<Integer> q, int k) {

	      // 1 2 3 4 5

	      LinkedList<Integer> linked = new LinkedList<>();
	      linked.addAll(q);
	      LinkedList<Integer> newList = new LinkedList<>();
	      
	      int n = k;
	      
	      for(int i = 0; i < q.size(); i++)
	        {  
	          if(n > 0)
	          {
	            newList.add(linked.get(n-1));
	            n--;
	          }
	          
	          if(i >= k)
	          {
	            newList.add(linked.get(i));
	          }
	        }
	      return newList;
	    }

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>(List.of(1,2,3,4,5));
		int k = 3;
		
		System.out.println(solve(queue,k));

	}

}
