package vendingmachine.domain;

import vendingmachine.Coin;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class MachineMoney {

    public void getVendingMachineMoney(int machineMoney) {
        while (machineMoney > 0) {
            int randomCoinAmt = Coin.getRandomCoinAmt();
            int coinCount = pickNumberInRange(0, machineMoney / randomCoinAmt);
            Coin.getCoin(randomCoinAmt).setCount(coinCount);

            machineMoney -= coinCount * randomCoinAmt;
        }
    }


}
