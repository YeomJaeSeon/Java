package chapter14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림은 데이터소스를 관리하는 표준 클래스!
// 데이터소스를 다루는데 통일을 이루었따.
public class Test3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // 컬렉션 -> 스트림생성
        Stream<Integer> stream = list.stream();
        stream.forEach(i -> System.out.print(i)); // forEach는 스트림의 최종연산이므로 스트림요소를 소모함 -> 스트림 사용하려면 다시생성해야함
        System.out.println();
        // 스트림의 forEach는 최종연산이므로 하고나면 닫는다. 새로운 스트림생성
        stream = list.stream();
        stream.forEach(System.out::print);

        // 배열 -> 스트림생성 : Stream 클래스의 of static 메서드
        // Stream의 지네릭 타입에 맞춰야한다. Integer
        Stream<Integer> integerStream = Stream.of(new Integer[]{1, 2, 3, 4, 5});
        integerStream.forEach(System.out::print);
        System.out.println();

        // 기본형 데이터소스를 저장하는 스트림 인터페이스 IntStream - 배열 -> 스트림생성 : IntStream인터페이스의 of static메서드
        int[] intArr = new int[]{1, 3, 5, 7, 9};
        IntStream intStream = IntStream.of(intArr);
        intStream.forEach(System.out::print);
        System.out.println();

        // 배열 -> 스트림생성하는 다른방법 : Arrays클래스의 static메서드인 stream()을통해서
        IntStream intStream1 = Arrays.stream(intArr);
        intStream1.forEach(System.out::print);
        System.out.println();

        IntStream intStream2 = IntStream.range(1, 5);
        intStream2.forEach(System.out::print);
        System.out.println();

        // 특정범위의 데이터소스 스트림사용 -무한스트림
        IntStream intStream3 = new Random().ints(1, 5);
        intStream3.limit(10).forEach(System.out::print);
        System.out.println();

        // 난수스트림 - 무한스트림
        Stream<Integer> stream1 = Stream.iterate(1, t -> t + 2);
        stream1.limit(5).forEach(System.out::print);
        System.out.println();

        // Stream클래스의 iterate static 메서드 : 매개변수에 람다식넣는데 초기값을준다.람다식의 결과값을스트림에 저장
        Stream<Integer> stream2 = Stream.iterate(0, t -> t + 2);
        stream2.limit(10).forEach(i -> System.out.print(i));
        System.out.println();

        //generate()메서드는 iterate()와같이 Stream 클래스의 static메서드인데 초기값이없이 람다식의 결과값을 스트림에저장
        Stream<Integer> stream3 = Stream.generate(() -> 100);
        stream3.limit(10).forEach(System.out::print);
        System.out.println();


    }
}
