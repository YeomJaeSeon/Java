package chapter11.hashset;

import java.util.HashSet;

//Set인터페이스구현한 대표 컬렉션 클래스가
// HashSet 컬렉션 클래스 - SEt인터페이스 구현한것. 순서없고 중복업는게 특징.
public class Test3 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "2", "3", "3"};
        HashSet set = new HashSet();

        // set은 중복X이므로 중복된 값ㄷ은 삭제가됨. 그러나STring객체와 new Integer객체는 다르기에 중복이 아니므로 삭제안된걸 볼수있겠따.
        for(int i = 0; i < objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set);
    }
}
