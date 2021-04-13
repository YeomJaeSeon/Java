package chapter9.math;

import static java.lang.Math.*;

public class Ex1 {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println(round(val));
        //Math.round는 무조건 소수점 첫번째자리에반농ㄹ.ㅁ

        val *= 100;
        System.out.println(round(val));
        System.out.println(round(val) / 100); // 정수끼리의 연산은 소주점버림
        System.out.println(round(val) / 100.0); // double로 나누면 됨. 이렇게되면 소수점 셋쨰자리에서 반올림한격

        System.out.println(ceil(1.1));
        System.out.println(floor(1.5));
        System.out.println(round(1.1));
        System.out.println(round(1.5));

    }
}
