package com.backbase.nestedaccess;

import java.util.Arrays;

public class Test {

        public class NestedTestA {
        }

        public class NestedTestB {
        }

        public static void main(String[] args) {
            findNests(Test.class);
            findNests(NestedTestA.class);
            testNestMates(NestedTestA.class, NestedTestB.class);
            testNestMates(NestedTestA.class, Test.class);
            testNestMates(Test.class, NestedTestA.class);
            testNestMates(Test.class, Test.class);
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

        private static void testNestMates(Class<?> klass1, Class<?> klass2) {
            boolean b = klass1.isNestmateOf(klass2);
            System.out.printf("%s isNestmateOf %s = %s%n", klass1.getSimpleName(), klass2.getSimpleName(), b);

        }
}
