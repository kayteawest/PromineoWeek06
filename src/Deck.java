import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck { // Section 1.b - Class named "Deck".
	
	private static String [] suits = new String [] {"Hearts", "Clubs", "Spades", "Diamonds"}; // An array that holds the suit names of a standard 52 card deck.
	private static String [] cardNames = new String [] {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; // An array that holds the cards names of a standard 52 card deck.
	
	private List<Card> cards; // Section 1.b.i.1 - Field cards (a List of the Class "Card").
	
	public void shuffle() { // Section 1.b.ii.1 - Method that shuffles the deck of cards.
		
		List<Card> shuffledCards = new ArrayList<Card>(); // Makes an empty List named "shuflledCards".
		Random randomNumberGenerator = new Random(); // Makes a random number generator.
		
		while (cards.size() > 0) { // While Loop - While the size of the deck of cards is bigger than zero...
			int randomIndex = randomNumberGenerator.nextInt(0, cards.size()); // Pulls a random integer from within the given parameters (index 0 and the index size of the List "cards") and sets it to "randomIndex".
			Card randomCard = cards.get(randomIndex); // Uses the value of "randomIndex" to get a random card from "cards".
			shuffledCards.add(randomCard); // Adds the value of "randomCard" to the List "shuffledCards".
			cards.remove(randomIndex); // Removes the card at index "randomIndex" - prevents duplicate use of a card.
		}
		
		cards = shuffledCards; // Sets List "cards" to equate List "shuffledCards".
	}

	
	public Card draw() { // Section 1.b.ii.2 - Method that removes and returns the top card of the "cards" field.
		return cards.remove(0); // Removes the card at index 0 and returns the value.
	}
	
	public Deck() { // Section 1.b.ii.3 - the constructor (instructions on how to make a deck).
		
		cards = new ArrayList<Card>(); // Instantiates the List "cards".
		
		for (String suit : suits) { // Enhanced For Loop - For each item in the array "suits"...
			for (int i = 0; i < 13; i++) { // Nested Standard For Loop - Iterates through "cardNames".
				Card newCard = new Card(); // Instantiates the Card (complex dataType class named "Card") "newCard".
				newCard.setValue(i + 2); // Sets the point value of the card - i.e.: "Two of Hearts" == 2 points, "Three of Hearts" == 3 points, ... , "King of Hearts" == 13 points, "Ace of Hearts" == 14 points.
				newCard.setName(cardNames[i] + " of " + suit); // Sets the name of the card as the face value of the card + the suit of the card - i.e.: "Two of Hearts", ... , "Jack of Hearts".
				cards.add(newCard); // Adds the value of "newCard" to the List "cards".
			}
		}
	}
	
}

