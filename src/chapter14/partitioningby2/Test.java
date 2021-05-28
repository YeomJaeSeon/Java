package chapter14.partitioningby2;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //collect메서드는 최종연산인데 그룹핑이 가능 - reducing과다른점
        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)//Stream<Student>로 스트림생성
                .collect(Collectors.partitioningBy((Student s) -> s.isMale())); // partitioningBy하면 2분할
        //Map형태로나옴 key는 boolean - true, false

        List<Student> stuManBySex = stuBySex.get(true);
        List<Student> stuGirlBySex = stuBySex.get(false);

        for (Student manBySex : stuManBySex) {
            System.out.println(manBySex);
        }
        System.out.println();
        for (Student girlBySex : stuGirlBySex) {
            System.out.println(girlBySex);
        }

        // 성별분할 + 남여 명수
        Map<Boolean, Long> stuCountBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));

        Long manCount = stuCountBySex.get(true);
        Long girlCount = stuCountBySex.get(false);

        System.out.println("manCount = " + manCount);
        System.out.println("girlCount = " + girlCount);

        System.out.println("성별분할 + 각 성별 1등");
        Map<Boolean, Optional<Student>> topBySex =
                Stream.of(stuArr).collect(Collectors.partitioningBy(i -> i.isMale(), Collectors.maxBy(Comparator.comparingInt(Student::getScore))));

        Optional<Student> manTop = topBySex.get(true);
        Optional<Student> girlTop = topBySex.get(false);
        System.out.println(manTop.get());
        System.out.println(girlTop.get());

        Map<Boolean, Student> collect = Stream.of(stuArr)
                .collect(Collectors.partitioningBy(Student::isMale,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student::getScore)), Optional::get)));

        System.out.println(collect.get(true));
        System.out.println(collect.get(false));

        System.out.println("200점 위는 합격자");
        Map<Boolean, Map<Boolean, List<Student>>> passedStudentsBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale,
                Collectors.partitioningBy(s -> s.getScore() >= 200)));
        List<Student> manPass = passedStudentsBySex.get(true).get(true);
        List<Student> girPass = passedStudentsBySex.get(false).get(true);

        for (Student pass : manPass) {
            System.out.println(pass);
        }

        for (Student pass : girPass) {
            System.out.println(pass);
        }

    }
}
