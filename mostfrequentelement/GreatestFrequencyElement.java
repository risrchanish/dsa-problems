package mostfrequentelement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * You have been given an array of elements. You need to return the most frequent element. 
 * In case of more than one element having the same highest frequency, return the smallest of those elements.
 * 
 * Sample Input:
 * 5 5 5 6 6 6 7 7 8
 * Sample Output:
 * 5
 */

public class GreatestFrequencyElement {
	
	public static int mostFrequent(int [] arr)
	{
		// Using a map value to count the frequency of each key(array element) 
		Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		return frequencyMap.entrySet().stream()
							.sorted(Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder())
							.thenComparing(Map.Entry.comparingByKey()))
							.findFirst().map(Map.Entry::getKey)
							.orElseThrow(IllegalStateException :: new);
	}

	public static void main(String[] args) {
		
//		int[] arr = {1, 5, 2, 4, 3, 6, 1, 1, 2, 2, 2};
		int[] arr = {5 ,5 ,5 ,6 ,6 ,6 ,7 ,7 ,8};
		
		System.out.println(mostFrequent(arr));
		
	}

}
