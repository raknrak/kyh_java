package com.example.kyh_java.cond.ex;
// 삼항 연산자를 사용하기
public class Ex7Question {
    //x가 짝수이면  짝수, 홀수이면 홀수 출력

    public static void main(String[] args) {
        int x = 2;
        String result = (x% 2 == 0) ? "짝수":"홀수";
        System.out.println(x+" 는"+result+"입니다.");

    }
}
