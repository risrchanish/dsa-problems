package generalpractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeat {
	
	public static String firstNonRep(String str) 
	{

	     	StringBuilder build = new StringBuilder();
	        Queue<Character> queue = new LinkedList<>();
	        Map<Character, Integer> hashMap = new HashMap<>();

	        for (char ch : str.toCharArray()) 
	        {
	          
	          Integer value = hashMap.get(ch);
	          if(value == null)
	          {
	            hashMap.put(ch,1);
	          }
	          else
	          {
	            hashMap.put(ch,value+1);
	          }
	          queue.offer(ch);

	            while (!queue.isEmpty() && hashMap.get(queue.peek()) > 1) {
	                queue.poll(); // remove repeating characters
	            }

	          if(queue.isEmpty())
	          {
	            build.append('X');
	          }
	          else
	          {
	            build.append(queue.peek());
	          }
	           
	        }

	        return build.toString();

	  }

	public static void main(String[] args) {
		
		String str = "aaaaaa";
		
		System.out.println(firstNonRep(str));

	}

}
