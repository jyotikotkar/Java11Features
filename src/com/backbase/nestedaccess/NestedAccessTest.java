package com.backbase.nestedaccess;

public class NestedAccessTest {

    private static int x = 5;

    public static class NestedTest {
        public static void doSomething() {
            System.out.println(x);
        }
    }
}
