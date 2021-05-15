package chapter14.lambdatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 컬렉션 프레임웍 메서드들이 람다식을 사용.. 매개변수로  - 매개변수 타입이 함수형인터페이스이다. (표준 함수형인터페이스)
// java.util.function
public class CfAndLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        list.forEach(i-> System.out.println(i + ","));
        System.out.println();

        list.removeIf(i-> i % 2 == 0 || i % 3 == 0); // 2의배수나 3의배수는 삭제
        list.forEach(i -> System.out.println(i + ", "));
        System.out.println();

        list.replaceAll(i->i * 10);
        list.forEach(i -> System.out.println(i));
        // Consumer는 매개변수로 사용만함

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.print("{" + k + "," + v +"}"));
        System.out.println();
        // 컬렉션 프레임웍에서 람다식을 이용해서 되게 간단하게 컬렉션 프레임웍을 다룰수있게됨!
    }
}
//람다식을 이용해서 매우 간단하게 컬렉션 프레임웍의 데이터에 접근가능
// 원래는 iterator이용해서~ 데이터에접근하고 귀찮다.
/**
 오늘은 기사시험봄! 필기붙음! 이정도만 하자 !
 곱창먹기로해서!
 **/