package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * Abstract class representing a Player in a card game.
 * Author Nakul Chaudhary
 */
public abstract class Player {
    private String name; // The name of the player
    private ArrayList<Card> hand; // The player's hand of cards

    /**
     * Constructor to initialize the player with a name.
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * Gets the name of the player.
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     * @param name The new name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract method to be implemented by subclasses defining how the player plays.
     */
    public abstract void play();

    /**
     * Adds a card to the player's hand.
     * @param card The card to be added.
     */
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    /**
     * Plays (removes) a card from the player's hand.
     * @return The card played, or null if the hand is empty.
     */
    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Gets the number of cards in the player's hand.
     * @return The number of cards in the hand.
     */
    public int getHandSize() {
        return hand.size();
    }

    /**
     * Checks if the player's hand contains a specific card.
     * @param card The card to check for.
     * @return True if the card is in the hand, false otherwise.
     */
    public boolean hasCard(Card card) {
        return hand.contains(card);
    }

    /**
     * Collects (adds) multiple cards to the player's hand.
     * @param cards The list of cards to be added.
     */
    public void collectCards(ArrayList<Card> cards) {
        hand.addAll(cards);
    }

    /**
     * Plays (removes) a set number of cards for a "war" scenario.
     * @return The list of cards played.
     */
    public ArrayList<Card> playWarCards() {
        ArrayList<Card> warCards = new ArrayList<>();
        for (int i = 0; i < 5 && !hand.isEmpty(); i++) {
            warCards.add(hand.remove(0));
        }
        return warCards;
    }
}

/**
 * Class representing a player in the game of War.
 */
class WarPlayer extends Player {
    /**
     * Constructor to initialize a WarPlayer with a name.
     * @param name The name of the player.
     */
    public WarPlayer(String name) {
        super(name);
    }

    /**
     * Implementation of the abstract play method for WarPlayer.
     */
    @Override
    public void play() {
        // Implement the play logic for WarPlayer if needed
    }
}
