package second.chapter14.lambd;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
    private String name;
    private int grade;
    private boolean isMale;

    public Student(String name, int grade, boolean isMale){
        this.name = name;
        this.grade = grade;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", isMale=" + isMale +
                '}';
    }
}
public class Test2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("김지비", 100, true),
                new Student("이덕수", 20, false),
                new Student("이지붕", 50, true),
                new Student("최창수", 50, true),
                new Student("박기범", 90, false),
                new Student("박지수", 40,false),
                new Student("최강신", 99, false),
                new Student("최정호", 30, true),
                new Student("홍정호", 33, false)
        );
        Stream<Student> stream = list.stream();
        boolean b = stream.allMatch(i -> i.getGrade() > 10);
        System.out.println("b = " + b);//모두 10점은 넘는다

        Stream<Student> stream1 = list.stream();
        boolean b1 = stream1.anyMatch(i -> i.getGrade() == 100);
        System.out.println("b1 = " + b1);

        Stream<Student> stream2 = list.stream();
        boolean b2 = stream2.noneMatch(i -> i.getGrade() == 0);
        System.out.println("b2 = " + b2);

        Stream<Student> stream3 = list.stream();
        Optional<Student> highScoreStudent = stream3.filter(i -> i.getGrade() > 90).findFirst();
        highScoreStudent.ifPresent(System.out::println); //없으면 아무일도안함

        IntStream intStream = list.stream().mapToInt(Student::getGrade);
        OptionalInt max = intStream.max();
        max.ifPresent(System.out::println);
        //존재하면 행동

        IntStream intStream1 = list.stream().mapToInt(Student::getGrade);
        int sum = intStream1.reduce(0, Integer::sum);
        System.out.println("sum = " + sum);

        //reduce

        Stream<Student> stream4 = list.stream();
        List<Integer> grades = stream4.map(Student::getGrade).collect(Collectors.toList());
        System.out.println(grades);

        Stream<Student> stream5 = list.stream();
        ArrayList<Integer> collect = stream5.map(Student::getGrade).collect(Collectors.toCollection(ArrayList::new)); // 특정 컬렉션으로 변경
        //스트림 소스를 특정 컬렉션으로 변경 : toCollection
        System.out.println(collect);

        Stream<Student> studentStream = list.stream();
        Long collect1 = studentStream.collect(Collectors.counting());
        System.out.println("collect1 = " + collect1);


        Stream<Student> stream6 = list.stream();
        Map<Boolean, List<Student>> collect2 = stream6.collect(Collectors.partitioningBy(Student::isMale));

        List<Student> maleStudents = collect2.get(true);
        List<Student> femaleStudents = collect2.get(false);

        System.out.println("남자");
        System.out.println(maleStudents);
        System.out.println("여자");
        System.out.println(femaleStudents);

        // stream -> array
        IntStream stream7 = list.stream().mapToInt(Student::getGrade);
        int[] gradeArr = stream7.toArray();
        System.out.println(Arrays.toString(gradeArr));




    }
}
