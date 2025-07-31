package generalpractice;

public class SecondLargestNumber {
	
	public static int secondLargest(int[] arr)
	{
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int copy : arr)
		{
			if(largest < copy)
			{
				secondLargest = largest;
				largest = copy;
			}
			// only to check if previous secondLargest is lesser then update
			// Also, there should not be reated largest number 
			else if(secondLargest < copy && copy != largest) 
			{
				secondLargest = copy;
			}
		}
		
		return secondLargest;
	}

	public static void main(String[] args) {
		
		int[] ar = {2,4,1,6,9,3};
		
		System.out.println(secondLargest(ar));

	}

}
