package second.chapter14.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        //스트림 만들기
        // 원본 소스 : 컬렉션, 배열, 임의의 수
        // 컬렉션 collection인터페이스에 stream()메서드를 통해서 - List, Set컬렉션은 stream이 될수있다.
        List<Integer> list=  new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(2);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);
        System.out.println();

        //배열 -> 스트림
        String[] stringArr = {"염재선", "박명수", "유재석", "이찬진"};
        Stream<String> stream1 = Arrays.stream(stringArr);
        stream1.forEach(System.out::print);
        System.out.println();

        Stream<String> stream2 = Stream.of(stringArr);
        stream2.forEach(System.out::println);

        //IntStream이나 DOubleStream
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        IntStream intStream = IntStream.of(arr);
        intStream.forEach(System.out::println);

        IntStream intStream1 = Arrays.stream(arr);
        intStream1.sorted().forEach(System.out::println);

        //특정범위의 스트림생성하기
        IntStream intStream2 = IntStream.rangeClosed(0, 10);
        intStream2.forEach(System.out::print);
        System.out.println();

        IntStream intStream3 = IntStream.range(0, 10);
        intStream3.forEach(System.out::print);
        System.out.println();

        //임의의수 스트림생성하기 Random클래스의 ints 메서드
        IntStream intStream4 = new Random().ints(10, 0, 10); //무한스트림
        intStream4.limit(10).forEach(System.out::print);
        System.out.println();

        //람다식에 해당되는 스트림 새엇ㅇ
        Stream<Integer> stream3 = Stream.iterate(1, i -> i * 2);
        stream3.limit(10).forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream4 = Stream.generate(() -> 10);
        stream4.limit(10).forEach(System.out::print);
        System.out.println();

        //Stream중간연산 - filter와 sorted
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8,9, 10);
        stream5.filter(i -> i % 2 == 0).forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8,9, 10);
        Stream<Integer> sorted = stream6.sorted((o1, o2) -> o1.compareTo(o2) * -1);
        sorted.forEach(System.out::print);
        System.out.println();

        Stream<Person> stream7 = Stream.of(new Person("김", 1), new Person("박", 2), new Person("최", 30),
                new Person("염", 20));
        stream7.sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::print);
        System.out.println();

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}