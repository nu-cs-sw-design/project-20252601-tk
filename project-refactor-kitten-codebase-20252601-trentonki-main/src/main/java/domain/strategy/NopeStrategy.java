package domain.strategy;

import domain.game.Game;

public class NopeStrategy implements CardPlayStrategy {

    @Override
    public void play(Game game, int playerIndex, Object... params) {
        System.out.println("Nope card played. Check all players for Nope responses in UI.");
    }
}
