package org.example.BuilderPattern.PhoneApp;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder()
                .setOs("Android")
                .setRam(2).build();
        System.out.println(p.toString());
    }
}
