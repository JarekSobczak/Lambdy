package com.ownProjects.lambdas.operator;

import java.time.LocalDate;
import java.util.function.BinaryOperator;

public class BinaryOperatorUse {

    public static void main(String[] args) {

        //BinaryOperator to jak BiConsumer, ale zwraca coś po przetworzeniu dwóch parametrów..
        BinaryOperator<String> textConcat = new BinaryOperator<String>() {
            @Override
            public String apply(String text1, String text2) {
                return text1 + text2;
            }
        };
        System.out.println(textConcat.apply("dwa ","słowa"));
        //i lambda ..
        BinaryOperator<String>textConcatLambda=(word1,word2)->word1+word2;
        System.out.println(textConcatLambda.apply("dwa ","wyrazy"));

        //BinaryOperator, który zwróci większą datę ..
        BinaryOperator<LocalDate>newerDate=((localDate, localDate2) -> localDate.isAfter(localDate2)?localDate:localDate2);
        System.out.println(newerDate.apply(LocalDate.now(), LocalDate.now().plusYears(2)));
    }
}
