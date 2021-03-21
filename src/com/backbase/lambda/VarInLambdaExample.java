package com.backbase.lambda;

import java.util.stream.IntStream;

/**
 * - One benefit of using 'var' in lambdas is that , type annotations can be applied to local variables without losing brevity: (@Nonnull var x, @Nullable var y) -> x.process(y)
 * - Also we can use 'final' with var: (final var x) -> Math.pow(x, 4)
 */

public class VarInLambdaExample {

        //Java 11 allows local 'var' syntax of Java 10 to be used in lambda expressions (JEP 323).

        public static void main(String[] args) {
            //With var
            IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((var i) -> i % 3 == 0)
                .forEach(System.out::println);

            //Without var
            IntStream.of(1, 2, 3, 5, 6, 7)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

        }
}



