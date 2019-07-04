package com.ownProjects.lambdas.operator;

import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class UnaryOperatorUse {

    public static void main(String[] args) {

        //unaryoperator trochę przypomina consumera, tj. przyjmuje parametr, tyle, że zwraca go po przetworzeniu, a consumer zwraca void, czyli nic ..
        UnaryOperator<LocalDate> dateInNextYear = new UnaryOperator<LocalDate>() {
            @Override
            public LocalDate apply(LocalDate localDate) {
                return localDate.plusYears(1);
            }
        };
        System.out.println(dateInNextYear.apply(LocalDate.now()));

        //i tradycyjnie to samo lambdą ..

        UnaryOperator<LocalDate>dateInNYLambda=date->date.plusYears(1);
        System.out.println(dateInNextYear.apply(LocalDate.now()));

        //UnaryOperator, który przyjmie stringa i zwróci pierwszą litere ..

        UnaryOperator<String>firstLetter=text->
            text.isEmpty() ? null:text.substring(0,1);
        System.out.println(firstLetter.apply("Jarosław"));
    }
}
