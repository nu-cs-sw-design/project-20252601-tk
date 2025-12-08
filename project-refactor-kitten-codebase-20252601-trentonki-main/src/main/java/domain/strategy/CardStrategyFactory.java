package domain.strategy;

import domain.game.CardType;

public class CardStrategyFactory {

    public static CardPlayStrategy getStrategy(CardType type) {
        if (type == CardType.EXPLODING_KITTEN) {
            return new ExplodingKittenStrategy();
        } else if (type == CardType.NOPE) {
            return new NopeStrategy();
        } else if (type == CardType.SHUFFLE) {
            return new ShuffleStrategy();
        } else if (type == CardType.SKIP || type == CardType.SUPER_SKIP) {
            return new SkipStrategy();
        } else {
            return null; // allows to fallback to old logic for non-refactored cards
        }
    }
}
