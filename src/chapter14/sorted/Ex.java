package chapter14.sorted;

import java.util.Comparator;
import java.util.stream.Stream;

class Student implements Comparable<Student>{
    private String name;
    private int ban;
    private int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getBan() {
        return ban;
    }

    @Override
    public String toString() {
        return String.format("[%s %d %d]", name, ban, totalScore);
    }

    @Override
    public int compareTo(Student o) {
        return o.totalScore - this.totalScore; // 내림차순으로 기본정렬함.
    }
}
public class Ex {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("염",1, 100),
                new Student("김", 2, 200),
                new Student("박",3, 150),
                new Student("최",1, 220),
                new Student("황",2, 300),
                new Student("정",3, 90)
        };
        Stream<Student> studentStream = Stream.of(students);
//        studentStream.sorted(Comparator.comparing((Student s) -> s.getBan())
//                .thenComparing(Comparator.naturalOrder())) // 기본정렬인 Comparable을 구현해놨음 - totalScore순으로..
//                .forEach(System.out::println);

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()).reversed())
                .forEach(System.out::println);
    }
}
