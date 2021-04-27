package chapter12.basic.prac3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IterTest {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(new Student("염재선",1 ,1));
//        list.add(new Student("김자바", 1, 2));
//        list.add(new Student("왕자바", 2, 1));
//
//        Iterator<Student> it = list.iterator(); // Iterator도 지네릭 인터페이스
//        // 타입 대입해주면 형변환 생략가능.
//        while(it.hasNext()){
//            System.out.println(it.next().getName());
//        }
//
//        // 지네릭 사용하지않으면 이렇게 형변환해줘야함.
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(((Student)iterator.next()).getName());
//        }

        //HashMap - key, value에 타입 다대입해야함. HashMap컬렉션 클래스도 지네릭 클래스
        HashMap<String, Student> map = new HashMap<>(); // 지네릭 클래스 객체 생성할때 생성자에는 타입 생략가능

        map.put("염재선", new Student("염재선", 1, 1, 100, 100, 100));
        System.out.println(map.get("염재선").getName()); // 지네릭으로 타입명시해줘서 뭔타입인지 알기에
        //형변환 안해줘도됨 만약 지네릭 안쓰면

        HashMap map2 = new HashMap();
        map2.put("김재선", new Student("김재선",2, 2, 50, 50, 50));
        System.out.println(((Student)map2.get("김재선")).getName()); // 타입 형변환 이렇게해줘야했음
        //왜냐면 Object를 리턴하닌까..
        map2.put("김", new Student("김", 3, 3, 1, 1 ,1 ));
        Student person = (Student) map2.get("김");
        System.out.println(person.getName());

        HashMap<String, Student> map3 = new HashMap<>();
        map3.put("박", new Student("박", 1, 1, 1,1 ,1));
        Student smartStudent = map3.get("박");
        System.out.println(smartStudent.getName());


        Object object = map3.get("박");
        System.out.println("((Student)object).getName() = " + ((Student)object).getName());
    }
}
class Student{
    private String name;
    private int no;
    private int ban;
    private int kor;
    private int math;
    private int eng;

    public Student(String name, int no, int ban, int kor, int math, int eng) {
        this.name = name;
        this.no = no;
        this.ban = ban;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }
}
