package chapter14.streampractice;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> stream = list.stream(); // 컬렉션은 stream()메서드로 컬레겻ㄴ- > 스트림으로 생성
        // 스트림은 원본 데이터소스는 건들지않는다.

        stream.filter(i -> i % 20 == 0).forEach(System.out::println);
        System.out.println(list);

        //배열 -> 스트림
        Stream<Integer> stream1 = Stream.of(1,2, 3, 4, 5);
        stream1.skip(2).forEach(i -> System.out.println(i));

        //Arrays.stream static메서드 사용
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{10, 9, 8, 7});
        stream2.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //IntStream
        IntStream intStream = IntStream.of(-10, -5, 0, 20, 40);
        intStream.limit(3).forEach(System.out::println);
        System.out.println();

        IntStream intStream1 = Arrays.stream(new int[]{1, 1, 2, 2, 2, 3, 4 });
        intStream1.distinct().forEach(System.out::println);

        System.out.println();

        Stream<Integer> stream3 = Stream.of(10, 20, 30, 40, 50);
        Stream<String> stringStream = stream3.map(String::valueOf).map(i -> i + 10);
        stringStream.forEach(System.out::println);

        Stream<String> stringStream1 = Stream.of("1", "2", "3", "4", "5");
        IntStream intStream2 = stringStream1.mapToInt(Integer::parseInt);
        intStream2.map(i -> i + 2).forEach(System.out::println);

        Optional<String> optional = Optional.of("염재선");
        System.out.println("optional = " + optional.get());

        Optional<String> optional1 = Optional.ofNullable(null);
        System.out.println(optional1.orElse("EMPTY"));

        Optional<String> optional2 = Optional.empty(); // 기본값 초기화는 이렇게 해야바람직

        optional2.ifPresent(System.out::println);

        System.out.println("optional2 = " + optional2.orElseGet(() -> "염재선"));

        Scanner sc = new Scanner(System.in);

//        while(true){
//            System.out.print("이름이 뭐에요?(취소 : Q) >");
//            Optional<String> name = Optional.ofNullable(sc.nextLine());
//            name.stream().filter(i -> i.equals("Q")).findFirst().ifPresent(i -> {
//                System.out.println("종료");
//                System.exit(1);
//            });
//            System.out.println(name.orElse("이름을 적어주세요!!!"));
//        }


    }
}
