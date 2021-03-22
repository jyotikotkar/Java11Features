package com.backbase.collection.api;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * With Java 11
 * - The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
 * - This makes it easier to create an array of the right type from a collection.
 * - A new default method toArray(IntFunction) has been added to the java.util.Collection interface.
 * - It returns a new array consisting of the elements of this collection. The provided generator function is used to allocate the returned array.
 * - The new method is an overloaded of the existing toArray(....) methods.
 */
public class NewCollectionAPI {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
       System.out.println(list);

       Integer[] array1 = list.stream().toArray(size -> new Integer[size]);
        System.out.println(Arrays.toString(array1));

        //new method
        Integer[] array2 = list.toArray(size -> new Integer[size]);
        System.out.println(Arrays.toString(array2));

        //or
        Integer[] array3 = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array3));
    }
}
