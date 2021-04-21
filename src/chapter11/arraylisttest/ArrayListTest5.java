package chapter11.arraylisttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest5 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); //capacity로 arraylist객체 생성
        list1.add(1);
        list1.add(2);
        list1.add(0);
        list1.add(-5);
        list1.add(8);
        // 정수 primitivetype int 가들어간거라고 생각하면 자바공부 다시하고와야함. 컬렉션은 객체만들어갈수있음
        // 컬렉션 클래스의 인스턴스엔 객체만들어갈수있음 이건 정수가아니라 Integer객체이다.
        // auto Boxing으로 primitive type이 컴파일시 자동으로 new Integer(1) 이 붙는것

        System.out.println("list1 = " + list1);

        List list = list1.subList(0, 3);
        ArrayList list2 = new ArrayList(list); // 부모타입인 Collection 참조변수가 자식인스턴스인 List 인스턴스를 참조할수있다 -
        // 이것도모르며녀 다형성 다시공부하고와햐암

        System.out.println("list2 = " + list2);

        Collections.sort(list1); // java.util 패키지의 Collections클래스임 List Set공통으 ㅣ인터페이스인Collection과는 다름
        System.out.println("list1 = " + list1);

        list2.add("B");
        list2.add("C");
        System.out.println("list2 = " + list2);
        list2.add(3, "A");
        System.out.println("list2 = " + list2);
        list2.set(3, "AAA");
        System.out.println("list2 = " + list2);
        boolean b = list1.retainAll(list2);
        System.out.println("b = " + b);
        System.out.println("list1 = " + list1);

        System.out.println("삭제전 list2 = " + list2);
        for (int i = 0; i < list2.size(); i++){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        System.out.println("삭제 후 list2 = " + list2);

        //remove메서드는 인덱스로올수도있고 객체르 ㄹ지정할수도있음
        System.out.println("list1 = " + list1);
        list1.add(0, "1");
        System.out.println("list1 = " + list1);
//        list1.remove(new Integer(1));
        list1.remove(1);
        System.out.println("list1 = " + list1);

        // 추가로ArrayList는 배열기반으로 지우기 떄문에 크기가 넘어가면 안된당.. ㅠㅠ

        System.out.println("삭제시작 --------");
        for(int i = list1.size() - 1; i >= 0; i--){
            System.out.println("list1 = " + list1);
            list1.remove(i);
        }
        System.out.println("삭제후 : list - " + list1); // 텅텅빔

        for(int i = 0; i < 15; i++){
            list1.add(1);
        }
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());

        Car c = new Car();
        Airplane a = new Airplane();

        ArrayList list3 = new ArrayList(10); // 아애 관계가 없는 객체들도 하나의 arraylist객체에 들어갈수이따.
        // 컬렉션이란 객체 '군'의 모임. 집합 다수의 객체 다양한종류의 객체.
        list3.add(c);
        list3.add(a);
        System.out.println("list3 = " + list3);

    }
}

class Car{

}
class Airplane{

}
