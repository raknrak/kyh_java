package com.example.kyh_java.loop.ex;

// 피라미드 출력
// int rows 선언
// rows = 2
// *
// **
public class Ex5Question {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
