package chapter11.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

//        for(int i = 0; set.size() < 6; i++){
////            set.add((int)(Math.random() * 45) + 1);
//            set.add(new Practice());
//        }
        set.add(new Practice2());
        set.add(new Practice2());
        set.add(new Practice2());
        set.add(new Practice2());
        set.add(new Practice2());
        set.add(new Practice2());

        System.out.println("set = " + set);
        // 정렬이되서나옴. TreeSet은 정렬, 범위검색에 유리 - BST로되어있음로
    }
}

class Practice2 implements Comparable{

    @Override
    public int compareTo(Object o) {
        return -1;
    }
}

class Practice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return -1;
    }
}

/**
 TreeSet 컬렉션 클래스는 BST로 구성되어있음. 그래서 정렬과 범위검색에 유리함
 근데 정렬하려면 비교기준이 있어야한다.
 그래서 TreeSet컬렉션 클래스를 사용할땐 비교기준을 설정해줘야한다. Comparable과 Comparator 인터페이스를 통해서
 Comparator를 통해서 비교기준을 직접 설정해서 생성자 매개변수로줄수도있고
 Comparable로 매개변수 없는 생성자를 호출해서 비교기준을 제공할수도있다.
 **/