package domain.strategy;

import domain.game.Game;

public class ExplodingKittenStrategy implements CardPlayStrategy {

    @Override
    public void play(Game game, int playerIndex, Object... params) {
        Integer insertIndex = (params.length > 0 && params[0] instanceof Integer) ?
                (Integer) params[0] : 0;

        boolean exploded = game.playExplodingKitten(playerIndex);
        if (!exploded) {
            game.playDefuse(insertIndex, playerIndex);
        }
    }
}
