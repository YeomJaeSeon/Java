package chapter12.basic;

import java.util.ArrayList;
class Tv{}
class Audio{}
public class T3 {
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv타입의 객체만 저장가능함.
        //지네릭스 타입은 참조변수, 생성자에 둘다넣어줘야하고 **일치**해야함.

        list.add(new Tv());

        Tv t = list.get(0); // 형변환 생략가능함.
//        list.add(new Audio());
        //문제없등ㅁ. 지네릭 안썻을땐

    }
}
