package generalpractice;


/*
 * Ramesh loves diamonds, One day he found out that there is a circular linked 
  		list-like structure present in this neighbourhood, and each node of that 
  		linked list contains the number of diamonds in the form of node value, Ramesh wants to 
  		collect the maximum amount of diamonds but he can only take away the diamonds of only one of
  		 the node. How many diamonds can Ramesh get?
	A linked list is said to be circular when the last node of a linked list is 
	connected with the first node.


 */

public class MaxElementCircularQueue {
	
	class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}

	}
	
	public static void maxPrint(Node head)
	{
		 Node temp = head.next;
	     int maxDiamond = head.data;
	     while(temp != head)
	        {
	          if(temp.data > maxDiamond)
	          {
	            maxDiamond = temp.data;
	          }
	          temp = temp.next;
	        }

	      System.out.println(maxDiamond);
		

	}
	

	public static void main(String[] args) {
		
		MaxElementCircularQueue outer = new MaxElementCircularQueue();
		
		// Creating nodes
		Node node1 = outer.new Node(1);
		Node node2 = outer.new Node(2);
		Node node3 = outer.new Node(3);
		Node node4 = outer.new Node(6);
		Node node5 = outer.new Node(8);
		
		// Linking nodes to form circular node
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node1;
		
		maxPrint(node1);
		
	}
		
		
}
