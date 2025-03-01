package com.IO;
//
//public class IO9 {
//
//}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IO9 {
    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);
    	
        String filePath = read.next();
        Path path = Paths.get(filePath);

        try {
            byte[] fileBytes = Files.readAllBytes(path);
            System.out.println("File content as byte array:");
            for (byte b : fileBytes) {
                System.out.print(b + " ");
            }
            String fileContent = new String(fileBytes);
            System.out.println("\n\nFile content as String:");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}