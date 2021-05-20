package chapter14.streamtest2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach(i -> System.out.println(i));
        list.forEach(i -> System.out.println(i));
        list.forEach(System.out::print);
        System.out.println();
        // 컬렉션 메서드 파라미터 타입이 함수형인터페이스로 람다식을 받아서 간단하게 표현가능
        //람다식으로 간단하게 컬렉션 데이터소스에 접근할수있음

        // 아래는 스트림생성.

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.limit(3).forEach(System.out::println);
        System.out.println();
        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("stream = " + stream);
        stream.forEach(System.out::print);
        System.out.println();

        IntStream intStream = IntStream.of(1, 4, 5, 7, 8);
        intStream.forEach(System.out::print);
        System.out.println();

        IntStream intStream1 = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        intStream1.forEach(System.out::println);
        Stream<Integer> stream1 = Stream.iterate(0, i -> i + 2);
        stream1.limit(10).forEach(System.out::println);
        System.out.println();
        IntStream intStream2 = IntStream.generate(()->10);
        intStream2.limit(20).forEach(System.out::println);

        IntStream intStream3 = IntStream.range(0, 5);
        intStream3.forEach(System.out::println);
        System.out.println();
        IntStream intStream4 = IntStream.rangeClosed(0, 5);
        intStream4.forEach(System.out::println);
        System.out.println();

        IntStream intStream5 = new Random().ints();
        intStream5.limit(5).forEach(System.out::println);


    }
}
