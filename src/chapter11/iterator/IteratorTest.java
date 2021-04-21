package chapter11.iterator;

import java.util.*;

/**
 * 컬렉션마다 다 구조갇라라서 읽어오는 방법이 다다르다.
 * 이 컬렉션의 요소르 ㄹ읽어오는 방법을 표준화한 인터페이스가 바로 Iterator임.
 * Collection인터페이스(Set, List의 조상 인터페이스)
 * 가 Iterator를 반환하는 iterator() 추상메서드가존재하고
 * 각 컬렉션들이 자신에 맞게 해당 추상메서드를 구현(인터페이스를 구현)하였기에 컬렉션마다
 * 읽어오는 방법을 표준화할수있는것이다.
 */
public class IteratorTest {
    public static void main(String[] args) {
        // arrayList 컬렉션에서 HashSet으로 변해도 Iterator로 요소에 접근해서 읽어오는 방버은 변하지않는다. 코드 변경 최소화
        Collection c = new HashSet<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator iterator = c.iterator(); // ArrayList클래스는 Collection인터페잇를
        //구현했다.. 해당 인터페이스에는 Iterator를 반환하는 iterator() 추상메서드가있으므로 Collection인터페이스
        // 구현한 ArrayList는 자신의 컬렉션 구조에 맞게 iterator()추상메서드를 구현했다.
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator iterator1 = c.iterator(); // iterator는 일회용이다.
        //한번 다써서 false를 반환했으면 다시 새로운 객체를 얻어와야한다.
//        for(int i = 0; i < arrayList.size(); i++){
//            Object o = arrayList.get(i);
//            System.out.println(o);
//        }

    }
}

///
// Iterator정리
// 컬렉션마다 다 구조가 달라서 요소를 읽어오는 방법이 다 ~ 다르다.
// 욧요소를 읽어오는 방법을 표준화 한것이 Iterator 인터페이스이다.
// Iterator인터페이스를 반환하는 iterator() 메서드는 추상메서드로 Collection인터페이스에 정의되어있으므로 Collection인터페이스를 구혆나
// List, Set인터페이스 구현한 구현클래스는 해당iterator()추상메서드를 자신의 컬렉션 구조에맞게 구현했기에
// Iterator인터페이스로 각 컬렉션들의 표준화된 방법으로 요소르 ㄹ읽어올수있다.
