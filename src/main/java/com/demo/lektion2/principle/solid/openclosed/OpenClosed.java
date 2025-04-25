package com.demo.lektion2.principle.solid.openclosed;

// Explanation -


public class OpenClosed {

    // Bad Example
    void rewardSystem(String rewardType) {
        if (rewardType == "coin") {
            System.out.println("coin");
        } else if (rewardType == "weapon") {
            System.out.println("weapon");
        } else if (rewardType == "potion") {
            System.out.println("Potion");
        }
    }

    // Solution: Polymorphism (OOP)

}
