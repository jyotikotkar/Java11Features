package com.backbase.collection.api;


import java.util.Arrays;
import java.util.Set;

/**
 * With Java 11
 * -
 */
public class NewCollectionAPI {

    public static void main(String args[]) {
        final Set<String> names = Set.of("Fred", "Wilma", "Barney", "Betty");
        System.out.println(Arrays.toString(names.toArray(String[]::new)));

    }
}
