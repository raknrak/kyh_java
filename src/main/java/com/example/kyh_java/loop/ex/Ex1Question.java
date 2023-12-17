package com.example.kyh_java.loop.ex;

/*처음 10개의 자연수를 출력하는 프로그램 작성.
이때 count 라는 변수 사용.
while와 for문 두 가지 버전으로 작성하기.*/
public class Ex1Question {
    public static void main(String[] args) {
        System.out.println("--while 버전--");
        int count = 1;
        while(count <=10){
            System.out.println(count);
            count++;
        }
        System.out.println("--for 버전--");
        for(count = 1; count <=10; count ++){
            System.out.println(count);
        }
    }
}
