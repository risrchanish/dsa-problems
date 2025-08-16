package generalpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * There is a tunnel which is under construction. Workers go inside in a sequence 
 * and come out in reverse sequence, i.e., the person going in last will come out first.
	You have been given two sequences, IN and OUT. If any worker does not obey the sequence, 
	other workers will be trapped. Determine if all the workers came out safely.
 */

public class TunnelSequence {
	
	public static boolean calculateTotalTrappedWorkers(ArrayList<Integer> in, ArrayList<Integer> out) {

	      Stack<Integer> stack = new Stack<>();

	      for(Integer inCopy : in)
	        {
	          stack.push(inCopy);
	        }

	      for(Integer outCopy : out)
	        {
	          if(stack.pop() != outCopy)
	          {
	            return false;
	          }
	        }

	      return true;

	    }

	public static void main(String[] args) {
		
		ArrayList<Integer> in = new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> out = new ArrayList<>(List.of(5,4,3,2,1));
		
		
		System.out.println(calculateTotalTrappedWorkers(in,out));
 
	}

}
