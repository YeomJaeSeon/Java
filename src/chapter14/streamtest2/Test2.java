package chapter14.streamtest2;

import java.util.stream.IntStream;

// 스트림 중간연산
public class Test2 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.skip(3).forEach(System.out::print); // skip - 건너띄기
        System.out.println();

        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        intStream1.filter(i -> i % 2 == 0).forEach(System.out::print);
        System.out.println();

        IntStream intStream2 = IntStream.of(new int[]{1, 1, 1, 1, 1, 2, 2 ,2 ,2 ,2 });
        intStream2.distinct().forEach(System.out::print); // distinct() : 중복 제거
        System.out.println();

    }
}
