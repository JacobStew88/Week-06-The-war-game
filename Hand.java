package The_War_Game;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Hand extends ArrayList<Card>{
	public String toString1() {
		StringBuilder sb1 = new StringBuilder();
		String extraLine = System.lineSeparator();
		sb1.append("List of Cards: ").append((extraLine));
		
		for (Card card : this) {
		sb1.append(" ").append(card).append(extraLine);
		}
	return sb1.toString();
	}
}

