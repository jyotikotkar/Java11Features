package com.backbase.java9;

import java.util.Optional;

public class IsPresentOrElaseExample {

    public static void main(String[] args)
    {
        // create a Optional with value
        Optional<Integer> op
            = Optional.of(9455);

        // create a Optional with empty value
//        Optional<Integer> op
//            = Optional.empty();


        // print value
        System.out.println("Optional: "
            + op);

        // apply ifPresentOrElse
        op.ifPresentOrElse(
            (value)
                -> { System.out.println(
                "Value is present, its: "
                    + value); },
            ()
                -> { System.out.println(
                "Value is empty"); });
    }
}


