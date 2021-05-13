package chapter14.lambdastart;

import java.util.*;

public class Ex14_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ddd", "aaa", "ccc", "bbb", "aba");
        //Arrays클래스엔 list롭녀경해주는 메서드가존재하구나.

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2); // String클래스의 메서드임
//            }
//        });
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        // 귀찮게 익명클래스를통해 객체생성하는 것보단 그냥 람다식을 써버리는게 편하다.
        System.out.println(list);

    }
}
