package generalpractice;

import java.util.ArrayList;
import java.util.Arrays;

// Print the common Words from two lines given


public class SplitStrings {
	
	public static String[] splitAndAdd(String s1, String s2)
	{
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		
		
		
		ArrayList<String> str2List = new ArrayList<>();
		ArrayList<String> matchedStringList = new ArrayList<>();
		
		for(String copied : str2)
		{
			str2List.add(copied);
		}
		
		int j = 0;
		
		for(String copied1 : str1)
		{
			if(j < str2.length && copied1.equals(str2List.get(j)))
			{
				matchedStringList.add(copied1);
			}
			j++;
			
		}
		
		String[] result = new String[matchedStringList.size()];
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = matchedStringList.get(i);
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		

		String s1 = "I am a disco dancer";
		String s2 = "disco am jao";
		
		System.out.println(Arrays.toString(splitAndAdd(s1,s2)));
	}

}
