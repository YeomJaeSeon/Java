package chapter11.res;

import chapter5.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class ArrayListTEst {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);
        list.add(1);
        list.add(2);
        list.add("1");
        list.add(-1);
        list.add(1);

        Collections.sort(list, new CompareNumAndString());
        ArrayList list2 = new ArrayList(list);
        System.out.println("list2 = " + list2);


        ArrayList list3 = new ArrayList(list.size());
        for(int i = 0; i < list.size(); i++){
            list3.add(list.get(i));
        }
        System.out.println("list3 = " + list3);

        list3.set(1, 10);
        System.out.println("list3 = " + list3);
        list3.add(2, 100);
        System.out.println("list3 = " + list3);

        list3.retainAll(list2);
        System.out.println("list3 = " + list3);

        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList list10 = new ArrayList(10);
        list10.add(s.substring(0, 10));
        System.out.println("list10 = " + list10);


    }
}
class CompareNumAndString implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Integer && o2 instanceof String){
            Integer i = (Integer) o1;
            String s = (String) o2;
            return i - Integer.valueOf(s);
        }
        else if(o1 instanceof String && o2 instanceof Integer){
            return Integer.valueOf((String)o1) - (Integer) o2;
        }
        else if(o1 instanceof Integer && o2 instanceof Integer){
            return (Integer)o1 - (Integer) o2;
        }
        return 0;
    }
}
