package chapter12.basic;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(new Integer(2));
//        list.add("3");
        list.add(3);

        Integer i = (Integer)list.get(2);
        System.out.println("i = " + i);
    }
    // 지네릭스는 컴파일시에 타입을 체크해주는 기능이다.
    // 런타임에러보다 실행전에 알수있는 컴파일에러가 낫기에 런타임에러를 컴파일 에러로 어떻게하면 끌어올까
    // 생각하다 추가된 기능이 지네릭스이다.
    // 지네릭스로 타입을지정하면 컴파일시에 에러를 잡을수있따.
    // 추가로 형변환 생략도가느앟다.
}
