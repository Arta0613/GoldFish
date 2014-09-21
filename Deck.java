import java.util.*;

public class Deck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		
	}
	public Deck() {
		deck = new Stack<String>();
		LinkedList<String> unshuffledDeck = new LinkedList<String>();
		String card = new String();
		int randpos;
		
		for(int cardnum = 1; cardnum <= 13; cardnum++) 
			for(int cardtype = 1; cardtype <= 4; cardtype++) {
				switch(cardnum) {
					case 1: 
						switch(cardtype) {
							case 1: card = "A - Diamond"; break;
							case 2: card = "A - Clover"; break;
							case 3: card = "A - Heart"; break;
							case 4: card = "A - Spade"; break;
						}
						break;
					case 11: 
						switch(cardtype) {
							case 1: card = "Jack - Diamond"; break;
							case 2: card = "Jack - Clover"; break;
							case 3: card = "Jack - Heart"; break;
							case 4: card = "Jack - Spade"; break;
						}
						break;
					case 12: 
						switch(cardtype) {
							case 1: card = "Queen - Diamond"; break;
							case 2: card = "Queen - Clover"; break;
							case 3: card = "Queen - Heart"; break;
							case 4: card = "Queen - Spade"; break;
						}
						break;
					case 13: 
						switch(cardtype) {
							case 1: card = "King - Diamond"; break;
							case 2: card = "King - Clover"; break;
							case 3: card = "King - Heart"; break;
							case 4: card = "King - Spade"; break;
						}
						break;
					default:
						switch(cardtype) {
							case 1: card = Integer.toString(cardnum) + " - Diamond"; break;
							case 2: card = Integer.toString(cardnum) + " - Clover"; break;
							case 3: card = Integer.toString(cardnum) + " - Heart"; break;
							case 4: card = Integer.toString(cardnum) + " - Spade"; break;
						}
						break;
				}
	
				unshuffledDeck.push(card);
			}
			
		while(unshuffledDeck.size() != 0) {
			randpos = (int)(Math.random() * unshuffledDeck.size());
			
			deck.push(unshuffledDeck.get(randpos));
			
			unshuffledDeck.remove(randpos);
		}

		for(Iterator<String> iterator = unshuffledDeck.descendingIterator(); iterator.hasNext();) 
			System.out.println(iterator.next());
	}

		

	String drawCard() {
		String draw = deck.peek();
		deck.pop();
		
		return draw;
	}
	
	static Stack<String> deck;
}
