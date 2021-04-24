package chapter11.arraylisttest;

import java.util.ArrayList;

public class At2 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add("1");
        list1.add(3);
        list1.add(5);
        list1.add(0);
        list1.add(100); // new Ineger로 오토박싱해서 들어가는거임. 컬렉션은 객체 집합을 관리하는 클래스임.
        System.out.println("list1 = " + list1);
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        System.out.println("list2 = " + list2);

        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));
        list2.add(0, "AA");
        list2.add(2, "AA");
        System.out.println("list2 = " + list2); // 이렇게 중간에 추가삭제하는건 ArrayList는성능이좋지못함. 배열기반이므로..
        // 배열은 중간에 추가하면 전부 모든 원소 뒷방으로 다 옮겨야함.
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2)); // 겹치는 부분빼고 나머지 다~ 삭제함. retain All
        System.out.println("list1 = " + list1);
        // list1, list2의 교집합이네 retainAll은

        System.out.println("-------------");
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        for(int i = 0; i < list1.size(); i++){
            if(list2.contains(list1.get(i))) // 포함하는지 안하는지 확인. 하나의 객체가 컬랙션 클래슥 객체안에 존재하는지 확인.
                list2.remove(list1.get(i));
        }

        System.out.println("list2 = " + list2);
    }
}
