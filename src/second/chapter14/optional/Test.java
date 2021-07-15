package second.chapter14.optional;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        String str = "염재선";
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional);
        System.out.println(optional.get());

        String str2 = null;
        Optional<String> optional1 = Optional.ofNullable(str2);
        System.out.println(optional1);
//        System.out.println(optional1.get());

        Optional<String> optional2 = Optional.empty();
        System.out.println(optional2);
        optional2.ifPresent(i -> System.out.println(i));

        Optional<String> optional3 = Optional.ofNullable(null);
        System.out.println(optional3);
        optional3.ifPresent(System.out::println);


        System.out.println("===================");
        //Optional 객체의 값가져오기
        Optional<String> optional4 = Optional.of("박지성");
        System.out.println("optional4 = " + optional4.get());
        Optional<String> optional5 = Optional.empty();
        System.out.println(optional5.orElse("ㅠㅠ 없네요"));

        Optional<String> optional6 = Optional.of("박지샹");
        System.out.println(optional6.orElse("없시요 ㅠㅠ"));

        Optional<String> optionalS = Optional.of("하이헬로");

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        OptionalInt min = intStream.min();
        AtomicInteger minValue = new AtomicInteger();
        min.ifPresent(minValue::set);
        System.out.println("minValue = " + minValue);
    }
}
