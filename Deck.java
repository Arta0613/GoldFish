import java.util.*;

public class Deck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		String cardDrawn = new String(deck.drawCard());
		System.out.println("The card you drew: " + cardDrawn);
	}
	public Deck() {
		LinkedList<String> unshuffledDeck = new LinkedList<String>();
		String shape = new String();
		String cardDigit = new String();
		int randpos;
		
		for(int cardnum = 1; cardnum <= 13; cardnum++) 
			for(int cardtype = 1; cardtype <= 4; cardtype++) {
				if(cardtype == 1) shape = "Diamond";	
				else if(cardtype == 2) shape = "Clover";
				else if(cardtype == 3) shape = "Heart";
				else if(cardtype == 4) shape = "Spade";

				if(cardnum == 1) cardDigit = "A";
				else if(cardnum == 11) cardDigit = "Jack";
				else if(cardnum == 12) cardDigit = "Queen";
				else if(cardnum == 13) cardDigit = "King";
				else cardDigit = Integer.toString(cardnum);
					
				card = cardDigit + " - " + shape;
				unshuffledDeck.push(card);
			}
			
		for(Iterator<String> iterator = unshuffledDeck.descendingIterator(); iterator.hasNext();) 
			System.out.println(iterator.next());

		while(unshuffledDeck.size() != 0) {
			randpos = (int)(Math.random() * unshuffledDeck.size());
			
			deck.push(unshuffledDeck.get(randpos));
			unshuffledDeck.remove(randpos);
		}
	}

	public String drawCard() {return deck.pop();}
	
	private String card = new String();
	private static Stack<String> deck = new Stack<String>();
}
