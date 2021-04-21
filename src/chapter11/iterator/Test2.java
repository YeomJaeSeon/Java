package chapter11.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
//        Collection list = new ArrayList();
//        ArrayList list = new ArrayList();
        // 위아래 두 코드의 차이는뭘까?
        // 참조변수 타입이다르다. Collection인터페이스를 구현한 클래스가 ArrayList클래스이다.
        // 만약 컬렉션이 HashSet으로 변경되야한다. 변경해보자.
        Collection list = new HashSet();
        // 그냥 뒤에 실제 인스턴스만 변경하면 된다. 즉, 참조변수타입이 Collection이면 HashSet과,
        // ArrayList의 공통의 조상이면 어짜피 해당 참조변수의 리모컨의 멤버만 사용했으닌까
        // 컬렉션이 변경되도 아래 코드가 바뀔게없다. 공토의 조상 Collection 인터페이스의 멤버만
        // 사용했음이 뻔하닌까.만약 참조변수타입이 ArrayList면 HashSet과 겹치지않는 멤버를
        // 사용했을 가능성이있으므로 아래코드를 확인해봐야겠다.
        // 이렇게 참조변수타입을 잘 결정하는게 코드의 유지보수를 쉽게 하냐 , 어렵게하냐의 결정적인차이점이다.
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // Iterator 인터페이스로 컬렉션의 요소를 읽어오루싱ㅆ음
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        Iterator iterator1 = list.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
