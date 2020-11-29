package Games;

import People.Dealer;
import People.Player;
import Stuff.Shoe;

public class Game {
    Shoe shoe;
    Dealer dealer;
    Player player;
    GameView gameView;

    public Game(Shoe shoe, Dealer dealer, Player player, GameView gameView) {
        this.shoe = shoe;
        this.dealer = dealer;
        this.player = player;
        this.gameView = gameView;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public GameView getGameView() {
        return gameView;
    }

    public void setGameView(GameView gameView) {
        this.gameView = gameView;
    }
}
