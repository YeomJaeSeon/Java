package chapter14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> intStream = list.stream(); // stream()메서드로 스트림으로 변경
//        //Collection 인터페이스의메서드이다.
//        intStream.forEach(System.out::print); // 스트림 최종연산 - 스트림소모, (0,  1번밖에 연산못함)
//
//        // stream은 일회용이당! (stream에대한 최종연산은 스트림을 소모한다. - 스트림 닫힌다)
//        intStream = list.stream(); // 다시 스트림 생성해줘야함. 스트림은 일회용임 Iterator철머
//        intStream.forEach((s) -> System.out.print(s));
//        System.out.println();

        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.forEach(System.out::println);

        stringStream = Stream.of("a", "b", "c");
        stringStream.forEach((s)-> System.out.println(s));

        stringStream = Stream.of(new String[]{"a", "b", "c", "d"});
        stringStream.forEach(System.out::print);

        String[] strArr = new String[]{"a", "b", "c", "d"};
        stringStream = Stream.of(strArr);
        stringStream.forEach(System.out::print);

        Stream<String> str2Stream = Arrays.stream(strArr);
        str2Stream.forEach(System.out::println);

        int[] intArr = {1, 2, 3, 4, 5};
        //primitive stream
        IntStream intStream = Arrays.stream(intArr);
//        intStream.forEach(System.out::print); // Stream클래스에도 forEach메서드가 존재함.

        //Integer스트림
        Stream<Integer> integerStream = Arrays.stream(new Integer[]{new Integer(1), 2, 3, 4, 5});
        System.out.println(intStream.max()); // IntStream에는 Stream<Integer>보다 primitive type을다룰수잇는 메서드가 더많다.




    }
}
