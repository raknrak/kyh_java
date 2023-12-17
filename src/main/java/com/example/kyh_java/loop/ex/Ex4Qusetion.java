package com.example.kyh_java.loop.ex;
// for문을 사용하여 구구단 출력
// 2단 부터
public class Ex4Qusetion {
    public static void main(String[] args) {
        for(int i = 2; i<=9; i++){
            for (int j = 1; j<=9; j++){
                System.out.println(i + "*" + j +" = "+ i * j );
            }
        }
    }
}
