package chapter12.prac10;

import java.util.ArrayList;
import java.util.List;
class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}

public class GenericWhy {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        list.add("3");
        list.add(3);

        int i = list.get(2);
        System.out.println("i = " + i);
        // 지네릭 사용하면 컴파일시에 에러를 잡아준다.
        // 장점 2 ! : 형변환 생략이가능하다. 어짜피 Integer타입ㅇ르ㅗ 지정해줬으닌까 굳이 형변환할필요업서

        Box<Integer> box1 = new Box<Integer>(); //
        Box<? extends Object> box2 = new Box<Integer>();
        box2 = new Box<String>();
        // 하나의 참조변수타입으로 다양한 타입의 지네릭 입 참조가능 - wild card
        // 워낼는 참조변수 대입된 타입과 생성자 대입된 타입이 같아야하는데 그게아니다.

        Juice<Apple> juice = new Juice<Apple>();
        Juice<Banana> juice1 = new Juice<Banana>();

        FruitBox<Fruit> fruitBox = new FruitBox<>();
        fruitBox.makeJuice(juice);
        fruitBox.makeJuice(juice1);
    }
}

class Box<T>{
    List<T> arrayList = new ArrayList<>();
//    static T value = 0;
//    int[] arr = new T[10];
    // 지네릭의 타입변수 T -> static멤버에, new다음에 쓸수없음
    // static멤버는 모든 인스턴스의 공통, new다음은 명시적인 타입이와야한다
}
class Juice<T extends Fruit>{}

class FruitBox<T extends Fruit> extends Box<T>{

    // Juice<? extends Fruit> juice = new Juice<Apple>();
    // Juice<? extends Fruit> juice = new Juice<Banana>();
    // wild card이다.
    // 하나의 참조변수로 여러 타이브이 지네릭 이스턴스를 참조하기위해..
    public void makeJuice(Juice<? extends Fruit> juice){
        System.out.println("주스만듬");
    }

}