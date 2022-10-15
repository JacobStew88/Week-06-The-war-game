package The_War_Game;

public class Player {
	private String name;
	private Hand hand = new Hand();
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
	public Hand getHand() {
		return hand;
	}
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
	
		public String toString1() {
			StringBuilder sb1 = new StringBuilder();
			String extraLine = System.lineSeparator();
			sb1.append("List of Cards: ").append((extraLine));
			
			for (Card card : hand) {
			sb1.append(" ").append(card).append(extraLine);
			}
		return sb1.toString();
		}

		

		

		
		
}
