package chapter2;

import java.awt.*;

public class PracticeProblems {
    public static void main(String[] args) {
//        2-1
//        boolean : 1byte(1bit로해도되지만 자바 최소 데이터단위가 1byte임.)
//        char : 2byte, byte : 1byte, short : 2byte, int : 4byte, long : 8byte, float : 4byte, double : 8byte
//        참고로 1byte는 8bit이다.
//        2-2
        long regNo = 9603071552012L;
//        int의 범위를 넘어선다.. long 타입으로 정수 저장하자.
//        2-3
//        리터럴 : 100, 100L, 3.14f
//        변수 : i, l
//        키워드 : int, long, float, final (참고로이 키워드는 상수를 나타내는 키워드)
//        상수 : PI (참고로 상수는 단한번만 값을 저장할수있는공간)

//        2-4
//        Byte(byte여야함)
//        primitive  : boolean, char, byte short int long, float ,double
//        나머진 전부 ref타입

//        2-5
//        "12"
//        "true"
//        131임. char는 유니코드로 저장된다했지..
//        51, '1'의 문자코드(인코딩한값)이 49란다 ! ㅠ
//        '1'의 문자코드 49, '2'의 문자코드 50이라 더하면 99.
//        "Java"
//        오류

//        2-6
//        b, c, d (대소문자 구분함) 키워드 = 예약어 + 추가로
//        System도 예약어가아니다.

//        2-7
//        a, e, g , d(If는 예약어, 키워드아님 if가 키워드임)

//        2-8
        /*
        모르겠음 ref타입 크기가뭔데?
        reftype의 크기는 4byte이므로 int와 float과 크기가같다.
        a, d
         */
//        2-9
        /*
        자동형변환은 값 범위가 작은 타입-> 값 범위가 칸 타입은 생략가능(loss of data)가 없어야
        형변환 생략가능
        d, e
//        참고로 b는 char가 2byte라 자동형변환 될거같지만
//        char는 부호없으므로 자동형변환안된다..
         */

//        2-10
        /*
        char는 2byte이고 부호가없당
        0 ~ 65535
         */

//        2-11
        /*
        a, b, c, d
         */

//        2-12
//        a, b, c, e

//        2-13
//        c, e, f
//        default값을 구하라는거임. 나는 맞는 타입을 물어본줄 ㅋㅋ;
//        float - 0.0F
//        long = 0L
//        String : ""이라생각할수도 있지만 default값은 null임.

//        오답Notes
        System.out.println('1' + '2');
        System.out.println((int)'1');

        System.out.println('A' + 'B');

//        참고로 reference 타입의 크기는 4byte이다.(int와 float과 같다.)
        double d = 1.4e3F;
//        8byte에 4byte넣는것이므로 OK..

        String name ="";
        System.out.println(name);

        float f = 1234.3F;

        byte b1 = 123;
        short s1 = 1234;
        int n1 = 12345;
        long sequences = 100_000_000_000L;
    }
}
