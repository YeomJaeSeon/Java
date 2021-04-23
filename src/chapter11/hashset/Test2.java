package chapter11.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(new Integer(num));
        }
        System.out.println(set);
        // set은정렬못함. - set은 순서 X이므로, 순서가있어야 정렬가능
        // 그래서 list로 바꾸고 정렬한 과정이 아래임.

        List list = new LinkedList(set);
        Collections.sort(list); // 매개변수타입 List임.
        System.out.println(list);
    }
}
