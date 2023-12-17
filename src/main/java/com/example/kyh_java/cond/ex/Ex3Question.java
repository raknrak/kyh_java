package com.example.kyh_java.cond.ex;

public class Ex3Question {
    public static void main(String[] args) {
        // 달러가 0 미만이면 : "잘못된 금액입니다."
        // 달러가 0 일 때 : "환전할 금액이 없습니다."
        // 달러가 0 초과일 때 : "환전 금액은(계산된 원화 금액)원입니다."

        int dollar = 10;
        if(dollar <= 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 : " + won + "원입니다");
        }
    }
}
