package generalpractice;

// Checking a String is a Palindrome

public class CheckPalindrome {
	
	public static boolean checkStringpalindrome(String str)
	{
		int n = str.length();
		for(int i = 0; i < n/2; i++)
		{
			if(str.charAt(i) != str.charAt(n-1-i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "level";
		System.out.println(checkStringpalindrome(str));

	}

}
