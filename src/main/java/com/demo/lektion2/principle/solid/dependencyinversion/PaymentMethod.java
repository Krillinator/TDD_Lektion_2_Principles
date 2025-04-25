package com.demo.lektion2.principle.solid.dependencyinversion;

public class PaymentMethod {

    // Breaks dependency inversion due to 'new' keyword
    // private Currency currency = new Currency("");

    // Do this instead!
    private Currency currency;

    public PaymentMethod(Currency currency) {
        this.currency = currency;
    }
}
