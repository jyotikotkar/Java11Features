package com.backbase.string.api;

import java.util.HashMap;

/**
 * Program to explain New String API in Java 11
 * - isBlank()
 * - lines()
 * - strip()
 * - repeat()
 */
public class NewStringApi {

    public static void main(String args[]) {
/*

        System.out.println("###########Sample Code for - isBlank()#########");
        //Sample Code for - isBlank()
        var blankStringWithoutSpaces = "";
        var blankStringWithSpace = " ";
        System.out.println(blankStringWithoutSpaces.isBlank());
        System.out.println(blankStringWithSpace.isBlank());


       System.out.println("#############Sample Code For -lines()############");

        //Sample Code For -lines()
        String message = "we\nlove\nbackbase\nand\njava";
        System.out.println(message);
        var stream = message.lines();
        stream.forEach(str->System.out.println(str));

        System.out.println("#############Sample Code For -strip()################");
*/
      //Sample Code For -strip()
        var mission = " Become the Bank that people love ";
        var updatedMission = mission.strip();
        System.out.println("@@@"+mission+"@@@");
        System.out.println("@@@"+updatedMission+"@@@");

      /*  System.out.println("###############Sample Code For -repeat()################");
        //Sample Code For -repeat()
        var repeatMessage = "love ";
        int repeatCount= 2 ;
        var updatedMessage = repeatMessage.repeat(repeatCount);
        System.out.println(updatedMessage);

        System.out.println("####################################################");
*/
    }
}
