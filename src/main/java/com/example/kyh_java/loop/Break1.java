package com.example.kyh_java.loop;

public class Break1 {
    // 1부터 시작해서 합계가 10보다 처음으로 큰 값은 얼마인가?
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(true){ // 무한반복.
            sum += i;
            if(sum>10){
                System.out.println("합이 10 보다 크면 종료 : i =" + i + " sum = " + sum);
                // 합이 10 보다 크면 종료 : i =5 sum = 15
                break; // 이게 없으면 계속 반복.
            }
            i++; // sum이 10 미만일때 i를 증가시키고 계속 반복
        }
    }
}
