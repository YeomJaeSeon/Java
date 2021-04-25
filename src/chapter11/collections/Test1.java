package chapter11.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collections클래스 -> 컬렉션다루는 유용한 메서드제공(static)을
// Arrays, Objects와같이 static으로 메서드들이 존재하고.. !!
public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("list = " + list);

        Collections.addAll(list, 1, 2, 3, 4 ,5); // 컬렉션에 데이터 채우기
        System.out.println("list = " + list);

        Collections.rotate(list, 2); // 오른쪽으로 이동
        System.out.println("list = " + list);

        Collections.swap(list, 0, 2); // 컬렉션의 위치 swap
        System.out.println("list = " + list);

        Collections.shuffle(list); // 임의로 섞기
        System.out.println("list = " + list);

        Collections.sort(list); // 정렬하기
        System.out.println("list = " + list);

        Collections.reverse(list); // 역순정렬
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.sort(list, Collections.reverseOrder()); // 위의 reverse(list)와같음
        System.out.println("list = " + list);

        int idx = Collections.binarySearch(list, 3); // 이진탐색
        System.out.println("idx = " + idx);

        // 집계
        System.out.println("Collections.max(list) = " + Collections.max(list));
        System.out.println("Collections.min(list) = " + Collections.min(list));
        System.out.println("Collections.max(list, Collections.reverseOrder()) = " + Collections.max(list, Collections.reverseOrder()));

        Collections.fill(list, 9); // 채우기
        //채우기
        System.out.println("list = " + list);

        List newList = Collections.nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        System.out.println("Collections.disjoint(list, newList) = " + Collections.disjoint(list, newList));

        Collections.copy(list, newList);
        System.out.println("list = " + list);
        System.out.println("newList = " + newList);

        Collections.replaceAll(list, 2, 10);
        System.out.println("list = " + list);
    }
}
