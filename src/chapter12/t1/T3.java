package chapter12.t1;

import java.util.ArrayList;
import java.util.List;

public class T3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        //List인터페이스, ArrayList클래스는 제너릭 클래스다. 타입변수들이있어 여기에 타입을 대입한다.
        // 타입 변수에 타입 대입한것 .
        list.add(1);
        list.add(2);
//        list.add("3"); // 실제로가지고있는건 String객체

        Integer i = list.get(1); // 어짜피integer닌까 원래 List에는 Object[]이 들어있는데
        // 지네릭 이용하면 형변환 생략이가능하다.
        System.out.println("i = " + i);

    }
}
// 컴파일시 에러를 체크해줌! - 장점
// 형변환 생략 -> 지네릭 장점