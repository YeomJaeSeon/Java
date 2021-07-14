package second.chapter14.lamda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface CalculateMax{
    int max(int a, int b);
}

public class Test {
    public static void main(String[] args) {
        CalculateMax calculateMax = new CalculateMax() {
            @Override
            public int max(int a, int b) {
                return Math.max(a, b);
            }
        };

        System.out.println(calculateMax.max(100, 200));

        CalculateMax calculateMax1 = (a, b) -> Math.max(a, b);
        System.out.println(calculateMax1.max(300, 500));

        List<String> list = Arrays.asList("염재선", "염민선", "염주연", "염지수", "염박사");
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        System.out.println(list);

        list.forEach(i -> System.out.println(i));

        //컬렉션 프레임웤과 함수형인터페이스


        List<String> strings = new ArrayList<>(list);
        strings.removeIf(i -> i.equals("염주연"));
        System.out.println(strings);
        strings.replaceAll(i -> "염씨");
        System.out.println(strings);
        strings.forEach(i -> System.out.println(i));



    }
}
