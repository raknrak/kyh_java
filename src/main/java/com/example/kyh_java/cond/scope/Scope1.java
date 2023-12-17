package com.example.kyh_java.cond.scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if(true){
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m); // 블록 내부, 외부에서 다 접근 가능.
            System.out.println("if x = " + x); // 블록 내부에서만 접근 가능
        } // x 생존 종료
        // System.out.println("main x = " + x); // x 에 접근 불가
        System.out.println("main m = " + m);
    } // m 생존 종료

}
