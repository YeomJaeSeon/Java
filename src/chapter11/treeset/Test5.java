package chapter11.treeset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Test5 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        HashSet set1 = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            set.add((int)(Math.random() * 45) + 1);
            set1.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("set = " + set); // BST로 구조가 정해져있는 TreeSet컬렉션 클래스는 정렬이 된다
        // 비교기준이있어야할텐데 왜냐면 컬렉션은 primitivetype을 담는 저장소가아니라 객체군을 담잖아. Integer클래스는 Comparable ㅂ교기준 이터페이스
        //구혆되어있으므로 비교가되고 정렬이되는것
        System.out.println("set1 = " + set1); // HashSet은 정렬안됨

        TreeSet set3 = new TreeSet(new PP());

        set3.add(new PP());
        set3.add(new PP());
        set3.add(new PP());
        System.out.println("set3 = " + set3);


    }
}
class PP implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return -1;
    }
}

