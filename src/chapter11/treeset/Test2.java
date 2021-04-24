package chapter11.treeset;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i = 0; set.size() < 6; i++){
            set.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("set = " + set); // 정렬이되서낭ㅁ. TreeSet - BST, 이진탐색트리로 되어있음. 정렬, 범위검색에 유리함

        Set set1 = new TreeSet(); // Comparable비교기준이 제공된 상태임

        set1.add(new Person(20));
        set1.add(new Person(30));
        set1.add(new Person(40));
        set1.add(new Person(5));

        System.out.println("set1 = " + set1);

        // Comparator로 비교기준제공시 생성자에 비교기준을ㅈ ㅔ공해야함
        TreeSet set2 = new TreeSet(new Person2()); // Compartor 비교기준을 제공함


        set2.add(new Person2(10));
        set2.add(new Person2(5));
        set2.add(new Person2(15));
        set2.add(new Person2(7));

        System.out.println("set2 = " + set2);

        // 이렇게 TreeSet은 정렬, 범위검색에 유리하.ㅁ BST로되어있기에, BST는 이진탐색트리로 이진트리의일종
        // 이진트리는 부모노드 아래 자식노드 최대두개
        // BST는 왼쪽 자식노드는 부모노드보다 값이작고 오른쪽 자식노드는 부모노드보다 값이 크다.


    }
}
// Comparator - 로 비교기준 제공
class Person2 implements Comparator{
    private int age;

    public Person2(int age){
        this.age = age;
    }
    public Person2(){
        this(100);
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Person2 && o2 instanceof Person2){
            Person2 tmp1 = (Person2) o1;
            Person2 tmp2 = (Person2) o2;

            return tmp1.age - tmp2.age;
        }
        return 0;
    }
}

// Comparable로 비교기준 제공 (TreeSet은 BST로구성- 정렬과 범위검색에 유리함)
class Person implements Comparable {
    private int age;
    public Person(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person tmp = (Person) o;
            return tmp.age - age;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }
}


// BST !!! 구조인 컬렉션클래스 TreeSet