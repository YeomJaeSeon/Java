package restudy.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    static Long sequence = 0L;

    public static void main(String[] args) {
        Map<Long, Person> map = new HashMap<>();

        map.put(++sequence, new Person("염재선", 20));
        map.put(++sequence, new Person("강수호", 30));

        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Long, Person> entry = (Map.Entry<Long, Person>)iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age =age;
    }

    @Override
    public String toString(){
        return name + " " + age;
    }
}