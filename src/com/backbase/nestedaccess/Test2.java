package com.backbase.nestedaccess;

import java.util.Arrays;
import java.util.concurrent.Flow;

public class Test2 {
    public static void main(String[] args) {
        findNests(String.class);
        findNests(Flow.Subscriber.class);
    }

    private static void findNests(Class<?> klass) {
        System.out.printf("-- finding Nests for class=%s --%n", klass.getSimpleName());
        System.out.println("nested members:");
        Class<?>[] nestMembers = klass.getNestMembers();
        Arrays.stream(nestMembers)
                .map(Class::getSimpleName)
                .forEach(System.out::println);

        System.out.println("nested host:");
        Class<?> nestHost = klass.getNestHost();
        System.out.println(nestHost.getSimpleName());
    }
}
