package second.chapter14.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface MyFunction{
    int max(int a, int b);
}

public class TEst {
    public static void main(String[] args) {

        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return Math.max(a, b);
            }
        };

        System.out.println(f.max(10, 20));

        MyFunction f2 = (a, b) -> a > b ? a : b;

        // 람다식은 익명객체, 람다식과 익명객체의 선언부가 일치하므로 익명객체대신 람다식을 사용할수있다.

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.sort(integers, (o1, o2) -> o1.compareTo(o2) * -1);
        System.out.println(integers);



        MyFunction2 myFunction2 = new MyFunction2() {
            @Override
            public int min(int a, int b) {
                return Math.min(a, b);
            }
        };
        // 익명 클래스를 통해서 익명객체를 만들어서(일회용클래스 - 클래스정의와동시에 객체생성)
        // 인터페이스의 메서드를 구현

        System.out.println(myFunction2.min(-10, -20));

        MyFunction2 myFunction21 = (o1, o2) -> Math.min(o1, o2);
        // 람다식으로 인터페이스의 메서드를 쉽게구현
        // 1. 인터페이스의 추상메서드와 람다식의 선언부가 일치, 2. 람다식자체가 익명객체이다.

        System.out.println(myFunction21.min(100, 300));

    }
}

interface MyFunction2{
    int min(int a, int b);
}