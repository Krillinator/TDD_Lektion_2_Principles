package com.demo.lektion2.principle.solid.interfacesegregation;

public interface InterfaceSegregationProblem {

    void eat(); // All animals can EAT
    void fly(); // Not all animals can FLY...

    // Solution: Break them apart into separate interfaces!

}
