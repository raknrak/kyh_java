package com.example.kyh_java.loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는 : " + i); // 현재 숫자는 : 10
            i++;
        } while ( i < 3);
        // 실행 후 조건문을 만남
        // true 면 다시 실행
        // false면 종료
    }
}
