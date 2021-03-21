package com.backbase.file.api;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *  Java 11 - Program to explain New  File methods in Java 11
 * - It's now easier to read and write Strings from files.
 * - We can use the new readString and writeString static methods from the Files class with charset
 */
public class ReadWriteStringWithCharset {

    public static void main(String[] args) throws IOException {
        Charset latinCharset = Charset.forName("ISO-8859-3");
        Path path = Files.writeString(
                Files.createTempFile("test", ".txt"), "test filum", latinCharset);
        System.out.println(path);
        String fileString = Files.readString(path, latinCharset);
        System.out.println(fileString);
    }
}
