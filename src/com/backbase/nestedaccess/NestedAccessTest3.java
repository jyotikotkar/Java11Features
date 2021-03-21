package com.backbase.nestedaccess;

import java.lang.reflect.Field;

public class NestedAccessTest3 {

    private static int x = 5;

    public static void main(String[] args) throws Exception {
        NestedTest.doSomething();
        System.out.println(NestedAccessTest3.x);
    }

    public static class NestedTest {
        public static void doSomething() throws Exception {
            Field x = NestedAccessTest3.class.getDeclaredField("x");
            //x.setAccessible(true);
            x.setInt(null, 10);
        }
    }
}
