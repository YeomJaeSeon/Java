package chapter11.iterator;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        Collection list = new HashSet();
        list.add("1");
        list.add(new Integer(1));
        list.add('1');
        list.add(new Integer(3));
        list.add("0");

        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Test5.main");
        Iterator iterator1 = list.iterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
