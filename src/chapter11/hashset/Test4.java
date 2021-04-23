package chapter11.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            set.add((int)(Math.random() * 45) + 1); //int가 들어가는게 아닌거알고있지? 컬렉션 클래스에 값 넣는 것이므로 오토박싱으로 Integer객체로 바뀌어서들어감
        }
        System.out.println(set); // SET인터페이스는 순서없고 중복도없다. 그러므로 정렬이안됨
        // 정렬하려면? 순서가있어야겟다. LIST인터페이스 구현한 컬렉션 클래스로 변경해야함. 컬렉션 인터페이스를 구현한 넘들끼린 서로 변환이 쉬움. 생성자타이빙 Collection인 생성자가 존재하므로

        // 이렇게 List인터페이스 구현한 클래스로 변경한뒤 정렬.
        ArrayList list = new ArrayList(set);
        Collections.sort(list); // Collections클래스의 sort메서드의 매개변수타입은 List임. List인터페이스는 순서 O이기떄문이다. 그래서 COllection이라고안하고 List로한거임 Collection으로 하면 Set도포함되닌까>
        // Set 인터페이스는 순서 X, 중복 X이다.
        System.out.println(list);
    }
}
