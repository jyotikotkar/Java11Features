package com.backbase.string.api;

/**
 * Program to explain New String API in Java 11
 * - isBlank()
 * - lines()
 * - strip()
 * - repeat()
 */
public class BlankStringApiExamples {

    public static void main(String args[]) {
        System.out.println("###########Sample Code for - isBlank()#########");
        //Sample Code for - isBlank()
        String s = "  ";
        //old isEmpty() method
        boolean empty = s.isEmpty();
        System.out.println(empty);
        //new isBlank()
        boolean blank = s.isBlank();
        System.out.println(blank);
    }
}
