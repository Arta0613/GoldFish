import java.util.*;

public class Player {	
	public Player(Deck deck) {
		this.deck = deck;

		numPlayers++;
		for(int i = 0; i < 7; i++) hand.add(deck.cardOnTop());
		for(int i = 0; i < hand.size(); i++) System.out.println(hand.get(i));
		System.out.println("");
	}

	//if -1 is returned as a string, then the deck is empty
	public String fish() {
		hand.add(deck.isEmpty() == true ? Integer.toString(-1) : deck.cardOnTop());

		return hand.lastElement();
	}

	//returns 0 if the player does not have the rank
	public int checkForCard(String rank) {
		int count = 0;

		for(int i = 0; i < hand.size(); i++) 
			if(hand.get(i).equals(rank))  {
				count++;
				hand.remove(i);
			}
		return count;
	}


	public static void main(String[] args) {
		Player player = new Player(new Deck());		
		System.out.println((player.fish().equals("-1") ? "Empty deck" : "Go fish card drawn: " + player.fish()));
		System.out.println("");
	}

	Deck deck;
	static int numPlayers = 0;
	Vector<String> hand = new Vector<String>();
}
