package People;

import Enums.AccountStatus;
import Stuff.Hand;

import java.math.BigDecimal;

public class Dealer extends BasePlayer{
    Hand hand;

    public Dealer(String id, String password, BigDecimal balance, AccountStatus status, Person person, Hand[] hand, Hand hand1) {
        super(id, password, balance, status, person, hand);
        this.hand = hand1;
    }

    public int getTotalScore(){
        return hand.resolveScore();
    }
}
