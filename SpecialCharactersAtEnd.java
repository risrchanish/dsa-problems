package specials_at_end;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given a set of cards, each having either a number or a symbol. Your task is to rearrange the cards in such a way that all the cards with numbers come first,
followed by the cards with symbols, while maintaining the relative order of numbers and symbols.
 */

public class SpecialCharactersAtEnd {
	
	public static void sortCards(ArrayList<String> cards, int n) {

	      ArrayList<String> numbers = new ArrayList<>();
	      ArrayList<String> specials = new ArrayList<>();

	      for(String card : cards)
	        {
	          if(card.matches("\\d+"))
	          {
	            numbers.add(card);
	          }

	          else
	          {
	            specials.add(card);
	          }
	        }

	      cards.clear();

	      cards.addAll(numbers);
	      cards.addAll(specials);

	      for(int i = 0; i < cards.size(); i++)
	        {
	          System.out.print(cards.get(i)+" ");
	        }

	  }

	public static void main(String[] args) {
		
		ArrayList<String> newList = new ArrayList<>(List.of("3","2","+","4","*","-","$","5"));
		int size = newList.size();
		sortCards(newList,size);

	}

}
