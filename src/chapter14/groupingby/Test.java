package chapter14.groupingby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 최종연산 collect중 n분할 가능하게해주는 groupingBy메서드 - Collectors클래스의 메서드이다.
// Collectors클래스는 Collector인터페이스 구현한 클래스 - collect메서드 인자로 Collector인터페이스가 올수있는데
//해당 인터페이스를 구현한 클래스로 Collectors가 올수있당.!
class Student {
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

        System.out.println("반별로 그룹화");
        Map<Integer, List<Student>> groupingByBan = Stream.of(stuArr)
                .collect(Collectors.groupingBy(i -> i.getBan(), Collectors.toList()));

        System.out.println("1반");
        groupingByBan.get(1).forEach(System.out::println);

        System.out.println("2반");
        groupingByBan.get(2).forEach(System.out::println);


        System.out.println("-- 성저별로 그루핑 -- ");
        Map<Student.Level, List<Student>> stuByGrade = Stream.of(stuArr)
                .collect(Collectors.groupingBy(
                        s -> {
                            if(s.getScore() >= 200) return Student.Level.HIGH;
                            else if(s.getScore() >= 100) return Student.Level.MID;
                            else return Student.Level.LOW;
                        }
                ));

        System.out.println("HIGH LEVEL students");
        List<Student> students = stuByGrade.get(Student.Level.HIGH);
        students.forEach(System.out::println);

        System.out.println("MID LEVEL students");
        List<Student> students1 = stuByGrade.get(Student.Level.MID);
        students1.forEach(System.out::println);

        System.out.println("LOW LEVEL students");
        List<Student> students2 = stuByGrade.get(Student.Level.LOW);
        students2.forEach(System.out::println);

        Map<Student.Level, Long> stuByGradeCount = Stream.of(stuArr).collect(Collectors.groupingBy(
                s -> {
                    if (s.getScore() >= 200) return Student.Level.HIGH;
                    else if (s.getScore() >= 100) return Student.Level.MID;
                    else return Student.Level.LOW;
                }, Collectors.counting()
        ));
        Long aLong = stuByGradeCount.get(Student.Level.LOW);
        System.out.println("low level 학생수 : " + aLong);

        Long highCnt = stuByGradeCount.get(Student.Level.HIGH);
        System.out.println("high level 학생수 : " +highCnt);

        Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan = Stream.of(stuArr).collect(Collectors.groupingBy(Student::getHak, Collectors.groupingBy(Student::getBan)));

        System.out.println("1학년 1반");
        stuByHakAndBan.get(1).get(1).forEach(System.out::println);

        System.out.println("2학년 2반");
        stuByHakAndBan.get(2).get(2).forEach(System.out::println);
    }
}
