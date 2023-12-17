package com.example.kyh_java.loop;
// i부터 하나씩 증가하는 수르 3번 더해라.
// i ~ i+2더하기

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum = sum + i; // 0 + 1 = 1
        System.out.println("i = " + i + " sum=" + sum); //i = 1 sum=1
        i++; // i를 증가 시키기

        sum = sum + i; // 1 + 2 = 3
        System.out.println("i = " + i + " sum=" + sum); //i = 2 sum=3
        i++;

        sum = sum + i; // 3 + 3 = 6
        System.out.println("i = " + i + " sum=" + sum); //i = 3 sum=6
    }
    //i의 값만 변경해서 계산 가능
}
