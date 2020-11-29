package People;

import Enums.AccountStatus;
import Games.GameController;
import Games.GameView;
import Stuff.Hand;

import java.math.BigDecimal;

public class BasePlayer{
    String id;
    String password;
    BigDecimal balance;
    AccountStatus status;
    Person person;
    Hand[] hand;
    GameView gameView;
    GameController gameController;

    public BasePlayer(String id, String password, BigDecimal balance, AccountStatus status, Person person, Hand[] hand, GameView gameView, GameController gameController) {
        this.id = id;
        this.password = password;
        this.balance = balance;
        this.status = status;
        this.person = person;
        this.hand = new Hand[2];
        this.gameView = gameView;
        this.gameController = gameController;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Hand[] getHand() {
        return hand;
    }

    public void setHand(Hand[] hand) {
        this.hand = hand;
    }

    public GameView getGameView() {
        return gameView;
    }

    public void setGameView(GameView gameView) {
        this.gameView = gameView;
    }

    public GameController getGameController() {
        return gameController;
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public void resetPassword(){
        System.out.println("Password reseted");
    }
}
