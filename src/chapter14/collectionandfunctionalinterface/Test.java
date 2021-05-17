package chapter14.collectionandfunctionalinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++)
            list.add(i);
        System.out.println(list);
        list.removeIf(i -> i == 5);
        System.out.println(list);

        list.replaceAll(x -> x * 100);
        System.out.println(list);

        list.forEach(i -> System.out.println(i * 10)); // forEach메서드의 매개변수, 파라미터로는 함수형인터페이스 Consumer가온다.
        // Consumer 함수형인터페이스에는 매개변수만 있는 람다식이와야함. 람다식은 객체! 참조변수타입은 추상메서드하나만존재할수있는 함수형 인터페이스

        Map<Integer, String> store = new HashMap<>();
        store.put(1, "염재선");
        store.put(2, "김재선");
        store.put(3, "박재선");
        store.put(4, "김이선");

        store.forEach((x, y) -> System.out.println(x + " : " + y));
        // 컬렉션 클래스의 메서드의 파라미터에는 함수형인터페이스가 올수있는것들이 존재한다.
        // 이 함수형인터페이스에 람다식을 전달하여 컬렉션 요소에 iterator로 귀찮게 접근하는것보다 쉽게 접근할수있따.

    }
}
