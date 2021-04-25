package chapter11.practices;

import java.util.*;
import java.util.regex.Pattern;

public class Num8 {
    public static void calculateSchoolRank(List list) {
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();
        //코드
        Student4 student4 = (Student4) list.get(0);
        student4.schoolRank = 1;

        for(int i = 1; i < list.size(); i++){
            Student4 before = (Student4) list.get(i - 1);
            Student4 curr =  (Student4) list.get(i);
            if(before.getTotal() == curr.getTotal()){
                curr.schoolRank = before.schoolRank;
            }else{
                int cnt = 0;
                for(int j = 0; j < i; j++){
                    Student4 student = (Student4) list.get(j);
                    if(before.schoolRank == student.schoolRank) ++cnt;
                }
                curr.schoolRank = before.schoolRank + cnt;
            }
        }

    }

    public static void calculateClassRank(List list) {
        Collections.sort(list, new ClassTotalComparator());
        for (Object o : list) {
            if(o instanceof Student4){
                Student4 student4 = (Student4)o;
                System.out.println("student4 = " + student4);
            }
        }
        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for(int i = 0; i < length; i++){
            Student4 student4 = (Student4) list.get(i);
            if(prevBan == -1){
                prevBan = student4.ban;
                prevRank = 1;
                prevTotal = student4.total;
                continue;
            }

            if(prevBan != student4.ban){
                prevBan = student4.ban;
                prevTotal = student4.total;
                prevRank = student4.classRank;
                continue;
            }

            if(prevTotal == student4.total){
                student4.classRank = prevRank;
            }else{
                int cnt = 0;
                for(int j = 0; j < i; j++){
                    Student4 st4 = (Student4) list.get(j);
                    if(prevRank == st4.classRank) ++cnt;
                }
                student4.classRank = prevRank + cnt;
            }

        }


    }


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student4("이자바",2,1,70,90,70));
        list.add(new Student4("안자바",2,2,60,100,80));
        list.add(new Student4("홍길동",1,3,100,100,100));
        list.add(new Student4("남궁성",1,1,90,70,80));
        list.add(new Student4("김자바",1,2,80,80,90));

        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}

class Student4 implements Comparable{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total; // 총점
    int schoolRank; // 전교등수
    int classRank; // 반등수

    Student4(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank
                +","+classRank
                ;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student4){
            Student4 s1 = (Student4) o;
            return s1.total - total;
        }
        return 0;
    }
}

class ClassTotalComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student4 && o2 instanceof Student4){
            Student4 s1 = (Student4) o1;
            Student4 s2 = (Student4) o2;

            return s1.ban != s2.ban ? (s1.ban - s2.ban) : (s1.total - s2.total) * -1;
        }
        return 0;
    }
}

