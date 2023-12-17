package com.example.kyh_java.loop;

// i부터 하나씩 증가하는 수를 endNum까지 더하시오
public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        /*sum = sum + i; // 0 + 1 = 1
        System.out.println("i = " + i + " sum=" + sum); //i = 1 sum=1
        i++; // i를 증가 시키기

        sum = sum + i; // 1 + 2 = 3
        System.out.println("i = " + i + " sum=" + sum); //i = 2 sum=3
        i++;

        sum = sum + i; // 3 + 3 = 6
        System.out.println("i = " + i + " sum=" + sum); //i = 3 sum=6
        i++; // endNum이 3 이므로 3번 반복해야함.
*/
        // i =1, endNum = 3
        while(i <=endNum){
            sum = sum+i;
            System.out.println("i = " + i + " sum=" + sum);
            i++;
        }

    }
}
