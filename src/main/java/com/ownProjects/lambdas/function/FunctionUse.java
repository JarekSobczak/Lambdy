package com.ownProjects.lambdas.function;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionUse {
    public static void main(String[] args) {
        //zamiana jednego typu T na inny R
        Function<String, LocalDate> textToDate = new Function<String, LocalDate>() {
            @Override
            public LocalDate apply(String textDate) {
                return LocalDate.parse(textDate);
            }
        };
        LocalDate date = textToDate.apply("2001-01-20");
        System.out.println(date);
        //lub jako lambda:
        Function<String, LocalDate> textToDateLambda = text -> LocalDate.parse(text);
        LocalDate dateLambda = textToDateLambda.apply("1987-11-21");
        System.out.println(dateLambda);

        //zamiana Stringa na Integera ..

        Function<String, Integer> stringIntegerFunction = text -> Integer.valueOf(text);
        Integer value = stringIntegerFunction.apply("1234");
        System.out.println(value);

        //zamiana listy stringów na jej pierwszy element ..
        Function<List<String>, String> getFirstWord = list -> {
            return list.isEmpty() ? null : list.get(0);
        };
        System.out.println(getFirstWord.apply(Arrays.asList("jeden", "dwa", "trzy")));
    }
}
