package The_War_Game;

public class Card {
	private String suit;
	private String cardName;
	private int cardValue;
	
	public Card(String suit, String cardName, int cardValue) {
		this.setSuit(suit);
		this.setCardName(cardName);
		this.cardValue = cardValue;
	}
	
	@Override
	public String toString() {
		return suit + " of " + cardName;
	}
	

	public int getCardValue() {
		return cardValue;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	
	
}
