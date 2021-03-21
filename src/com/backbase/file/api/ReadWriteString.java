package com.backbase.file.api;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *  Program to explain New  File methods in Java 11
 * - It's now easier to read and write Strings from files.
 * - We can use the new readString and writeString static methods from the Files class
 */
public class ReadWriteString {
    public static void main(String args[]) throws IOException {

        Path path = Files.writeString(
                Files.createTempFile("test", ".txt"), "test file content");
        System.out.println(path);

        String s = Files.readString(path);
        System.out.println(s);
    }
}
