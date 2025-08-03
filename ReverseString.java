package generalpractice;


// Reverse a given String

public class ReverseString {

	public static String reverseString(String str)
	{
		String reverse = "";
		int n = str.length();
		for(int i = 0; i < n; i++)
		{
			reverse = reverse + str.charAt(n - 1 - i);
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		
		 String str = "hsina ma I";
		 
		 System.out.println(reverseString(str));
		 
		 
		  System.out.println("=====Using StringBuilder====");
		 
		 String reverse = new StringBuilder(str).reverse().toString();
		 System.out.println(reverse);
		 
		 

	}

}
