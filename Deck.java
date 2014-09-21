public class Deck {
	public Deck() {
		cards = new Stack<String>();
		static String[] unshuffledDeck = new String[52];
		String card;
		
		for(int i = 0; i < 52; i++) 
			for(int j = 0; j < 13; j++) {
				card = "";
				switch(i) {
					case 0: card = 'A' + Integer.toString(i); break;
					case 11: card = "Jack" + Integer.toString(i); break;
					case 12: card "Queen" + Integer.toString(i); break;
					case 13: card "King" + Integer.toString(i); break;
					default: card = Integer.toString(j) + Integer.toString(i); break;
				}
	
				unshuffledDeck[i] = card;
			}
			
		for(int i = 0; i < shuffledDeck.length(); i++) { 
			int randpos = random() % shuffledDeck.length();
			deck.push(shuffledDeck[randpos]);
			
			shuffledDeck.remove(randompos);
		}
	}

	
	String drawCard() {
		String draw = deck.peek();
		deck.pop();
		
		return draw;
	}
	
	
	static Stack<String>[] deck;
}