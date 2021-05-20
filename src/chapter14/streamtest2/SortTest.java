package chapter14.streamtest2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

// 중간연산 - 정렬
public class SortTest {
    static String[] strArr = new String[]{"dd", "aaa", "CC", "cc", "b"};
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of(strArr);
        strStream.sorted().forEach(System.out::print);
        System.out.println();

        strStream = Stream.of(strArr);
        strStream.sorted(Comparator.naturalOrder()).forEach(System.out::print);
        System.out.println();

        strStream = Arrays.stream(strArr);
        strStream.sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::print); // Comparable인터페이스의 메서드긴한데 이건 String의 메서드를 가져온것(String이 오버라이딩한  메서드)
        System.out.println();

        strStream = Arrays.stream(strArr);
        strStream.sorted(String::compareTo).forEach(System.out::print);
        System.out.println();

        strStream = Arrays.stream(strArr);
        strStream.sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        strStream = Arrays.stream(strArr);
        strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::print);
        System.out.println();

        strStream = Arrays.stream(strArr);
        strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(System.out::print);
        System.out.println();

        strStream = Arrays.stream(strArr);
        strStream.sorted(Comparator.comparing((String s)->s.length())).forEach(System.out::print);
        System.out.println();

        strStream = Stream.of(strArr);
        strStream.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::print);// reverse()메서드는 COmparator인터페이스의 메서드
    }
}
