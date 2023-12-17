package com.example.kyh_java.cond.ex;

public class Ex4Question {
    public static void main(String[] args) {
        // 어바웃타임 - 평점 9
        // 토이 스토리 - 평점 8
        // 고질라 - 평점 7
        // 3개 다 추천
        double rating = 6.9;

        if (rating <=9) {
            System.out.println("'어바웃타임'을 추천합니다.");

        }
        if (rating <=8) {
            System.out.println("'토이 스토리'를 추천합니다.");

        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
