package com.example.kyh_java.casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue : " + longValue); //longValue : 10

        doubleValue = intValue; // double -> int
        System.out.println("doubleValue : " + doubleValue); //doubleValue : 10.0

        doubleValue = 20L;
        System.out.println("doubleValue : " + doubleValue); //doubleValue : 20.0

    }
}
