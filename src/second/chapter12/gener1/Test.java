package second.chapter12.gener1;

import chapter5.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        fruitBox.setName(new Fruit()); // 지네릭 클래스의 타입변수에 대입된 타입을 확인하면 쉽게뭔소린지 알수있음

        fruitBox.setName(new Apple());

        appleBox.setName(new Apple());

        grapeBox.setName(new Grape());

    }
}
class Fruit{

}
class Apple extends Fruit{

}
class Grape extends Fruit{

}

class Box<T>{
    T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}