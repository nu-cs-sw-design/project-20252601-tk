package domain.strategy;

import domain.game.Game;

public class SkipStrategy implements CardPlayStrategy {

    @Override
    public void play(Game game, int playerIndex, Object... params) {
        boolean superSkip = (params.length > 0 && params[0] instanceof Boolean) ?
                (Boolean) params[0] : false;
        game.playSkip(superSkip);
    }
}
