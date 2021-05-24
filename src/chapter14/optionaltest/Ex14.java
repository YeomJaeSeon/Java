package chapter14.optionaltest;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14 {
    public static void main(String[] args) {

        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).parallel().forEachOrdered(System.out::println);
        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0); // 스트림요소 모든 문자열의 길이가 0이 아니면 true
        // noneMatch는 최종연산으로 조건에 맞는게 아무것도없으면..
        System.out.println("noEmptyStr = " + noEmptyStr);

        Optional<String> sWord = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst();
        System.out.println(sWord.get());

        IntStream intStream1= Stream.of(strArr).mapToInt(String::length); // Stream<String> -> IntStream : mapToInt메서드를통해서.
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(i -> i.length());
        IntStream intSTream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        OptionalInt max = intStream3.reduce(Integer::max);

        OptionalInt min = intSTream4.reduce((a, b) -> Integer.max(a, b)); // 초기값으면 Optional return

        System.out.println("max.getAsInt() = " + max.getAsInt());
        int minValue = min.getAsInt();
        System.out.println("minValue = " + minValue);



    }
}
