package chapter14.streampractice;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// stream최종연산 -스트림 요소소모 (1번)
public class Final {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).parallel().forEachOrdered(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr).parallel().filter(s -> s.charAt(0) == 's').findAny();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord = " + sWord.get());

        Stream<String> stream = Stream.of(strArr);
        stream.forEach(System.out::println);
        System.out.println();

        //Stream<String> -> IntStream

        IntStream intStream = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(i -> i.length());
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream.reduce(0, (a, b) -> a + 1);
        System.out.println("count = " + count);
        int sum = intStream1.reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum);

//        OptionalInt max = intStream2.reduce((a, b) -> Integer.max(a, b));
//        OptionalInt min = intStream3.reduce(Integer::min);
//        System.out.println(max.getAsInt());
//        System.out.println("min.getAsInt() = " + min.getAsInt());

        int max = intStream2.reduce(Integer.MIN_VALUE, Integer::max);
        int min = intStream3.reduce(Integer.MAX_VALUE, (a, b) -> Integer.min(a, b));
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        // 초기값을 주는 reduct stream최종연산은 Optional이안옴
        // 초기값을 안주는 reduce stream최종연상느 Option이옴. 없을수도있으므로 Optional 래퍼클래스로 감쌈

        int b = 10;

    }
}
class Car{

}
