package chapter11.arraylisttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        // AutoBoxing으로 pri -> Integer로 컴파일시 코드가 추가가되는것임.
        list1.add(1);
        list1.add(2);
        list1.add(0);
        list1.add(-10);
        list1.add(30);

        System.out.println("list1 = " + list1);

        List list = list1.subList(0, 3);
        ArrayList list2 = new ArrayList(list); // Collection c인 생성자를 호출하는것
        System.out.println("list2 = " + list2);

        Collections.sort(list1); // Collections클래스의 sort메서드임 List, Set조상인 Collection인터페이스와는 다름
        System.out.println("list1 = " + list1);

        System.out.println("----");
        System.out.println("list2 = " + list2);
        list2.add("B");
        list2.add("C");
        System.out.println("list2 = " + list2);
        list2.add(3, "A");
        System.out.println("list2 = " + list2);

        list2.set(3, "AAA");
        System.out.println("list2 = " + list2);
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));
        System.out.println("list1 = " + list1);
        for(int i = 0; i < list2.size(); i++){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        list1.add(0, "1");
        System.out.println("list1 = " + list1);
//        list1.remove(new Integer(1));
//        list1.remove("1"); // 아애다름 new Integer(1)과 new String(1)은..
        list1.remove(1); //index로삭제
        System.out.println("list1 = " + list1);


    }
}
