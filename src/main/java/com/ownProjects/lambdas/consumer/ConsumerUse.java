package com.ownProjects.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerUse {
    public static void main(String[] args) {
        //Consumer przyjmuje typ, przetwarza go ale nie zwraca ..
        Consumer<String>display=new Consumer<String>(){

            @Override
            public void accept(String text) {
                System.out.println(text);
            }
        };
        display.accept("To jest tekst bez lambdy");
        // a lambda ..
        Consumer<String>displayLambda=text-> System.out.println(text);
        displayLambda.accept("To jest tekst z lambdą");

        //consumer przyjmie double i wyświetli wartość jego kwadratu ..

        Consumer<Double>square=doub-> System.out.println(doub*doub);
        square.accept(3.14);
    }
}
