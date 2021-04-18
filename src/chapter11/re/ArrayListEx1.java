package chapter11.re;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(0);
        list1.add(4);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);

        print(list1, list2);
        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2)); // list2는 list1에 다 포함되어있다.

        list2.add('b');
        list2.add("e"); // 요렇게 정수만있다가 문자 넣어도되고 문자열넣어도되네
        list2.add(3, 'a');
        print(list1, list2);
        list2.set(3, 'A');
        print(list1, list2);
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2)); // list1에서 list2와 겹치는 부분만 남기고 다삭제한다.

        for(int i = list2.size() - 1; i >= 0; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
            print(list1, list2);
        }

    }
    private static void print(Collection list1, Collection list2){
        System.out.println("list1  : " + list1);
        System.out.println("list2 : " + list2);
    }
}
