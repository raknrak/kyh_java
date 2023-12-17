package com.example.kyh_java.loop;

// i부터 하나씩 증가하는 endNum까지 더하기
public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;
        for (int i = 1; i<=endNum; i++){
            sum = sum+ i;
            System.out.println("i 는 : " + i + " sum은 " +sum);
        }

    }
}
    /*  i 는 : 1 sum은 1
        i 는 : 2 sum은 3
        i 는 : 3 sum은 6 */