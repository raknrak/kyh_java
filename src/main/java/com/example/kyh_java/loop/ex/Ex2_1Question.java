package com.example.kyh_java.loop.ex;

/*반복문을 사용하여 10개의 짝수를 출력하기
num이라는 변수 사용
while과 for 두 가지 버전 */

public class Ex2_1Question {
    public static void main(String[] args) {
        System.out.println("--while 버전--");
        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num = num + 2;
            count++;
        }
    }
}



