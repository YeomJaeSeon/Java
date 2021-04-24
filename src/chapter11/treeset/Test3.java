package chapter11.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// TreeSet클래스의 subSet메서드사용
public class Test3 {
    public static void main(String[] args) {
        // String녀석들은 정렬 기준인 Comparable인터페이스의 compareTo메서드가 구현되어있다. 가서봐보자. String

        TreeSet set  = new TreeSet(new IntAndString());
        set.add("abc");
        set.add("Car");
        set.add("bar");
        set.add("far");
        set.add("car");
        set.add("dar");
        set.add("dz");
        set.add("ABC");
        set.add("cdd");
        set.add("radio");
        set.add(1);

        System.out.println("set = " + set);

        System.out.println("from b to d");
        System.out.println(set.subSet("b", "d"));
        System.out.println(set.subSet("b", "dzzz"));
    }
}
class IntAndString implements Comparator{
    String str = new String();
    @Override
    public int compare(Object o1, Object o2) {
        if(o2 instanceof Integer){
            return -1;
        }
        return str.compareTo((String)o2);
    }
}
