package chapter11.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2" ,"3", "3", "4", "4", "4"};
        HashSet set = new HashSet();

        // 중복된 것들은 다빠졌따. SET 인터페이스는 순서X, 중복X
        for(int i = 0; i < objArr.length; i++){
            System.out.println(set.add(objArr[i]));
        }
        System.out.println(set);

        // HashSet은 Collection 인터페이스 구현한 컬렉션클래스이므로 iterator()메서드가
        // 존재함. (구현한상태로)
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
