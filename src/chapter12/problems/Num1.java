package chapter12.problems;

import java.util.ArrayList;

class Product{}
public class Num1 {
    // 4번 - 지네릭 메서드로 변경 (와일드 카드 지네릭타입을 지네릭메서드로 변경)
    public static<T extends Product> ArrayList<T> merge(
            ArrayList<T> list, ArrayList<T> list2){
        ArrayList<T> newList = new ArrayList<>(list);

        newList.addAll(list2);
        return newList;
    }
}

/**
 *  1.
 *  a - 대입된 타입이 다르다.
 *  b 대입된 타입이 달라..
 *  c String item에 new Object() 가들어갈수있냐? NO! 반대는 됨 다형성으로
 *
 *  2.
 *  c. 지네릭 메서드 대입된 타입일치해야함.!
 *  d. 지네릭 메서드 타입 생략가능.
 *  3.
 *
 *  c - Object는 Fruit제한된타입 못지킴
 *  d - Fruit자식도아니고 참조변수, 생성자의 대입된 타입이 다르다.
 *  g - new 다음 타입변수 X
 *
 *  4.
    위에


 *
 */

