package chapter12.prac2;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Friend("염재선", 20));
        list.add(new Friend("김미남", 30));
        list.add(new Friend("김천재", 40));

        Iterator it = list.iterator(); //Iterator는 지네릭 인터페이스
        while(it.hasNext()){
            Friend tmp = (Friend)it.next();
            System.out.println("it.next() = " + tmp.getName());
        }
        // Iterator 지네릭 인터페이스인데 지네릭 사용안할때

        //사용할때
        Iterator<Friend> it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println("it2.next().getName() = " + it2.next().getName());
        }
        // 형변환 생략이 가능하다. Iterator에 지네릭 사용하면 형변환 생략이가능함..!!!

        Map map = new HashMap();
        map.put("염재선", new Friend("염재선", 20));
        map.put("김미남", new Friend("김미남", 30));
        map.put("김천재", new Friend("김천재", 40));

        // Map은 형변환필수
        System.out.println("map = " + ((Friend)map.get("염재선")).getName());

        Map<String, Friend> map1 = new HashMap<>();
        map1.put("김", new Friend("김", 30));
        System.out.println("map1 = " + map1.get("김").getName());

        // 이렇게 지네릭스 사용하면 형변환 안해도됨!!
        // 지네릭스장점 1. 타입 명시 -> 타입안전성(런타임에러 -> 컴파일에러)
        // 형변환 생략이 가능하다는것1
    }
}
class Friend{
    private String name;
    private int age;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
