package com.example.kyh_java.cond.ex;

public class Ex5Question {
    //A: 탁월한 성과입니다.
    //B: 좋은 성과입니다.
    //C: 준수한 성과입니다.
    //D: 향상이 필요합니다.
    //E: 불합격입니다.
    //나머지 : 잘못된 학점입니다.
    public static void main(String[] args) {
        String grade = "B";

        switch (grade){
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니!.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "E":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }

    }
}
