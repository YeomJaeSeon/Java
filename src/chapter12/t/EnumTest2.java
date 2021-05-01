package chapter12.t;

import java.util.Arrays;

enum Kind{CLOVER, SPACE, HEART, SPADE, KING, QUEEN}
enum NUM{ONE, TWO, THREE, FOUR, FIVE}

// 열거형 enum이란 관련된 상수들을 묶은것
//자바 열거형enum은 타입도 체크하기때문에 더 안전함 (C 열거형보다.)

public class EnumTest2 {
    public static void main(String[] args) {
        Kind kind1 = Kind.CLOVER;
        Enum kine2 = (Enum)Kind.SPACE;// 다형성 ㅋㅋ;
        Kind kind3 = Kind.HEART;
        // 상수 접근 이렇게 할수있음 열거형이름.상수

        Kind kind4 = Kind.valueOf("QUEEN");
        Kind kind5 = Kind.valueOf(Kind.class, "QUEEN");

        System.out.println("kind4 = " + kind4);
        System.out.println("kind5 = " + kind5);

        System.out.println(kind4 == kind5);

        System.out.println("kind4.equals(kind5) = " + kind4.equals(kind5));

        System.out.println("kind4.compareTo(kind5) = " + kind4.compareTo(kind5));

        System.out.println("kind1 = " + kind1);
        System.out.println("kind2 = " + kine2);

        Kind[] kinds = Kind.values();
        for (Kind kind : kinds) {
            System.out.println(kind.name() +": " + kind.ordinal());
        }

        NUM[] values = NUM.values();
        for(NUM value : values){
            System.out.println(value.name() +": " + value.ordinal());
        }

        System.out.println("Arrays.toString(kinds) = " + Arrays.toString(kinds));
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));



    }
}
