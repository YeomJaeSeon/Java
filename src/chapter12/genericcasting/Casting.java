package chapter12.genericcasting;

import java.util.ArrayList;

class Fruit{
    void origin(){
        System.out.println("원산지는 제주도");
    }

}
class Apple extends Fruit{
    String color = "RED";
}

public class Casting {
    public static void main(String[] args) {

        Fruit f = new Fruit();
        Apple apple = new Apple();
        f = (Fruit)apple;

        Fruit f2 = (Fruit) new Apple();



        Box b = null;
        Box<String> bStr = null;
        b = (Box) bStr;
        bStr = (Box<String>)b;

        Box b1 = (Box)new Box<String>();
        Box<String> bStr1 = (Box<String>)new Box();
        // 일반타입(raw type)과 지네릭타입은 형변환이 가능은한데 하지말자.
        b1.add(new Integer(100));

        Box<String> strB = null;
        Box<Integer> intB = null;
//        strB = (Box<String>)intB; // Box<Integer> intB -> Box<String> :에러

//        intB = (Box<Integer>)strB; // Box<String> strB -> Box<Integer> : 에러

        // 지네릭 타입간의 형변환은 불가능하다. 지네릭클래스의 객체는 참조변수와 생성자의 타입이
        //다르면 에러이므로.

        Box<? extends Fruit> fBox = (Box<? extends Fruit>)new FruitBox<Fruit>();
        Box<Fruit> fruitBox = null;

        Box<? extends Object> objectBox = (Box<? extends Object>)new Box<String>();

        Box<? extends Object> objectBox2 = (Box<? extends Object>)new FruitBox<>();
        test(new Box<String>());
        test(new Box<Integer>());
        // 와일드카드 <-> 지네릭타입간의 형변환 OK
    }
    static void test(Box<? extends Object> oBox){
        // Box<? extends Object> oBox = new Box<String>();
        // Box<? extends Object> oBox = new Box<Integer>();
        //타입불일치이므로 타입형변환 이 생략되어있음
        // Box<? extends Object> oBox = (Box<? extends Object> new Box<String>();
        //이렇게                          타입 형변환이생략되어있다.
    }
}

class Car{

}
class SportCar extends Car{

}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){
        list.add(item);
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
