package second.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

//컬렉션과 함수형인터풰이스
public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i= 0; i <10; i++){
            list.add(i);
        }

        list.removeIf((a) -> a == 5);
        System.out.println(list);

        list.replaceAll(a -> a * 2);
        System.out.println(list);

        list.forEach(a -> System.out.println(a));

        // 메서드참조 람다식 더간단히
        Function<String , Integer> predicate = Integer::parseInt;
        Integer apply = predicate.apply("120");
        System.out.println("apply = " + apply);

        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);
    }
}
