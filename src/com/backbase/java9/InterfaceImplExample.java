package com.backbase.java9;

public class InterfaceImplExample implements InterfaceExample {

    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args){
        InterfaceExample instance = new InterfaceImplExample();
        instance.method1();
        instance.method2();
        InterfaceExample.method3();
    }
}
