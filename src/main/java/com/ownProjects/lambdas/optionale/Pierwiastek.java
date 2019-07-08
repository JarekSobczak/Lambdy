package com.ownProjects.lambdas.optionale;

import java.util.Optional;

public class Pierwiastek {
    Optional<Double>squareRoot(double value){
        if (value<0){
            return Optional.empty();
        }
        double root=Math.sqrt(value);
        return Optional.of(root);
    }

}
