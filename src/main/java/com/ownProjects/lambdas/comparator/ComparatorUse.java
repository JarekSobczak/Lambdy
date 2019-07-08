package com.ownProjects.lambdas.comparator;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorUse {
    public static void main(String[] args) {

//Comparator porównuje dwa zadeklarowane parametry - zwraca o ile jeden parametr jest większy od drugiego ..

        Comparator<String> textCompare = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        System.out.println(textCompare.compare("pies", "ala"));
        // i lambda ..

        Comparator<String> textCompareLambda = (text1, text2) -> text1.length() - text2.length();
        System.out.println(textCompareLambda.compare("Zbigniew", "Kot"));

        // pownanie dwóch dat na podstawie miesiąca ..

        Comparator<LocalDate> dateCompareLambda = (date1, date2) -> date1.getMonth().compareTo(date2.getMonth());
        System.out.println(dateCompareLambda.compare(LocalDate.of(2010, 01, 20), LocalDate.of(1999, 12, 12)));

        // porównanie liczb całkowitych na podstawie ich wartości bezwzględnej ..

        Comparator<Integer> valueCompare = (val1, val2) -> Math.abs(val1) - Math.abs(val2);
        System.out.println(valueCompare.compare(-11, 9));

    }
}
