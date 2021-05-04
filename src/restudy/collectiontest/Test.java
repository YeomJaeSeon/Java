package restudy.collectiontest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = (List) new ArrayList<>();
        list.add(1);
        list.add(2); //런타임에러를 컴파일시간에 체크할수있게가져옴

        Integer i = list.get(1);
        System.out.println("i = " + i);
    }
}

class Box<T>{
    List<T> list = new ArrayList<>();

}