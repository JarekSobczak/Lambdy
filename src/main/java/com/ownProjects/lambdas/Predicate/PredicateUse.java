package com.ownProjects.lambdas.Predicate;

import java.time.LocalDate;
import java.util.function.Predicate;

public class PredicateUse {
    public static void main(String[] args) {
        //Predicate zwraca wynik sprawdzenia : true albo false ..
        Predicate<LocalDate> date = new Predicate<LocalDate>() {
            @Override
            public boolean test(LocalDate localDate) {
                return localDate.isAfter(LocalDate.now());
            }
        };
        System.out.println(date.test(LocalDate.of(2019, 12, 12)));
        // no i lambda ..
        Predicate<LocalDate> dateLambda = localDate -> localDate.isAfter(LocalDate.now());
        System.out.println(dateLambda.test(LocalDate.of(2014, 01, 01)));
        //czy napis ma więcej niż 10 liter ..
        Predicate<String> textLength = text -> text.length() > 10;
        System.out.println(textLength.test("123456789abc"));
        System.out.println(textLength.test("123"));
        //sprawdzenie, czy w tekście są liczby ..

        Predicate<String> textCheck = text -> {
            for (char c : text.toCharArray()) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
            return false;
        };
        System.out.println(textCheck.test("Jarosl2w"));
        System.out.println(textCheck.test("Jarosław"));
    }
}
