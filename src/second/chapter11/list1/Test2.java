package second.chapter11.list1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
//equals와 hashCode
public class Test2 {
    public static void main(String[] args) {
        Person person = new Person("염재선", 20);
        Person person1 = new Person("염재선", 30);

        System.out.println(person.equals(person1));

        //hashcode()메서드를 오버라이딩 하지않으면 해쉬테이블 자료구조는 다른 객체로 인식함.
        Map<Person, Integer> store = new HashMap<>();
        store.put(person, 1);
        store.put(person1, 1);

        System.out.println(store.size());
    }
}
