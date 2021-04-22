package chapter11.comparablecomparator;

import java.util.Arrays;
import java.util.Comparator;

// Comparable, Compartor : 정렬기준 제공 인터페이스, Comparable - compareTo메서드 , 기본정렬 기준
// Compartor : custom 정렬기준
public class Test2 {
    public static void main(String[] args) {
        int[] intArr = {5, 1, 3, 100, -10};

        Arrays.sort(intArr); //Comparable인터페이스의 compareTo메서드를 통해서 정렬기준제공. 기본정렬기준임

        System.out.println("Arrays.toString(intArr) = " + Arrays.toString(intArr));

//        Arrays.sort(intArr, new Descending2());

        System.out.println("Arrays.toString(intArr) = " + Arrays.toString(intArr));

    }
}
class Descending2 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return 0;
    }
}
