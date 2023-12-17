package com.example.kyh_java.operator.ex;

public class Ex3Question {
    public static void main(String[] args) {
        // int형 변수 score 선언
        // score가 80점 이상이고, 100점 이하면 true, 아니면 false
        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result); // true
    }
}
