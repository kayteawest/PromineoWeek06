
public class App { // Section 2 - Class named "App".

	public static void main(String[] args) { // Section 2 - Main method.
		
		Deck gameDeck = new Deck(); // Section 2.a - Instantiates a Deck named "gameDeck".
		gameDeck.shuffle(); // Section 2.a - Calls the shuffle method on the Deck named "gameDeck".
		
		Player playerOne = new Player("Player 1 - Katie"); // Section 2.a - Instantiates a Player named "playerOne" with the value "Katie".
		Player playerTwo = new Player("Player 2 - Corey"); // Section 2.a - Instantiates a Player named "playerTwo" with the value "Corey".
		
		for (int i = 0; i < 52; i++) { // Section 2.b - Standard For Loop - Iterates through the Deck "gameDeck".
			if (i%2 == 0) { // If-else block - Alternates calling the "Draw" method on each Player.
				playerOne.draw(gameDeck);
			} else {
				playerTwo.draw(gameDeck);
			}
		}
		
		for (int i = 0; i < 26; i++) { // Section 2.c - Standard For Loop - Flips each player's top card 26 times.
			Card playerOneFlippedCard = playerOne.flip();
			Card playerTwoFlippedCard = playerTwo.flip();
			
			System.out.println("Round " + (i + 1));
			System.out.print(playerOne.getName() + " drew ");
			playerOneFlippedCard.describe();
			System.out.print(playerTwo.getName() + " drew ");
			playerTwoFlippedCard.describe();
			
			
			String roundWinner;
			
			if (playerOneFlippedCard.getValue() > playerTwoFlippedCard.getValue()) { // Section 2.d - If/Else-if block - Compares the value of each player's card and increments the score of the winning player.
				playerOne.incrementScore();
				roundWinner = playerOne.getName() + " | Current Score: " + playerOne.getScore();
			} else if (playerOneFlippedCard.getValue() < playerTwoFlippedCard.getValue()) {
				playerTwo.incrementScore();
				roundWinner = playerTwo.getName() + " | Current Score: " + playerTwo.getScore();
			} else {
				roundWinner = "Draw";
			}
			
			System.out.println("Round Winner: " + roundWinner);
			
			System.out.println("\r"); // Line break.
		}
		
		String winner;
		
		if(playerOne.getScore() > playerTwo.getScore()) { // Section 2.e - If/Else-if/Else block - Compares the value of each player's final score.
			winner = playerOne.getName();
		} else if(playerOne.getScore() < playerTwo.getScore()) {
			winner = playerTwo.getName();
		} else {
			winner = "Draw - No Winner";
		}
		System.out.println("**********\r"); // Line break.
		
		playerOne.describe(); // Section 2.f - Prints both player's name, score, and who won.
		playerTwo.describe();
		System.out.println("\r"); // Line break.
		System.out.println("Winner: " + winner + "!");
			

	}

}
