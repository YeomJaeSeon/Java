package chapter11.iterator;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Collection c = new HashSet(); // 컬렉션 싺싺바꿔도 Iterator로 요소에 접근하면
        // 표준화한 방법이므로 같은 방법으로 요소에접근할수있음(컬렉션 구조가 다달라도.)
        c.add(1);
        c.add("2");
        c.add(3);

        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // Iterator객체는 일회용 다시 생성해줘야함
        System.out.println();
        Iterator iterator1 = c.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        /**
         * Iterator인터페이스 사용법
         * iterator()메서드로 Iterator객체를 생성.
         * iterator()메서드는 Collection 인터페이스 내부에 존재한다.
         * 그래서Set List인터페이스 구현한 컬렉션 클래스들은 직접 사용할수있는것
         * 그러나 Map은 Collection인터페이스와 관계가없음. (자손 인터페이스가 아님.)
         * 그런데 Map인터페이스 구현한 컬렉션 클래스는 entrySet, keySet, values메서드를
         * 가지고잇는데 반환 타입이 Set, Set, Collection이다.
         * 그래서 Map구현 클래스인 컬렉션 클래스는 직접 Iterator객체 못사용하는데(iterator()메서드가 없으므로)
         * keySet, entrySet, values를 통해서 Iterator객체를 사용할수있다.
         */

        HashMap hashMap = new HashMap();// Map - key, value로 이루어짐
        hashMap.put(1, "1");
        hashMap.put(2, "2");
        hashMap.put(3, "3");
        Iterator iterator2 = hashMap.entrySet().iterator();

        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }


}
/**
 * Iterator는 인터페이스인데 컬렉션의 요소에 접근하는데 표준화한것. 컬렉션마다 구조가 다다르니 읽는 방법도다름
 * Iterator는 iterator()메서드로 가져올수있는데 iterator()메서드는 Collection인터페이스가 추상메서드로가지고있어서
 * Collection인터페이스 구현한 구현클래스(Set, List구현한 클래스, 컬렉션 클래스)가 iterator메서드로 바로 딱 받을수있다.
 * 그로나~Map은 바로 몼씀.. 그래서 keySet, entrySet, values메서드를 통해 반환타입으로 Colection인터페이스나 자식 인터페이스로
 * 맞추고 iterator()메서드를 이용해서 ITerator객체를 받아와서 Map컬렉션 구조의 요소에 접근할수있따.!!!
 *
 */
