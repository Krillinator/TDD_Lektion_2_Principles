package com.demo.lektion2.principle.solid.openclosed;

public class Potion implements IReward {
    @Override
    public void giveReward() {
        System.out.println("Potions");
    }

    void drink() {}

    // new features - without disturbing COINS
}
