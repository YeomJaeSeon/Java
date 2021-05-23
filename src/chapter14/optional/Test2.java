package chapter14.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class Test2 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abc");
        System.out.println("optStr.get() = " + optStr.get());

        String s=  "abcdef";
        Optional<String> optStr2 = Optional.ofNullable(s);
        String str = optStr2.orElse("EMPTY");
        System.out.println("str = " + str);

        Optional<String> optional = null; // 가능 그러나 좋지않음
        Optional<String> optional1 = Optional.empty(); //바람직.
        String str2 = optional1.orElse("EMPTY");
        System.out.println("str2 = " + str2);

        String s1 = optional1.orElseGet(() -> "EMPTY");
        System.out.println("s1 = " + s1);

        Optional<String> optional2 = Optional.empty();
        boolean present = optional2.isPresent();
        System.out.println("present = " + present);

        Optional<String> optional3 = Optional.of("염재선");
        boolean present1 = optional3.isPresent();
        System.out.println("present1 = " + present1);

        Optional<String> optional4 = Optional.ofNullable("123");
        optional4.ifPresent(Integer::parseInt);
        String strToInt = optional4.orElse("EMPTY");
        System.out.println("(strToInt + 100) = " + (strToInt + 100));

        optional4.ifPresent(System.out::println);//요소 존재하면
        Optional<Integer> optionalInteger = Optional.ofNullable(1243);
        optionalInteger.ifPresent(System.out::println);

        OptionalInt optionalInt = OptionalInt.of(100);
        int asInt = optionalInt.getAsInt();
        System.out.println("asInt = " + asInt);
        System.out.println("optionalInt = " + optionalInt.isPresent());

        OptionalInt optionalInt1 = OptionalInt.empty();
        int asInt2 = optionalInt1.orElse(-100);
        System.out.println("asInt2 = " + asInt2);
        System.out.println("optionalInt1 = " + optionalInt1.isPresent());


    }
}
