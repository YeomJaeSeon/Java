package chapter11.iterator;

import java.util.*;

public class It3 {
    public static void main(String[] args) {
        Collection list1 = new LinkedList(); // Collection 참조변수탕비이면 List인터페이스 구현한 ArraYList가 인스턴스든, HashSet이 인스턴스든
        // List인터페이스, Set인터페이스 공통의 Colection인터페이스 리모컨으로만 만졌다는 의미닌까 아래 코드는 하나~도 바꾸지않아도된다.
        // 참조변수타입에따라서 사용할수있는 멤버의갯수가 달라진다는건 당연한일.

        list1.add("1");
        list1.add("1");
        list1.add("3");// 어레이리스트는 리스트 인터페이스 구현한 컬렉션클래스이므로 중복 O, 순서 O

//        System.out.println("list1 = " + list1);

        Iterator it1 = list1.iterator();
        while(it1.hasNext()){
            System.out.println("it1.next() = " + it1.next());
        }

        HashMap map = new HashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");

        Iterator it2 = map.entrySet().iterator();
        // iterator(메서드를 통해서 Iterator를 사용해서 요소에 접근할수있는데 Collection 인터페이스의 메서드이다. 그러므로 Map인터페이스 구현 클래스들은 직접 사용못한다.
        // 그런데 entrySet, keySEt, values같은 메서드들이 리턴하는 값이 Collection, Set이므로 이를 통해서 iterator상요가능
        while(it2.hasNext()){
            System.out.println("it2.next() = " + it2.next());
        }

    }
}
