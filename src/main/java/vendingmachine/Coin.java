package vendingmachine;

import java.util.Arrays;

public enum Coin {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    // 추가 기능 구현
    public static Coin getCoin(int amount) {
        return Arrays.stream(Coin.values())
                .filter(coin -> coin.isMatch(amount))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] getCoin exception"));
    }

    private boolean isMatch(int amount) {
        return this.amount == amount;
    }

    public int getAmount() {
        return amount;
    }
}
