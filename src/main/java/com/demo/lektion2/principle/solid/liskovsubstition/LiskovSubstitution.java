package com.demo.lektion2.principle.solid.liskovsubstition;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {

    // Polymorphism : Problem explained
    void test() {
        Zebra zebra = new Zebra();
        Zebra zebraOne = new Zebra();
        Zebra zebraTwo = new Zebra();

        Snake snake = new Snake();

        List<Zebra> zebraPenList = new ArrayList<>();
        zebraPenList.add(zebra);
        zebraPenList.add(zebraOne);
        zebraPenList.add(zebraTwo);
        // zebraPenList.add(snake); // This won't work
    }

    // Refactoring code for a ZOO
    void zoo() {
        Zebra zebra = new Zebra();
        Zebra zebraOne = new Zebra();
        Zebra zebraTwo = new Zebra();

        Snake snake = new Snake();

        List<Animal> zoo = new ArrayList<>();
        zoo.add(zebra);
        zoo.add(zebraOne);
        zoo.add(zebraTwo);
        zoo.add(snake); // Polymorphism thanks to Animal interface
    }

}
