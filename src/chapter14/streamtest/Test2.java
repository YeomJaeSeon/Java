package chapter14.streamtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) {
        //중간연산 skip()
        IntStream intStream = IntStream.rangeClosed(1, 10); // 1 ~ 10
        intStream.skip(3).forEach(System.out::print); // i -> System.out.print(i);
        System.out.println();
        //중간연산 distinct() - 중복제거 SELECT DISTINCT * FROM TABLE; 과같네
        IntStream intStream1 = IntStream.of(1,2,2, 3, 3,3 , 4, 5, 5, 6);
        intStream1.distinct().forEach(System.out::print);
        System.out.println();

        // 중간연산 filter() - 조건에 맞지않는 요소 삭제
        intStream1 = IntStream.rangeClosed(1, 10);
        intStream1.filter(i -> i % 2 == 0).forEach(System.out::print);
        System.out.println();

        intStream1 = IntStream.rangeClosed(1, 10);
        long count = intStream1.filter(i -> i % 2 != 0).filter(i -> i % 3 != 0).count();
        System.out.println(count);
        System.out.println();

        //중간연산 정렬 - sorted()
        IntStream intStream2 = Arrays.stream(new int[]{5, 2, 3, 4, 1});
        intStream2.sorted().forEach(System.out::print);
        System.out.println();

        IntStream intStream3 = IntStream.of(1, 3, 2, 100, 80, 40, 50, 20);
        intStream3.sorted().forEach(System.out::print);
        System.out.println();

    }
}

class Compare implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            return -((Comparable)o1).compareTo((Comparable)o2);
        }
        return 0;
    }
}