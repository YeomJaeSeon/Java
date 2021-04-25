package chapter11.arraylisttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test55 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);
        list.add("1");
        list.add("2");
        list.add(0);
        list.add(1);
        System.out.println("list = " + list);

        ArrayList list2 = new ArrayList();
        list2.add('1');
        list2.add(10);
        list2.add(15);

        list.addAll(list2);
        System.out.println("list = " + list);
        ArrayList list3 = (ArrayList)list2.clone();
        List list4 = list3.subList(0, 2);
        System.out.println("list4 = " + list4);

        System.out.println("list1 = " + list);
        System.out.println("list2 = " + list2);

        for(int i = 0; i < list2.size(); i++){
            if(list.contains(list2.get(i))){
                list.remove(list2.get(i));
            }
        }
        System.out.println("list = " + list);

        list.add(1);
        list.add(2);
        System.out.println("list = " + list);



    }
}
