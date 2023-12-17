package com.example.kyh_java.operator.ex;

public class Ex1Question {
    // 1. num1, num2, num3이라는 이름의 세 개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화
    // 2. 세 변수의 합을 계산하고, 그 결과를 sum 이라는 int 변수에 저장
    // 3. 세 변수의 평균을 계산하고, 그 결과를 average라는 이름의 int 변수에 저장
    // 평균 계산 시 소수점 이하의 결과는 버림
    // 4. sum 과 average 변수의 값을 ㅈ출력
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3; // int 끼리의 나눗셈은 자동으로 소수점 이하를 버림
        System.out.println("sum = "+ sum); // 60
        System.out.println("average = "+ average); // 20
    }
}
