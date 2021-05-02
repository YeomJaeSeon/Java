package chapter12.tests;

import java.util.ArrayList;
import java.util.List;

public class WhyGeneric {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        list.add("3"); // 컬렉션 - 데이터군집. 객체들의 군. 다양한 객체 다루는 클래스.
        list.add(3);
        Integer i = list.get(2);
        System.out.println("i = " + i); // OK

        // 지네릭 장점 1. 컴파일시 타입체크 -> 타입안전성(런타임 에러를컴파일에러로 가져와줬따.)
        // 2. 형변환 생략가능. 어짜피 Integer타입인걸 알기에 형변환 할필요가없다. ArrayList 는 Object[]지만서도 형변환이 필요없어짐. 사실 List, ArrayList가 지네릭 클래스이다.
    }
}
