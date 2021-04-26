package chapter12.basic.prac2;

import java.util.ArrayList;
import java.util.List;

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

public class Ex121 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Grape> grapeBox = new Box<Grape>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

//        appleBox.add(new Fruit());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        grapeBox.add(new Grape());
//        grapeBox.add(new Apple());


        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }

}
// 지네릭 클래스
class Box<T>{ // 타입변수 선언 <T> - T가아니여도된다.
    List<T> list = new ArrayList<T>(); // ArrayList도 지네릭클래스임. 지네릭클래슥 ㅐㄱ체만들떈 참조변수 대입할타입과 생성자 대입하는 타입이 무조건같아야함 예외없음 - 생략가능(생성자쪽)

    void add(T list){
        this.list.add(list);
    }
    T get(int idx){
        return list.get(idx);
    }
    int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}