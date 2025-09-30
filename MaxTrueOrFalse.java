package medium.leetcode;
/*
 * A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false. 
  	He wants to confuse the students by maximizing the number of consecutive questions 
  	with the same answer (multiple trues or multiple falses in a row).

	You are given a string answerKey, where answerKey[i] is the original answer to the ith question. 
	In addition, you are given an integer k, 
	the maximum number of times you may perform the following operation:

		1. Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
		2. Return the maximum number of consecutive 'T's or 'F's in the answer key after performing 
		the operation at most k times.
		
eg: 1. answerKey = "TTFF", K = 2. Output = 4. TTTT.
	2. answerKey = "TFFT" , K = 1. Output = 3. TFF or FFT.
	3. answerKey = "TTFTTFTT", k = 1. Output = 5. TTTTTFTT or TTFTTTTT.
 */

public class MaxTrueOrFalse {
	
	public static int maxConsecutiveAnswer(String answerKey, int k)
	{
		return Math.max(maxConsecutiveChar(answerKey, k , 'T'), 
					maxConsecutiveChar(answerKey, k , 'F'));
	}
	
	private static int maxConsecutiveChar(String s, int k, char target)
	{
		int flipCount = 0; int left = 0; int length = s.length(); 
		char[] chars = s.toCharArray(); int maxLength = 0;
		
		for(int right = 0; right < length; right++)
		{
			if(chars[right] != target)
			{
				flipCount++;
			}
			
			while(flipCount > k)
			{
				if(chars[left] != target)
				{
					flipCount--;
				}
				
				left++;
			}
			
			
			maxLength = Math.max(maxLength, right-left+1);
		}
		
		return maxLength;
	}
	
	

	public static void main(String[] args) {
		
		String answerKey ="TTFTTFTT"; int k = 1;
		int length = maxConsecutiveAnswer(answerKey, k);
		System.out.println(length);

	}

}
