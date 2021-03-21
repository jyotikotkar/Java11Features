package com.backbase.collection.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Sample Program for checking Predicate not
 */
public class PersonPredticateTest {

    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person(1),
                new Person(18),
                new Person(2)
        );

        //filter list if adults
        people.stream()
                .filter(Person::isAdult)
                .collect(Collectors.toList());

        //filter list if not adults
        people.stream()
                .filter(person -> !person.isAdult())
                .collect(Collectors.toList());

        //Add new api in person class to check isNotAdult
       // people.stream().filter(Person::isNotAdult).collect(Collectors.toList());

        //new way
        people.stream().filter(Predicate.not(Person::isAdult)).collect(Collectors.toList());

    }
}
