package chapter14.optionaltest;

// 스트림 최종연산. - 스트림을 소모하므로 1번,

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        int[] intArr = {1, 30, 5, 20, 40, 90, -100, 44, -125};
        IntStream intStream = IntStream.of(intArr);

        intStream.parallel().forEachOrdered(System.out::println);
        // 병렬적으로실행

        boolean isRight = IntStream.of(intArr).allMatch(i -> i > -1000);
        System.out.println("isRight = " + isRight);

        boolean isRight2 = IntStream.of(intArr).anyMatch(i -> i > 50);
        System.out.println("isRight2 = " + isRight2);

        boolean isRight3 = IntStream.of(intArr).noneMatch(i -> i > (int)1e5);
        System.out.println(isRight3);

        OptionalInt optionalInt = IntStream.of(intArr).parallel().filter(i -> i == 0).findAny();
        System.out.println("optionalInt = " + optionalInt.orElse(0));

        int num = optionalInt.orElseGet(() -> 0);
        System.out.println("num = " + num);

        Stream<String> stringStream = IntStream.of(intArr).mapToObj(i -> i + "");
        Stream<String> stringStream1 = IntStream.of(intArr).mapToObj(i -> i + "");
        Stream<String> stringStream2 = IntStream.of(intArr).mapToObj(String::valueOf);
        Stream<String> streamStream3 = IntStream.of(intArr).mapToObj(i -> String.valueOf(i));

        int totalLength = stringStream.reduce("", (a, b) -> a + b).length();
        System.out.println("totalLength = " + totalLength);

        String total = stringStream1.reduce("", (a, b) -> a + b);
        System.out.println("total = " + total);

        int max = stringStream2.mapToInt(String::length).reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
        System.out.println("max = " + max);

        int min = streamStream3.mapToInt(i -> i.length()).reduce(Integer.MAX_VALUE, Integer::min); // 람다식을 메서드참조로 더간단히~
        System.out.println("min = " + min);







    }
}
