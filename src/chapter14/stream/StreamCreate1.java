package chapter14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림생성
// 스트림은 데이터소스 다루는 표준화클래스
// 컬렉션의 한계를 해결
// 배열, 컬렉션, 임의의수가 스트림의 데이터 소스(많은 데이터)가 될수있다.
// 일단 컬렉션에서 스트림을생성해보자
public class StreamCreate1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);
        System.out.println();

        //다시생성해줘야함
        stream = list.stream();
        stream.forEach(s-> System.out.print(s)); // 이미 닫힌 스트림임
        System.out.println();

        // 배열 -> 스트림
        // 1. Stream 의 of static메서드,
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(System.out::print);
        System.out.println();

        // Stream의 of static메서드인데 매개변수가 가변인자가아니라 배열
        Stream<Integer> integerStream1 = Stream.of(new Integer[]{1, 2, 3, 4 ,5}); // Integer 지네릭타입이므로 Integer객체배열이 데이터소스로와야함 int[]배열이오면안된다.
        integerStream1.forEach(System.out::print);
        System.out.println();

        IntStream intStream = IntStream.of(new int[]{1, 2, 3, 4 ,5});
        // IntStream은 int배열이 올수있다.

        //2. Arrays클래스의 stream static메서드
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});
        integerStream2.forEach(i -> System.out.print(i));
        System.out.println();

        IntStream intStream1 = Arrays.stream(new int[]{1, 2, 3 ,4 ,5});
        intStream1.forEach(System.out::print);
        System.out.println();

        Stream<Integer> integerStream3 = Arrays.stream(new Integer[]{1, 2, 3}, 0, 2);
        integerStream3.forEach(System.out::print);
        System.out.println();

        //난수 스트림 - 무한스트림이다. 크기를 제한하던가 limit 중간연산을 이용해야한다.
        IntStream stream1 = new Random().ints(5, 5, 10);
        stream1.forEach(System.out::print);
        System.out.println();

        //특정범위의 수 스트림
        IntStream intStream2 = IntStream.range(0, 5);
        intStream2.forEach(System.out::print);
        System.out.println();

        //iterate(), gernerate() - 람다식을 매개변수로받아서 람다식에의해 계산되는 값을 요소하는 `무한 스트림`생성 - limit필요
        Stream<Integer> iterate = Stream.iterate(5, s -> s + 2);
        iterate.limit(10).forEach(System.out::print);
        System.out.println();

        // generate()도 매개변수로 람다식을 받지만 이 람다식이 Supplier로 반환값박엥벗음 그리고 seed - 초기값이 없음(Stream클래스의 iterate와다름)
        Stream<Integer> generate = Stream.generate(() -> 1); // 람다식 결과값을 데이터소소로 스트림은 가지고있음
        generate.limit(10).forEach(System.out::print);
        System.out.println();
        // Stream클래스의 iterate, generate메서드는 무한스트림이므로 limit중간연산으로 유한스트림으로 변경해줘야한다.



    }
}
