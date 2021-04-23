package chapter11.hashset;

import java.util.HashSet;
import java.util.Objects;

public class Test5 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        // "abc"는 이미존재하므로 추가안됨(HashSet - 중복 X)
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));
        // 이건중복이네 왜? - HashSet은 추가할때 equals, hashcode를 실행
        // 그런데 오버라이딩된게없으므로 중복이 존재함.
        // equals()와 hashcode()를 오버라이딩 해야함.

        System.out.println(set);

    }
}
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name +":"+age;
    }

    // hashCode와 equals 오버라이딩 짞꿍임 - 이게정석.
    @Override
    public int hashCode() {
        // Objects.hash()로 오버라이딩함. - 객체 구별하는 기준이 iv이므로 iv만 이렇게 전달함.
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) return false;
        Person tmp = (Person)obj; // 리모컨 바꿔줘야 name age사용할수있음 당연함.
        return this.name.equals(tmp.name) && this.age == tmp.age;
    }
}
