package Stuff;

import Enums.Suit;

public class Shoe {
    private int numberOfDecks;
    private Deck deck;

    public Shoe(int numberOfDecks, Deck deck) {
        this.numberOfDecks = numberOfDecks;
        this.deck = deck;
    }

    public int getNumberOfDecks() {
        return numberOfDecks;
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void createShoe(){
        System.out.println("Shoe created");
    }

    public void shuffle(){
        System.out.println("Shuffled");
    }

    public Card dealCard(){
        Card card = new Card(Suit.Heart,10);
        return card;
    }
}
