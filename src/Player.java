import java.util.ArrayList;
import java.util.List;

public class Player { // Section 1.c - Class named "Player".
	
	private List<Card> hand; // Section 1.c.i.1 - Field hand.
	private int score; // Section 1.c.i.2 - Field score.
	private String name; // Section 1.c.i.3 - Field name.
	
	public void describe() { // Section 1.c.ii.1 - Method named "describe".
		System.out.println(name + " | Final Score: " + score); // Prints player info to console.
		for (Card card : hand) { // Enhanced For Loop - For each item in the List "hand"...
			card.describe(); // Calls the describe method on "card".
		}
		
	}
	
	public Card flip() { // Section 1.c.ii.2 - Method that removes and returns the top card of the "hand" field.
		return hand.remove(0); // Removes the card at index 0 and returns the value.
	}
	
	public void draw(Deck gameDeck) { // Section 1.c.ii.3 - Method that draws the top card from the given deck and adds it to the player's hand.
		Card drawnCard = gameDeck.draw(); // Calls the draw method on "gameDeck".
		hand.add(drawnCard); // Adds the drawn card to this player's hand.
	}
	
	public void incrementScore() { // Section 1.c.ii.4 - Method that adds 1 to the player's score.
		score++; // Adds 1 to the score field.
	}
	
	public Player(String playerName) { // Section 1.c.i.2.a - Default player constructor.
		hand = new ArrayList<Card>(); // Instantiates the List "hand".
		score = 0; // Sets the int variable score to 0.
		name = playerName; // Sets the string variable "name" to "playerName".
	}
	
	public int getScore() { // Method that returns player's score.
		return score;
	}
	
	public String getName() { // Method that returns player's name.
		return name;
	}

}
