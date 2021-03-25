package chapter6.practice;

//3, 4번
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor + eng + math;
    }
    float getAverage(){
        return (int)(((kor + eng + math) / 3.0F) * 10 + 0.5F) / 10.0F;
    }

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info(){
        return name + "," + ban + "," + no + "," + kor+ "," + eng + "," + math;
    }
}
public class Number3 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}
