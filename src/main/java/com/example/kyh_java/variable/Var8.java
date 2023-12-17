package com.example.kyh_java.variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        // 정수리터럴은 int를 기본으로 사용한다.
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)
        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; // 대문자 L을 추가해야함.
        //실수
        //실수 리터럴은 double을 기본으로 사용한다.
        float f = 10.0f; // 뒤에 f를 붙여야함.(오류 많이 발생)
        double d = 10.0;
    }
}
