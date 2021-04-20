package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        List arrayList = new ArrayList(2000000);
        List linkedList = new LinkedList();

        System.out.println("===순차적으로 추가하기=====");
        System.out.println("ArrayList : " + add1(arrayList));
        System.out.println("add1(linkedList) = " + add1(linkedList));

        System.out.println();
        System.out.println("add2(arrayList) = " + add2(arrayList));
        System.out.println("add2(linkedList) = " + add2(linkedList));
        System.out.println();
        System.out.println("remove2(arrayList) = " + remove2(arrayList));
        System.out.println("remove2(linkedList) = " + remove2(linkedList));
        System.out.println();
        System.out.println("remove1(arrayList) = " + remove1(arrayList));
        System.out.println("remove1(linkedList) = " + remove1(linkedList));
    }
    public static long add1(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            list.add(i+"");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove1(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
