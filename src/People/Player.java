package People;

import Enums.AccountStatus;
import Stuff.Hand;

import java.math.BigDecimal;

public class Player extends BasePlayer{
    int bet;
    int totalCash;

    public Player(String id, String password, BigDecimal balance, AccountStatus status, Person person, Hand[] hand, int bet, int totalCash) {
        super(id, password, balance, status, person, hand);
        this.bet = bet;
        this.totalCash = totalCash;
    }

    public void getHands(){
        System.out.println("Hands getted");
    }

    public void removeHand(){
        System.out.println("Hand revomed");
    }
}
