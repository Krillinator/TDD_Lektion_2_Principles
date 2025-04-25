package com.demo.lektion2.principle.solid.openclosed;

public class Coin implements IReward {
    @Override
    public void giveReward() {
        System.out.println("COINS");
    }

    void giveCurrency() {}
}
