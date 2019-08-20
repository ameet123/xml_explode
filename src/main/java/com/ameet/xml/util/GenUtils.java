package com.ameet.xml.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GenUtils {
    public static void writeAvroSchema(String s) throws IOException {
        String path = "generated/quotePolicy.avsc";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.CREATE);
    }
}
