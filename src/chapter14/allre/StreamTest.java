package chapter14.allre;

// 스트림은 많은 데이터소스를 다루는데 진정한 표준화를 이룸 - 배열, 컬렉션..
// 스트림은

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1. 생성 - 컬렉션에서 스트림생성은 Collection.stream(), 배열에서 스트림생성은 Stream.of()라던가 IntStream.of(), 그리고 Arrays.stream(),그리고 IntStream같은경우는 closedRange, iterate, generate등으로 생성가능
 * 2. 중간연산 (n번) - 스트림 반환
 * 3. 최종연산 (1번) - 스트림 요소 소모 - int, Optional.. 등 스트림을 반환하지 않음
 */
class Node{
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return index + ":" + distance;
    }
}
public class StreamTest {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 10, 20, 30, 40, 50);
        integerStream.forEach(i -> System.out.println(i));

        List<Node> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(new Node(i, i + 10));
        }
        Stream<Node> nodeStream = list.stream(); // 컬렉션에서 스트림생성 - Collection.stream()메서드
        nodeStream.forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(100, 90, 80, 70);
        Stream<Integer> stream = list1.stream();
        stream.filter(i -> i> 70).forEach(System.out::println);

        System.out.println("-------------");

        IntStream intStream = IntStream.of(10, 5, 20, 30, 50);
        intStream.parallel().forEachOrdered(i -> System.out.println(i));

        IntStream intStream1 = IntStream.rangeClosed(0, 10);
        intStream1.forEach(System.out::println);

        IntStream intStream2 = new Random().ints(5, 20, 30);
        intStream2.sorted().forEach(System.out::println);

        Stream<String> stringStream = Stream.iterate("안녕", (s) -> s + " 수지야");
        stringStream.limit(3).forEach(System.out::println);

        IntStream intStream3 = IntStream.generate(() -> 100);
        intStream3.limit(100).forEach(System.out::println);

        // 중간연산
        List<Car> carList = Arrays.asList(new Car(1000, "red"), new Car(2000, "white"),
                new Car(500, "green"),new Car(5000, "black"), new Car(7000, "rainbow"));
        carList.stream().limit(3).forEach(System.out::println);

        carList.stream().skip(3).forEach(System.out::println);
        System.out.println("-------------");

        carList.stream().filter(car -> car.getColor().equals("red")).forEach(System.out::println);

        System.out.println();
        carList.stream().sorted().forEach(System.out::println);
        System.out.println();

        carList.stream().map(car -> car.getPrice()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println();


        Stream<String[]> stream1 = Stream.of(new String[]{"염재선", "김갑생", "11"}, new String[]{"거기너", "위화감조성하지마", "흩어져"}, new String[]{"안녕안녕", "나는", "수지야"});
        stream1.flatMap(i -> Arrays.stream(i)).forEach(System.out::println);

        //최종연산 - 스트림요소 소모 -1번
        Stream<String> stringStream1 = Stream.of("1번타자", "2번타자", "3번타자", "4번타자", "5번타자", "6번타자");
        stringStream1.forEach(System.out::println);

        String[] stringArr = {"ㅋㅋㅋㅋ", "ㅎㅎ", "ㅁㅁㅇㅇ", "ㅂㅂ", "ㅎ", "ㄹㄹㅇㄻㄴㅇㄹ"};
        Stream<String> stringStream2 = Stream.of(stringArr);

        boolean isMatch = stringStream2.distinct().anyMatch(i -> i.equals("ㅋㅋ"));
        System.out.println("isMatch = " + isMatch);

        Stream<String> stream2 = Stream.of(stringArr);
        Optional<String> find = stream2.filter(i -> i.equals("ㅠㅠ")).findFirst();
        System.out.println("find.orElse(\"없습네다 ㅠㅠ\") = " + find.orElse("없습네다 ㅠㅠ"));

        IntStream intStream4 = Stream.of(stringArr).mapToInt(String::length);
        IntStream intStream5 = Stream.of(stringArr).mapToInt(i -> i.length());
        IntStream intStream6 = Stream.of(stringArr).mapToInt(String::length);
        IntStream intStream7 = Stream.of(stringArr).mapToInt(String::length);

        int count = intStream4.reduce(0, (a, b) -> a + 1);
        int sum = intStream5.reduce(0, (a, b) -> a + b);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        int max = intStream6.reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
        System.out.println("max = " + max);

        int min = intStream7.reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("min = " + min);

        IntStream intStream8 = Stream.of(stringArr).mapToInt(String::length);

        OptionalInt optionalInt = intStream8.reduce(Integer::max);
        System.out.println("optionalInt = " + optionalInt.orElse(0));

    }
}

class Car implements Comparable<Car>{
    private int price;
    private String color;

    public Car(int price, String color){
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return price + ", " + color;
    }

    @Override
    public int compareTo(Car o) {
        return price - o.price;
    }
}