package chapter14.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        Stream<Integer> stream = list.stream();
        stream.forEach(i -> System.out.println(i));
        System.out.println(list);
        // stream은 읽기전용 - 데이터소스 변경 X
        stream = list.stream();
        stream.forEach(i -> System.out.println(i));

        int[] intArr = new int[]{1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
        IntStream intStream = IntStream.of(intArr);
        intStream.forEach(i -> System.out.print(i +" "));
        System.out.println();
        intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6});
        intStream.limit(5).forEach(i -> System.out.println(i));

        Stream<String> streamStream = Stream.of(new String[]{"염재선", "김수호", "박재정"});
        streamStream.forEach(i-> System.out.print(i + " "));

        IntStream intStream1 = IntStream.range(0, 5);
        // 0 ~ 4
        intStream1.forEach(i-> System.out.println(i));
        IntStream intStream2 = new Random().ints(5, 10, 20); // 10 ~ 19난수 5개
        intStream2.forEach(i -> System.out.println(i));

        //파라미터 람다식을전달, 람다식 계산결과를..
        IntStream intStream3 = IntStream.iterate(0, n -> n + 2);
        intStream3.limit(3).forEach(System.out::print);
        System.out.println();

        Stream<String> stream1 = Stream.generate(() -> "염재선");
        stream1.limit(10).forEach(System.out::print);
        // iterate()와 generate()메서드는 매개변수로 람다식을 전달, iterate메서드는 seed, 초기값이존재
        // generate()메서드는 초기값 존재 X


    }
}
