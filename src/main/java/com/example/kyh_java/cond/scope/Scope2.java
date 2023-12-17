package com.example.kyh_java.cond.scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for(int i = 0; i <2; i++){ // 블록 내부, for문 내부.
            System.out.println("for m = " + m); // 블록 내부, 외부 다 접근 가능.
            System.out.println("for i = " + i);
        }
        System.out.println("for m = " + m); // 블록 내부, 외부 다 접근 가능.
       // System.out.println("for i = " + i); // i에 접근 불가
    }

}
