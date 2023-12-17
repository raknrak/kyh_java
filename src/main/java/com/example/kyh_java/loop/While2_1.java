package com.example.kyh_java.loop;

//1부터 하나씩 증가하는 수를 3번 더하라
// while 사용하지 않고 무식하게 풀기
public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

        sum = sum + 1; // 0 + 1 = 1
        System.out.println("i = " + 1 + " sum=" + sum);

        sum = sum + 2; // 1 + 2 = 3
        System.out.println("i = " + 2 + " sum=" + sum);

        sum = sum + 3; // 3 + 3 = 6
        System.out.println("i = " + 3 + " sum=" + sum);
    }
}

