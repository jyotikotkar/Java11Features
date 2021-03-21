package com.backbase.file.api;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *  Program to explain New  File methods in Java 11
 * - It's now easier to read and write Strings from files.
 * - We can use the new readString and writeString static methods from the Files class
 */
public class NewFileApi {
    public static void main(String args[]) throws IOException {
        Path tempDir = Path.of("/Users/santosh/Java11Trials/src/com/backbase/file/api");
        //writeString
        Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
        //readString
        String fileContent = Files.readString(filePath);
        System.out.println("Created file content is....." + fileContent.equals("Sample text"));
    }
}
