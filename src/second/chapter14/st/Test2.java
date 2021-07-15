package second.chapter14.st;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

public class Test2 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김지영", 20, 100),
                new Student("이수영", 25, 90),
                new Student("이지비루", 25, 60),
                new Student("이지비", 25, 60),
                new Student("김정방", 25, 80),
                new Student("강찬식", 26, 80),
                new Student("김미영", 28, 90),
                new Student("김갑순", 23, 67),
                new Student("박지수", 24, 99)
        );
        Stream<Student> studentStream = students.stream();
        studentStream.sorted(
                Comparator.comparingInt(Student::getAge)
                        .thenComparingInt(o -> o.getName().length())
                        .thenComparingInt(Student::getGrade))
                .forEach(System.out::println);
        //나이순 정렬

        Stream<Student> stream = students.stream();
        IntStream intStream = stream.mapToInt(Student::getAge);
        OptionalInt min = intStream.min();

        min.ifPresent(System.out::println);


    }
}
