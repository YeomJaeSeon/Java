package chapter12.prac;

import java.util.ArrayList;

/**
 * 지네릭스 왜써? - 컴파일단계에서 타입체크 -> 런타입 에러를 컴파일 에러로바꿈
 * 형변환 생략가능.
 */

class Fruit{
    @Override
    public String toString() {
        return "Fruit";
    }
}
class Apple extends Fruit{
    @Override
    public String toString() {
        return "Apple";
    }
}
class Grape extends Fruit{
    @Override
    public String toString() {
        return "Grape";
    }
}
class Toy{
    @Override
    public String toString() {
        return "Toy";
    }
}
public class Test {
    public static void main(String[] args) {
        //타입변수에 Fruit타입 대입
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<Toy>();
//        Box<Grape> grapeBox = new Box<Apple>();
        // 참조변수와 생성자 대입된 타입이 무조건 같아야한다.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
//        appleBox.add(new Grape());

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);


    }
}

// Box<T> : 지네릭클래스, <T> : 타입변수
// 지네릵클래스 객쳄나들떈 타입변수에 타입지정해줘야함 지정된 타이븡ㄹ 대입된 타입이라괗ㅁ
class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}