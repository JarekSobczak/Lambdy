package com.ownProjects.lambdas.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierUse {
    public static void main(String[] args) {
        //Supplier nie przyjmuje parametrów ale zwraca to, co ma dostarczyć, np. wywołaną metodę, wyjątek itp. ..
        Supplier<IllegalArgumentException> exceptionSupplier = new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException();
            }
        };
        // i lambda ..
        Supplier<IllegalArgumentException> exceptionSupplierLambda = () -> new IllegalArgumentException("Test interface'u Supplier");
        //  throw exceptionSupplierLambda.get();
        //Supplier dzisiejszej daty ..
        Supplier<LocalDate> today = () -> LocalDate.now();
        System.out.println(today.get());
        //Supplier stringa z imieniem ..
        Supplier<String> name = () -> "Jarosław";
        System.out.println(name.get());
    }
}
