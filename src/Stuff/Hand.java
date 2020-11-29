package Stuff;

import Enums.Suit;

import java.util.List;

public class Hand {
    private BlackjackCard blackjackCard;
    private List<Integer> list1 = null;

    public Hand(BlackjackCard blackjackCard) {
        this.blackjackCard = blackjackCard;
    }

    public BlackjackCard getBlackjackCard() {
        return blackjackCard;
    }

    public void setBlackjackCard(BlackjackCard blackjackCard) {
        this.blackjackCard = blackjackCard;
    }

    public List<Integer> getScores(){
        list1.add(blackjackCard.getGameValue());
        return list1;
    }

    public void addCard(){
        Card card = new Card(Suit.Club,9);
        System.out.println("Card added");
    }

    public int resolveScore(){
        int sum = 0;
        for(int i = 0; i < list1.size(); i++)
            sum += list1.get(i);
        return sum;
    }
}
