package domain.strategy;

import domain.game.Game;

public interface CardPlayStrategy {
    /*
     Executes the card effect.
     Takes in game instance, player index, and relevant parameters to play the card
    */
    void play(Game game, int playerIndex, Object... params);
}
