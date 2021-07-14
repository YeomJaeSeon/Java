package second.chapter14.stream;

import second.chapter14.lambda.NotEnoughException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] strArr = {"하나", "둘", "셋", "넷", "다섯"};
        List<String> strings = Arrays.asList(strArr);

        Arrays.sort(strArr);
        Collections.sort(strings);

        for (String s : strArr) {
            System.out.println(s);
        }

        for (String string : strings) {
            System.out.println(string);
        }

        // 데이터를 다루는데 표준화된 방법인 Stream을 이용해보자
        Stream<String> stream = Arrays.stream(strArr);
        Stream<String> stream1 = strings.stream();

        stream.sorted().forEach(i -> System.out.println(i));
        stream1.limit(3).forEach(System.out::print);
        System.out.println();

        /**
         * 스트림의 특징
         */
        //1. 스트림은 데이터 원본을 변경하지않는다 읽기전용이다.
        System.out.println(strings);

        //2. 스트림을 일회용이다. 최종연산을하고나면 스트림을 소모하기에 스트림을 사라진다..
        Stream<String> stream2 = strings.stream();
        stream2.forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        long count = intStream.distinct().count();
        if(count < 6){
            try{
                throw new NotEnoughException("충분하지않아요..");
            }catch (NotEnoughException notEnoughException){
                System.out.println("bb");
            }
        }
        System.out.println("aa" +
                "");


    }
}
