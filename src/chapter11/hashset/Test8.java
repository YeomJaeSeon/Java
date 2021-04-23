package chapter11.hashset;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        Object[] objArr = {1, "1", 2, 2, 2};
        HashSet<Object> set = new HashSet<>();

        for(int i = 0; i < objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set);
        //중복이없음

        HashSet<Object> set2 = new HashSet<>();
        set2.add(5); set2.add(4); set2.add(-10); set2.add(20);
        System.out.println(set2); // set은 순서자체가없으므로 정렬이안됨

        List list = new ArrayList(set2); // Collection인터페이스 구현한 컬렉션 클래스끼린
        // 서로 변환이쉬움 생성자 타임이 Collection
        // 이렇게 List으로 바꿔주고 COllections.sort로 정렬
        Collections.sort(list);
        System.out.println(list);

        //set은 중복X이므로 무언가 추가할떄 존재하늕 ㅣ확인해야함 - equals(), hashCode()호출
        // 오버라이딩 되어있어야 적절히 값이나옴
        HashSet set3 = new HashSet();
        set3.add("1");
        set3.add("1");
        set3.add(new Person2("염재선", 10));
        set3.add(new Person2("염재선", 10));
        System.out.println(set3);
    }
}
class Person2{
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+":"+age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person2))return false;
        Person2 person2 = (Person2) obj;

        return this.name.equals(person2.name) && this.age == person2.age;
    }
}
