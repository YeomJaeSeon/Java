package chapter14.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 난수 스트림
public class Test2 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(); //무한스트림(난수)
        intStream
                .limit(3)
                .forEach(System.out::println); // 중간연산 -> 최종연산
        // limit으로 잘라주는것이필요함
        System.out.println();
        IntStream int2Stream = new Random().ints(10, 5, 10);
        int2Stream.forEach(System.out::println);

        // 특정 범위의 정수
        IntStream intStream1 = IntStream.range(1, 5);
        intStream1.forEach(System.out::print);

        System.out.println();
        IntStream intStream2 = IntStream.iterate(0, n -> n + 2);
        intStream2.limit(10).forEach(i -> System.out.print(i));
        System.out.println();

        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 2);
        integerStream.limit(5).forEach(System.out::print);

        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::println);

        // iterate와 generate()메서드는 무한스트림이다. limit을걸어줘야한다.

    }
}
