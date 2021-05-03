package restudy.collection;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        String i = list.get(0); // 형변환생략가능하네. arrayList는 Object[]가지고잇는데
        // 왜냐면이게 지네릭임
        // 지네릭은 컴파일때 에러 체크 + 형변환생략가능
        System.out.println("i = " + i);

    }
}

