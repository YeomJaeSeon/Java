package second.chapter12.enum12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// 관련되 상수끼리 묶음 enum
enum Sex{
    MALE, FEMALE
}
enum Champion{

    GOLD(3, Sex.MALE), SILVER(2, Sex.FEMALE), BRONZE(3, Sex.MALE), IRON(4, Sex.FEMALE);

    private final int tier;
    private final Sex sex;
    Champion(int tier, Sex sex) {
        this.tier = tier;
        this.sex =sex;
    }

    public int getTier() {
        return this.tier;
    }

    public Sex getSex() {
        return sex;
    }
}
class Student{
    private Champion champion;
    private String name;
    private int age;

    public Student(Champion champion, String name, int age) {
        this.champion = champion;
        this.name = name;
        this.age = age;
    }

    public Champion getChampion() {
        return champion;
    }

    public void setChampion(Champion champion) {
        this.champion = champion;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && getChampion() == student.getChampion() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChampion(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "champion=" + champion +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Student student = new Student(Champion.GOLD, "김성휘", 20);
        System.out.println(student);
        Student student1 = new Student(Champion.SILVER, "박진주", 25);
        System.out.println(student1);
        Student student2 = new Student(Champion.SILVER, "박진주", 25);
        Student student3 = new Student(Champion.GOLD, "김박박", 25);

        Set<Student> set = new HashSet<>();
        set.add(student);
        set.add(student1);
        // hashCode오버라이딩해서 hashCode가같음.
        // set은 중복이안되므로 hashCode와 equals로 같다고 되어있으므로 중복저장안됨.. 같은사람임
        set.add(student2);
        set.add(student3);

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getChampion().getSex());
        }

        System.out.println("=======================================");
        Champion champion = Champion.GOLD;
        Champion champion1 = Champion.GOLD;

        System.out.println(champion1 == champion);
        System.out.println(champion1.equals(champion));

        System.out.println(student.getChampion() == student3.getChampion());
        //같음? 같다..
    }
}
