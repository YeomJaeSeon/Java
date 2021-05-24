package chapter14.optionaltest;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;

// Optional - null간접적으로다룸
//1. null직접다루지않음 내부 멤버변수가 null을 다룸. - null -safe
//2. null check로 더러운코드가 없음 - stream의 메서드들을 사용할수있음
// 함수형프로그래밍처럼(람다식을이용한..) 널체크가 가능함.
public class Test {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("염재선");
        System.out.println(optional.get());

        //null 인지 의심되면
        Optional<String> optional1 = Optional.ofNullable(null);
        System.out.println(optional1.orElse("EMPTY"));

        Optional<String> optional2 = null; // 기본값 초기ㅘ - 적절치못함
        String s = null; // 과같은 형태로 적절치못함

        //기본값 초기화는 empty()메서드 이용
        Optional<String> optional3 = Optional.empty();
        String null_empty = optional3.orElse("NULL EMPTY");
        System.out.println("null_empty = " + null_empty);

        String s1 = optional1.orElseGet(() -> "염재선");
        System.out.println("s1 = " + s1);

        try{
            optional1.get();
        }catch (NoSuchElementException e){
            optional1.orElse("염재선");
        }
        System.out.println(optional.isPresent());
        System.out.println(optional1.isPresent());

        optional.ifPresent(i -> System.out.println("EMPTY"));
        optional1.ifPresent(i -> System.out.println("EMPTY !!"));


        int i = 100;
        OptionalInt optionalInt = OptionalInt.of(i);
        OptionalInt optionalInt1 = OptionalInt.empty();

        System.out.println(optionalInt.isPresent());
        System.out.println(optionalInt1.isPresent());

        optionalInt.ifPresent(System.out::println);
        optionalInt1.ifPresent(System.out::println);


    }
}
