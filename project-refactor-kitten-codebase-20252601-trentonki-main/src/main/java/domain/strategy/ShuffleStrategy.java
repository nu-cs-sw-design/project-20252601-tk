package domain.strategy;

import domain.game.Game;

public class ShuffleStrategy implements CardPlayStrategy {

    @Override
    public void play(Game game, int playerIndex, Object... params) {
        int numberOfShuffles = (params.length > 0 && params[0] instanceof Integer) ?
                (Integer) params[0] : 1;
        game.playShuffle(numberOfShuffles);
    }
}
