package chapter11.res;

import java.io.ObjectStreamClass;
import java.util.*;

public class HashTEst {
    public static void main(String[] args) {
        Object[] objArr = { "1", 3, 100 , 3, 3, 3, "1", 1, 2,"3", 4, 4};
        Set set = new HashSet();
        for(int i = 0; i < objArr.length; i++){
            set.add(objArr[i]);
        }

        System.out.println("set = " + set);

        List list = new ArrayList(set);
        Collections.sort(list, new Check());
        System.out.println("list = " + list);

        Set set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(new Person(10, "염재선"));
        set1.add(new Person(10, "염재선"));

        System.out.println("set1 = " + set1);
    }
}
class Person{
    int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            return age == ((Person) obj).age && name == ((Person) obj).name;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "age : " + age + " name : " + name;
    }
}
class Check implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof String && o2 instanceof Integer){
            return Integer.valueOf((String)o1) - (Integer) o2;
        }
        else if(o1 instanceof Integer && o2 instanceof String){
            return (Integer)o1 - Integer.valueOf((String)o2);
        }
        else if(o1 instanceof Integer && o2 instanceof Integer){
            return (Integer)o1 - (Integer) o2;
        }
        return 0;
    }
}
