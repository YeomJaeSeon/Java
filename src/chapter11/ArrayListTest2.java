package chapter11;

import chapter5.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        // 객체배열만 저장됨. ArrayList에는
        // autoBoxing으로 기본형이 참조형으로 자동변환.
        list1.add(1);
        list1.add(new Integer(2));
        list1.add(new Integer(3));
        list1.add(2);
        list1.add(-10);
        // autoboxing으로 컴파일시 new Integer()이게 추가가되는것이다./
        // 컬렉션은 다수의 객체집함임. primitive type아님.

        List list = list1.subList(0, 2);
        ArrayList list2 = new ArrayList(list); //사용한거임.
        System.out.println(list2);

        Collections.sort(list1); // Collections는 java.util클래스임
        System.out.println(list1);

        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        System.out.println("list2 = " + list2);
        list2.add(3, 'A'); // 이것도 autoboxing으로 new Character('A')가 포함됨
        System.out.println("list2 = " + list2); // 부담되는작업임

        list2.set(3, "AA"); // set은 변경 - add와다르네 add는 밀어내면서 추가해
        System.out.println("list2 = " + list2); // 
        
        list1.add(0, "1");
        System.out.println("list1 = " + list1);
        System.out.println("list1.indexOf(\"1\") = " + list1.indexOf("1"));
        // idx 0과 idx 2의 1은 다름 0은 String ㅡㄹ래스의 객체, idx2는 Integer클래스의 객체

        list1.remove(new Integer(1)); // Integer 1인녀석을 삭제함
//        list1.remove(1); - index 1인걸 지우는게됨
        System.out.println("list1 = " + list1);
        // remove는 인덱스로 객체로 값을 지울수있음.

        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));
        System.out.println("list1 = " + list1);

    }
}
