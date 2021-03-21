package com.backbase.collection.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * Java 11 - The Not Predicate Method
 * - A static not method has been added to the Predicate interface.
 * - We can use it to negate an existing predicate, much like the negate method:
 */
public class NotPredicateTest {

    public static void main(String args[]) {
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());

        System.out.println("List Before::::::" +sampleList );
        System.out.println("List After::::::" +withoutBlanks );
    }


}
