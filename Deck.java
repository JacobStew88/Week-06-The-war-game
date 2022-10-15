package The_War_Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("serial")
public class Deck extends ArrayList<Card> {
	private List<String> suits = List.of("Diamonds", "Hearts", "Spades", "Clubs");
	private List<String> cardNames = List.of("2","3","4","5","6","7","8","9","10",
			"Jack","Queen","King","Ace");
	
	public Deck() {
		for (int cardRank = 0; cardRank<cardNames.size(); cardRank++) {
			
			int cardValue = cardRank +1;
			String cardName = cardNames.get(cardRank);
			
			for (String suit : suits) {
				this.add(new Card(cardName, suit, cardValue));
			}
		} 
	}
	
	public void shuffle() {
		Collections.shuffle(this);
		}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String extraLine = System.lineSeparator();
		sb.append("List of Cards: ").append((extraLine));
		
		for (Card card : this) {
		sb.append(" ").append(card).append(extraLine);
		}
	return sb.toString();
	}
	
	
}
