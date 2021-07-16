package second.chapter14.streamgroupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    private String name;
    private boolean sex;
    private int hak;
    private int ban;
    private int grade;

    public Student(String name, boolean sex, int hak, int ban, int grade) {
        this.name = name;
        this.sex = sex;
        this.hak = hak;
        this.ban = ban;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hak=" + hak +
                ", ban=" + ban +
                ", grade=" + grade +
                ", sex=" + sex +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
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
                new Student("이자바", true, 2, 3, 200)
        );
        Stream<Student> studentStream = list.stream();

        //성별로 분할(2분할 - partitioningBY) - 최종연산 collect()메서드 이용!, (그룹핑) -> Collector 구현체와야함 Collectors 이용 - Collector인터페이스 구현한 클래수

        Map<Boolean, List<Student>> sexStudents = studentStream.collect(Collectors.partitioningBy(Student::isSex));
        //남학생들
        List<Student> maleStudents = sexStudents.get(true);
        List<Student> femaleStudents = sexStudents.get(false);
        System.out.println(maleStudents);
        System.out.println(femaleStudents);

        System.out.println("====================================");

        //학년으로 구분 - groupingBy
        Stream<Student> stream = list.stream();
        Map<Integer, List<Student>> collect = stream.collect(Collectors.groupingBy(Student::getHak));

        Set<Integer> integers = collect.keySet();
        for (Integer hak : integers) {
            List<Student> students = collect.get(hak);
            System.out.println("학년 : " + hak);
            System.out.println(students);
        }

        //학년 , 반으로 구분
        Stream<Student> stream1 = list.stream();
        Map<Integer, Map<Integer, List<Student>>> collect1 = stream1.collect(Collectors.groupingBy(Student::getHak, Collectors.groupingBy(Student::getBan)));

        for (Integer hak : collect1.keySet()) {
            System.out.println(hak);
            Map<Integer, List<Student>> integerListMap = collect1.get(hak);
            for (List<Student> value : integerListMap.values()) {
                System.out.println(value);
            }

        }

    }
}
