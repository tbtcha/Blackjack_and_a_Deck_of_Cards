package Stuff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Deck {
    private Date creationDate;
    private BlackjackCard blackjackCard;
    private List<Integer> cards = new ArrayList<Integer>();

    public Deck(Date creationDate, BlackjackCard blackjackCard, List<BlackjackCard> cards) {
        this.creationDate = creationDate;
        this.blackjackCard = blackjackCard;
        cards.add(blackjackCard);
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Integer> getCards() {
        return cards;
    }

    public void setCards(List<Integer> cards) {
        this.cards = cards;
    }
    public void getGameValue(){
        if (cards != null){
            cards.add(blackjackCard.getGameValue());
    }

    }
}
