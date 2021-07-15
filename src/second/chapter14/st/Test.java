package second.chapter14.st;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 스트림 : 여러 데이터소스를다루는 표준화 (배열, 컬렉션 .. )
 * 특징
 * 1. 스트림은 원본 변경 X
 * 2. 스트림을 일회용
 * 3. 중간연산 : 스트림 반환, 최종연산 : 스트림 반환 X (스트림 소모)로 이루어짐
 * 4. 지연된연산 : 최종연산시 중간연산이 실행됨
 * 5. IntStream, DoubleStream, LongStream등 오토박싱 언박싱의 비효율을 줄이기위해 기본타입 Stream이 존재
 * 6. 병렬처리
 * 7. 스트림은 내부반복 (메서드 내에 반복문이 존재함)
 */
public class Test {
    public static void main(String[] args) {
        //스트림 생성
        //1. 컬렉션
        List<Integer> list = Arrays.asList(1, 30, 20, 5, 2, 4, 5, 3, 3, 4);
        Stream<Integer> stream = list.stream();
        System.out.println(stream);
        stream.sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);
        // 중간연산 sorted, 최종연산 forEach
        // sorted에는 Comparator타입이 들어갈수있음

        //2. 배열
        Integer[] arr = {20, 30, 10, 5};
        Stream<Integer> stream1 = Stream.of(arr);
        stream1.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Stream<Integer> stream2 = Arrays.stream(arr);
        stream2.sorted().forEach(System.out::println);

        String[] strings = {"염", "이", "박", "김", "최"};
        Stream<String> stream3 = Arrays.stream(strings);
        stream3.sorted(Comparator.comparing(String::length)).forEach(System.out::println);



    }
}
