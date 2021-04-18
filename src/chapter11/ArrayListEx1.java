package chapter11;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 컬렉션 프레임워크
 * 컬렉션이란 데이터군, 다수의데이터, 데이터 그룹을 의미함.
 * 프레임워크는 표준화
 * 다수의 데이터를 다루는 표준화가 컬렉션 프레임엌이다.
 * 이 컬렉션 프레임웤(컬렉션 클래스들)은 모두 List, Set, Map 인터페이스를 하나씩 구현하고있따
 * 참고로 List, Set은 비슷한 부분이 많기때문에 Collection 인터페이스를 상속받는다.
 * List인터페이스는 순서 o , 중복 허용
 * Set인터페이스는 순서X, 중복 x
 * Map 인터페이스는 데이터가 key value로 저장되고 순서는 없고 key는 중복이 아된다. 글나 value는 중복이 상관없다.
 */
public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // list는 순서가있으므로 index이런게 가능하다.
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collections클래의 static 메서드인 sort메서드 정렬해줌
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // B C를 먼저넣어도 인덱스지정해주면 거기에 낑겨서 넣어버리네
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // ArrayList의 메서드 add vs set - add는 낑겨서 길이 가 하나 증가하는데 set은 변경을 한다. 데이터를 해당 idx의 데이터를 변경하는게 set
        // 해당idx에 데이터를 낑겨서 리스트 전체길이가 하나 증가하는게 add

        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); // 인터페이스로 이게가능한거임 Collections 인터페이스 구현한 넘만와라. 구현한 클래스 ArrayList
        // 인터페이스 다형성 기모띄!
        print(list1, list2);

        for(int i = list2.size() - 1; i >= 0; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);

    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1: " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
