package com.backbase.string.api;

public class StripVaTrimApiExamples {

    public static void main(String args[]) {
        //Sample Code For -strip()
        String s = "test string\u205F";
        String striped = s.strip();
        System.out.printf("'%s'%n", striped);

        String trimmed = s.trim();
        System.out.printf("'%s'%n", trimmed);
    }
}