package com.backbase.collection.api;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * With Java 11
 * - The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
 * - This makes it easier to create an array of the right type from a collection.
 */
public class NewCollectionAPI {

    public static void main(String args[]) {
        List<String> list = List.of("apple", "banana", "orange");
        List<Integer> integerList = List.of(1,2,3);

        //old methods
        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        //new method
        String[] array2 = list.toArray(String[]::new);
        System.out.println(Arrays.toString(array2));

        Integer[] array3 = integerList.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array3));

    }
}
