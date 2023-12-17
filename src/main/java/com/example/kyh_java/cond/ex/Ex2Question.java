package com.example.kyh_java.cond.ex;

public class Ex2Question {
    // 거리가 1km 이하면 "도보"
    // 거리가 10km 이하면 "자전거"
    // 거리가 100km 이하면 "자동차"
    // 거리가 100km 초과면 "비행기"
    //distance 1 : 도보를 이용하세요
    //distance 5: 자전거를 이용하세요
    //distance 25: 자동차를 이용하세요
    // distance 150 : 비행기를 이용하세요
    public static void main(String[] args) {
        int distance = 25;

        if (distance <= 1){
            System.out.println("도보를 이용하세요");

        } else if (distance <= 10) {
            System.out.println(" 자전거를 이용하세요");

        } else if (distance <= 100) {
            System.out.println(" 자동차를 이용하세요");

        } else  {
            System.out.println(" 비행기를 이용하세요");

        }
    }
}
