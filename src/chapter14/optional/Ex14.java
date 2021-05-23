package chapter14.optional;

import chapter14.sorted.Ex;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(i -> i.length());
        System.out.println("optStr.get() = " + optStr.get());
        System.out.println("optInt.get() = " + optInt.get());

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();
        System.out.println("result1 = " + result1);

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3 = %d%n", x));

        Optional<Integer> optionalInteger = Optional.of("100").map(i -> Integer.parseInt(i));
        int number = optionalInteger.orElse(10000);
        System.out.println("number = " + number);


        OptionalInt optionalInt1 = OptionalInt.of(0);
        OptionalInt optionalInt2 = OptionalInt.empty();

        System.out.println(optionalInt1.isPresent());
        System.out.println(optionalInt2.isPresent());

        optionalInt1.ifPresent(i -> System.out.println(i));
        optionalInt2.ifPresent(System.out::println);

        System.out.println(optionalInt1.getAsInt());
//        System.out.println(optionalInt2.getAsInt());

        System.out.println("isSame? : " + optionalInt1.equals(optionalInt2));

        Optional<String> optional = Optional.ofNullable(null);
        Optional<String> optional1 = Optional.empty();

        System.out.println("optional = " + optional);
        System.out.println("optional1 = " + optional1);
        System.out.println("is Same? : " + optional.equals(optional1));

        int result3 = optStrToInt(Optional.of("123"), 0);
        int result4 = optStrToInt(Optional.of(""), 0);

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);


    }
    static int optStrToInt(Optional<String> optStr, int defaultValue){
        try{
            return optStr.map(Integer::parseInt).get();
        }catch (Exception e){
            return defaultValue;
        }
    }
}
