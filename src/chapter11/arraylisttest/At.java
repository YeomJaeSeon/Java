package chapter11.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class At {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("1");
        list.add(1);
        list.add(-10);
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        Arrays.sort(intArr);// Arrays클래스의 static메서드인 sort의 파라미터로는 배열밖에못온다. 컬랙션 클래스 객체는 못온다.
        System.out.println("intArr = " + Arrays.toString(intArr));
        Collections.sort(list, new Compare()); // 정렬 기준을 Comparator로 지정해줄수있음.. 이렇게 // 컬랙션 클래스 객체 정렬하고싶으면 Collections클래스를 이용
        // 기본 정렬기준 사용할땐 Comparable인터페이스. Integer, Double, String같은 클래스들은 이미 Comparable인터페이스의 compareTo메서드를 구현해놧음
        System.out.println("list = " + list);
    }
}
class Compare implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof String && o2 instanceof Integer){
            String s1 = (String) o1;
            Integer i1 = (Integer) o2;

            Integer stringToInt = Integer.valueOf(s1);
            return stringToInt - i1;
        }
        else if(o1 instanceof Integer && o2 instanceof String){
            Integer i1 = (Integer) o1;
            String s2 = (String)o2;

            Integer stringToInt = Integer.valueOf(s2);
            return i1 - stringToInt;
        }
        else if(o1 instanceof Integer && o2 instanceof Integer){
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            return i1 - i2;
        }
        return 0;
    }
}
