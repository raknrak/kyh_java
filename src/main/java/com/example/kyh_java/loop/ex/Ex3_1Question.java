package com.example.kyh_java.loop.ex;
// 반복문을 사용하여 1부터 max 까지의 합을 계산하고 출력
// 이때 sum이라는 변수를 사용하여 누적 합을 표현하고,
// i라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수를 수행)
// while과 for 두 가지 버전.

public class Ex3_1Question {
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        int i = 1;
        while(i<=max){
            sum +=i;
            i++;
        }
        System.out.println("i : " + i + " sum : " + sum);
    }
}
