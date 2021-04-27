package chapter12.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>(); // JDK 1.7부터 지네릭 클래스객체에 생서자에 타입 생략가능

        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));

        //    public Student get(Object key) {
        Student s = map.get("자바왕"); // (Student) 형변환 생략가능. 지네릭클래스를 통해서.

        System.out.println(map.get("자바왕").name);


//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("자바왕", 1, 1));
//        list.add(new Student("염재선", 2, 1));
//        list.add(new Student("공부짱", 3, 1));
//
//        Iterator<Student> it = list.iterator(); // 타입지정하면 형변환 안해도됨
//        //Iterator는 지네릭 인터페이스이므로 타입 대입하면 아래처럼 형변환 생략가능
//        while(it.hasNext()){
////            Student s = (Student) it.next()
//            System.out.println((it.next()).name);
//        }
    }
}

class Student{
    String name = ""; // null로 초기화하는거보단 ""이낫다. NPE발생마긱
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}