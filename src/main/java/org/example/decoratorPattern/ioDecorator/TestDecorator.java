package org.example.decoratorPattern.ioDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestDecorator {
    public static void main(String[] args) {
        // Try-with-resources handles closing streams automatically and safely
        try (InputStream in = new ToLowerCaseDecorator(
                new BufferedInputStream(
                        new FileInputStream("test.txt")))) {

            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}