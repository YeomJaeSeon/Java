package chapter12.basic;

import java.util.ArrayList;
import java.util.List;

// 지네릭스 왜쓰는지엗 ㅐ한 생각
public class GenericNeeds {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
//        list.add("3");
        list.add(3);

        Integer i = list.get(2); // 컴파일러의 한계
        System.out.println("i = " + i);
        // 지네릭스 장점 1 -> 컴파일단계에서 에러를 잡을수있게도와준다. 런타임 에러보단 컴파일 에러가 더 낫기에.
        // ArrayList 는 Object배열을 가지고있다. 그래서 형변환해줘야하는데 안해줘도되! 지네릭스 사용하면
        // 형변환 생략가능. 이게 장점2

        // 지네릭스 장점은 컴파일시에 타입을 체크해줌으로써 타입 안전성을 제공하낟.
        //말이어렵네 그냥 지네릭스 쓰면 컴파일러가 컴파일단계에서 에러를 잡을수있게 도와준다. (런타임 에러보다 훨씬 낫다. 컴파일에러가)

    }
}
