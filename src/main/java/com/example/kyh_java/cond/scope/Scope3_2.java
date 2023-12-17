package com.example.kyh_java.cond.scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        //int temp = 0;
        if(m > 0){
           int  temp = m * 2; // 꼭 필요한 곳으로 범위를 한정시키기
            System.out.println("temp = " + temp);
        }
        System.out.println(" m = " + m);
    }
}
