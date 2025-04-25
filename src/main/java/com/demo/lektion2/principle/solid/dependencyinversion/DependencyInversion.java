package com.demo.lektion2.principle.solid.dependencyinversion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DependencyInversion {

    // What type is nameList?
    void test(List<String> newList) {
        List<String> nameList = newList;
    }

    // THIS WORKS because of polymorphism!
    void fakeMain() {
        test(new ArrayList<>());
        test(new LinkedList<>());
    }

    // Dependency Inversion == CORRECT APPROACH
    void testPaymentMethod() {
        PaymentMethod paymentMethod = new PaymentMethod(
                new Currency("EURO")
        );
    }

}
