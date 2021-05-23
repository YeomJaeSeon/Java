package chapter14.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_8 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(s -> s.length());
        System.out.println("optStr.orElse(\"null\") = " + optStr.orElse("null"));
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123").filter(i -> i.length() > 2).map(Integer::parseInt).get();
        System.out.println("result1 = " + (result1 + 10));

        int result2 = Optional.of("").filter(x -> x.length() > 0 ).map(Integer::parseInt).orElse(-1);
        System.out.println("result2 = " + result2);

        Optional.of("123").map(Integer::parseInt).ifPresent(x -> System.out.printf("result3 = %d%n", x));

        OptionalInt optionalInt = OptionalInt.of(0);
        OptionalInt optionalInt1 = OptionalInt.empty();

        System.out.println("optionalInt = " + optionalInt.isPresent());
        System.out.println("optionalInt1.isPresent() = " + optionalInt1.isPresent());

        System.out.println("optionalInt = " + optionalInt.getAsInt());
//        System.out.println("optionalInt1 = " + optionalInt1.getAsInt());
        System.out.println("optionalInt = " + optionalInt);
        System.out.println("optionalInt1 = " + optionalInt1);

    }
}
