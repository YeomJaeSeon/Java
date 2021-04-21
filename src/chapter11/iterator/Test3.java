package chapter11.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 컬렉션 구조 다~ 달라.
 * 컬렉션 요소 읽는 방법도 다달라.
 * 표준화하면 읽어오는 방법 다 같게할수있음
 */
public class Test3 {
    public static void main(String[] args) {
        Collection c = new HashSet();
//        ArrayList arrayList = new ArrayList();
//        애초에 참조타입을 ArrayList로 했다면 구현체, 컬렉션을 HashSet으로 변경한다면
//        아래 코드를 변경해야할 가능성이잇음 왜냐면 HasSet과 ArrayList는 다른 멤버를 가지고있으닌까.(다 다른건아니지만 Collection 멤버는 공통으로 가지고잇음)
//        그래서 참조타입으로 Collection으로 하고 실제 인스턴스를 변경한다면 아래 멤버는 바뀌지않았다는 확신을주기떄문에
//        재사용성이 높아진다.
        c.add("1");
        c.add("2");
        c.add("3");

        Iterator iterator = c.iterator();
        // 컬렉션 요소 읽어오는 표준 인터페이스 - Iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
