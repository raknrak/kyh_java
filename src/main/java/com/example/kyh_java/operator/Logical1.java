package com.example.kyh_java.operator;

public class Logical1 {
    public static void main(String[] args) {
        // 두 피 연산자가 모두 참이어야 함
        System.out.println("&& : AND 연산");
        System.out.println(true && true); // true
        System.out.println(true && false); // flase
        System.out.println(false && false); // false
        // 두 피 연산자 중 하나라도 참이면 true, 모두 false 이면 false 반환
        System.out.println(" || : OR 연산");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false
        // 참이면 거짓을, 거짓이면 참을 반환함.
        System.out.println("! 연산");
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println("변수 활용");

        boolean a= true;
        boolean b= false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // ture
    }
}
