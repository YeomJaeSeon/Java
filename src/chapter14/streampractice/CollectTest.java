package chapter14.streampractice;


// Stream 최종연산 - collect

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * collect() : Stream최종연산
 * Collector : collect() 메서드에서 매개변수로 사용할 인터페이스
 * Collectors : Collector인터페이스 구현한 클래스(구현체)
 */

class Student implements Comparable<Student>{

    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s %d %d]", name, ban, totalScore).toString();
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    @Override
    public int compareTo(Student o) {
        return o.totalScore - totalScore; //내림차순정렬
    }
}
public class CollectTest {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180),
        };

        List<String> names = Stream.of(stuArr).map((Student i) -> i.getName())
                .collect(Collectors.toList());
        // 스트림을 List로 - collect메서드를 통해서(최종연산) - 매개변수로 Collectors 구현체가들어감
        System.out.println(names);

        Student[] stuArr2 = Stream.of(stuArr).toArray(i -> new Student[i]); // Stream<Student> -> 배열로 변경

        for (Student s : stuArr2) {
            System.out.println(s);
        }

        // Stream<Student> -> Map<String, Student> 로 변경 - collect()메서드를 통해서..
        Map<String, Student> stuMap = Stream.of(stuArr)
                .collect(Collectors.toMap(s -> s.getName(), p -> p)); // ket를 각 student의 이름으로, value는 Student 객체의 주소
        for (String s : stuMap.keySet()) {
            System.out.println(s + "-" + stuMap.get(s));
        }

        long count = Stream.of(stuArr).collect(Collectors.counting());
        long totalScore = Stream.of(stuArr)
                .collect(Collectors.summingInt(i -> i.getTotalScore()));

        System.out.println("count = " + count);
        System.out.println("totalScore = " + totalScore);

        totalScore =Stream.of(stuArr)
                .collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
        System.out.println("totalScore = " + totalScore);

        Optional<Student> topStudet = Stream.of(stuArr)
                .collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStudet = " + topStudet.get());

        IntSummaryStatistics stat = Stream.of(stuArr).collect(Collectors.summarizingInt(i -> i.getTotalScore()));
        System.out.println(stat);

        // 문자열합치기
        String stuNaes = Stream.of(stuArr).map(Student::getName)
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(stuNaes);


    }
}
