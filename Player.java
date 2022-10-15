package The_War_Game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	List<Card> hand = new ArrayList<Card>();
	private int score;
	
	 Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.remove(0));	
	}
	//public Hand getHand() {
		//return hand;
	//}
	public Card flip() {
		return hand.remove(0);
	}
	public void incrementScore() {
		score++;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return name;
	}
	public void describe() {
		System.out.println("\nPlayer " + name + " has this " + hand );
		
	}	
}

		

		

		
		

