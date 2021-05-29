package chapter14.partitioningby3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 최종연산 collect - 그룹별로 최종연산이가능함.
 */

class Student implements Comparable<Student>{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student(String name, boolean isMale,int hak, int ban, int score){
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score =score;
    }

    public int getBan() {
        return ban;
    }

    public String getName() {
        return name;
    }

    public int getHak() {
        return hak;
    }

    public int getScore() {
        return score;
    }
    boolean isMale(){
        return isMale;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]",
                name, isMale ? "남" : "여", hak, ban, score);
    }

    @Override
    public int compareTo(Student o) {
        return score - o.score;
    }

    enum Level{
        HIGH, MID, LOW
    }
}

public class Test {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("나자바", true, 1, 1, 300),
                new Student("김지미", false, 1, 1, 250),
                new Student("김자바", true, 1, 1, 200),
                new Student("이지미", false, 1, 2, 150),
                new Student("남자바", true, 1, 2, 100),
                new Student("안지미", false, 1, 2, 50),
                new Student("황지미", false, 1, 3, 100),
                new Student("강지미", false, 1, 3, 150),
                new Student("이자바", true, 1, 3, 200),

                new Student("나자바", true, 2, 1, 300),
                new Student("김지미", false, 2, 1, 250),
                new Student("김자바", true, 2, 1, 200),
                new Student("이지미", false, 2, 2, 150),
                new Student("남자바", true, 2, 2, 100),
                new Student("안지미", false, 2, 2, 50),
                new Student("황지미", false, 2, 3, 100),
                new Student("강지미", false, 2, 3, 150),
                new Student("이자바", true, 2, 3, 200),
        };

        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(i -> i.isMale()));

        List<Student> maleStudents = stuBySex.get(true);
        List<Student> femaleStudents = stuBySex.get(false);
        maleStudents.forEach(System.out::println);
        System.out.println();
        femaleStudents.forEach(i -> System.out.println(i));

        Map<Boolean, Optional<Student>> topBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale,
                Collectors.maxBy(Comparator.comparingInt(i -> i.getScore()))));

        Optional<Student> student = topBySex.get(true);
        Optional<Student> student1 = topBySex.get(false);
        System.out.println("남학생 일등 : " + student.get());
        System.out.println("여학생 일등 : " + student1.get());

        Map<Boolean, Long> countBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));
        System.out.println("남학생 수 : " + countBySex.get(true));
        System.out.println("여학생수 : " + countBySex.get(false));


        //== 남학생 합격자, 여학생 합격자 분할하기 ==//
        Map<Boolean, Map<Boolean, List<Student>>> collect =
                Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale, Collectors.partitioningBy(i -> i.getScore() >= 200)));

        System.out.println("남학생 합격생들");
        List<Student> students = collect.get(true).get(true);
        students.forEach(System.out::println);

        System.out.println("여학생 합격생들");
        List<Student> students1 = collect.get(false).get(true);
        students1.forEach(System.out::println);

    }
}
