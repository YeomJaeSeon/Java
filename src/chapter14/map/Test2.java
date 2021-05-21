package chapter14.map;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC","GHI", "JKS"}
        );

        //map으로 스트림 변환하면 스트림의 스트림 안에 문자열이있는 형태로변함
        // 문자 각각들이 하나의 스트림으로 합쳐짐 - flatMap - 쓰면 스트림 하나안에 문자열요소가 있는 형태로 변환
        Stream<String> strStream = strArrStream.flatMap((s) -> Arrays.stream(s));
        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try",
        };
        Stream<String> stringStream = Stream.of(lineArr);
        stringStream.forEach(System.out::println);
        stringStream = Stream.of(lineArr);
        stringStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

    }
}
