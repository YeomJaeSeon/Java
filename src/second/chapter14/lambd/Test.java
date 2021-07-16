package second.chapter14.lambd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 30, 2, 10, 5, 5, 3);
        System.out.println(list);
        //인터페이스 추상메서드 구현하는 방법  - 익명 객체 (복잡함..)
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        //람다식도 익명객체임, 인터페이스에서 추상메서드 하나인 녀석은 선언부가 같으면 써도된다.
        List<Integer> list1 = Arrays.asList(10, 30, 40, -10, -20);
        Collections.sort(list1, (o1, o2) -> o1.compareTo(o2)); // 람다식으로 인터페이스 (추상메서드 하나인것만가능 - 람다식은) 완전쉽게 구현함
        System.out.println(list1);

        //Java 1.8부터 Comparator static메서드들이 대거등장 - Comparator 반환함.
        List<Integer> list2 = Arrays.asList(-10, -30, -50, 10, 20);
        Collections.sort(list2, Comparator.comparingInt(i -> i)); // comparing -> comparingInt : autoBoxing, unBoxing 비효율 줄여줌
        System.out.println(list2);

        //다른 naturalOrder() static method
        List<Integer> list3 = Arrays.asList(-30, -50, -100, 20, 100);
        Collections.sort(list3, Comparator.naturalOrder());
        System.out.println(list3);

        Predicate<Integer> predicate = o1 -> o1 == 10;
        System.out.println(predicate.test(10));



    }
}
