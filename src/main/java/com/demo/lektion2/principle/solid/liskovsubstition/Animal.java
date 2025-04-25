package com.demo.lektion2.principle.solid.liskovsubstition;

public interface Animal {
    void eat();
    // void fly(); // Breaks liskov's principle
    // Why? Will break the functionality for other animals...

    // Question: Imagine you have a Birdcage with one platform...
    // will an animal that can't fly be able to get to the platform?
    // Answer: NO... They can't fly...

    // To solve this problem we can also apply
    // Interface Segregation
}
