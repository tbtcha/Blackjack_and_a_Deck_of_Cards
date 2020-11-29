package Stuff;

import Enums.Suit;

public class BlackjackCard extends Card{
    private int gameValue;

    public BlackjackCard(Suit suit, int faceValue, int gameValue) {
        super(suit, faceValue);
        this.gameValue = gameValue;
    }

    public int getGameValue() {
        return gameValue;
    }

    public void setGameValue(int gameValue) {
        this.gameValue = gameValue;
    }
}
