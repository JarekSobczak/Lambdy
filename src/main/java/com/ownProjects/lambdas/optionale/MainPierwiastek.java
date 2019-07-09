package com.ownProjects.lambdas.optionale;

import java.util.Optional;

public class MainPierwiastek {
    public static void main(String[] args) {
        //Optional opakowuje niejako wynik, jeżeli parametr wejściowy będzie nie do przyjęcia, nie rzuci wyjątkiem, a jeżeli będzie ok, to pokaże wynik ..
        Optional<Double> result = Pierwiastek.squareRoot(-2);
        result.ifPresent(val -> System.out.println("Wynik " + val));
        //można wynik zmapować, czyli w rezultacie zastosować Functionala, który zamieni nam np. doubla na stringa ..
        String display = result.map(value -> "Wynik :" + value)
                .orElse("Z tej liczby nie da się wyciągnąć pierwiastka ..");
        System.out.println(display);
        //albo tak, za pomocą suppliera ..
        String display2 = result.map(val -> "Wynik to " + val)
                .orElseGet(() -> "Nie da się obliczyć pierwiastka ");
        System.out.println(display2);
        // a jeszcze można rzucić wyjątkiem ..
        String display3 = result.map(value -> "Wynik - " + value)
                .orElseThrow(() -> new IllegalArgumentException("Z liczby ujemnej pierwiastka nie wyciągnę !"));
        System.out.println(display3);
    }
}
