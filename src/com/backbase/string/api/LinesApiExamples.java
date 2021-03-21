package com.backbase.string.api;

public class LinesApiExamples {

    public static void main(String args[]) {
        //Sample Code For -lines()
        String s = "jujube\nsatsuma\nguava";
        s.lines()
            .forEach(System.out::println);
    }
}
