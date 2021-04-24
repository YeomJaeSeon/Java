package chapter11.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Th {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "3", "3", "3"};

        HashSet set = new HashSet();
        for(int i = 0; i < objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println("set = " + set); // Set인터페이스의 특징 구현한 컬레겻ㄴ클래스 -> 중복 X!!
        // HashSet -> 중복X, 순서 X이므로 정렬도안됨 순서가없으므로 당연히 하려면 List로바꾸어ㅑ함
        // Colelction인터페이스 구현클래스끼리 변환시움 - 생서자가 Collection타입
        ArrayList list = new ArrayList(set);

//        Collections.sort(list); -> 기본 정렬 기준 Comparable로는 안됨. Compartor로 새로운 정렬기준을 만들어줘야함.(비교기준)
        System.out.println("list = " + list);
        // List는 정렬됨

    }
}
