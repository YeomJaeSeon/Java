package chapter14.partitioning;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Collector 인터페이스 구현한 구현체 Collectors클래스의 partitioningBy메서드는 2분할. grouping by는 n분할
class Student{
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
        System.out.printf("1. 단순분할(성별로 분할) %n");
        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale));
        // 성별로 분할

        List<Student> maleStudent = stuBySex.get(true);
        List<Student> femaleStudent = stuBySex.get(false);

        System.out.println("남학생");
        for (Student student : maleStudent) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("여학생");
        for (Student student : femaleStudent) {
            System.out.println(student);
        }

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));

        System.out.println("남학생 : " + stuNumBySex.get(true));
        System.out.println("여학생 : " + stuNumBySex.get(false));

        System.out.printf("%n3. 단순분할 + 통계(성별 1등%n");
        Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
                .collect(Collectors.partitioningBy(Student::isMale,
                        Collectors.maxBy(Comparator.comparingInt(i -> i.getScore()))));

        System.out.println("남학생 1등 : " + topScoreBySex.get(true).get());
        System.out.println("여학생 1등 : " + topScoreBySex.get(false).get());

        Map<Boolean, Student> topScore2 = Stream.of(stuArr)
                .collect(Collectors.partitioningBy(Student::isMale,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Student::getScore)), Optional::get
                        )));

        System.out.println("남학생 1등 : " + topScoreBySex.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex.get(false));

        System.out.printf("%n4. 다중분할(성별 불합격자, 100점이하) %n");
        Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = Stream.of(stuArr)
                .collect(Collectors.partitioningBy(Student::isMale,
                        Collectors.partitioningBy(s -> s.getScore() <= 100)));

        List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);

        for (Student student : failedMaleStu) {
            System.out.println(student);
        }
        for (Student student : failedFemaleStu) {
            System.out.println(student);
        }
    }
}
