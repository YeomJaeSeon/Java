package chapter11.arraylisttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest4 {
    public static void main(String[] args) {
        // ArrayList컬렉션 클래스 - 여러 객체들을 모아놓음. 관리하기쉽게..! 프레임워크  : 정형화된틀 != library
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(-1);
        arrayList.add(100);
        // primitive type데이터가 컬렉션 클래스 객체에 들어가는게아님. 오토박싱으로 객체로 변환되고 들어가는거임. ref변수로.

        System.out.println("arrayList = " + arrayList);
        List list = arrayList.subList(0, 3);
        ArrayList arrayList1 = new ArrayList(list); // ArrayList(Collection c); 생성자호출

        Collections.sort(arrayList);
        System.out.println("arrayList1 = " + arrayList1);
        arrayList1.add("A");
        arrayList1.add("B");
        System.out.println("arrayList1 = " + arrayList1);
        arrayList1.add(3, "C");
        System.out.println("arrayList1 = " + arrayList1);
        arrayList1.set(3, "CCC");
        System.out.println("arrayList1 = " + arrayList1);
        arrayList1.add(0, "2");
        System.out.println("arrayList1 = " + arrayList1);
//        arrayList1.remove(new Integer(2));
        arrayList1.remove("2");
        System.out.println("arrayList1 = " + arrayList1);

        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        System.out.println("arrayList1.get(0) instanceof String = " + arrayList1.get(0) instanceof String);




    }
}
