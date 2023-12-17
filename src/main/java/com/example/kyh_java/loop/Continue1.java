package com.example.kyh_java.loop;

// 1부터 5 까지 숫자를 출력하는데, 숫자가 3 일때는 출력은 건너 뛴다.
public class Continue1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5){
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(" i : " + i);
            i++;
        }
    }
}
/*
 i : 1
 i : 2
 i : 4
 i : 5
 */
