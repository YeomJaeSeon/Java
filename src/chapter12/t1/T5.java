package chapter12.t1;

import java.util.ArrayList;
import java.util.List;

class Fruit<T>{
    @Override
    public String toString() {
        return "Fruit";
    }
}
class Apple<T> extends Fruit{
    @Override
    public String toString() {
        return "Apple";
    }
}
class Toy<T>{
    @Override
    public String toString() {
        return "Toy";
    }
}
public class T5 {
    public static void main(String[] args) {
        //지네릭 클래스 객체생성
        Boxes<Fruit> fruitBoxes = new Boxes<>();
//        Boxes<Fruit> fruitBoxes1 = new Boxes<Apple>();
        Boxes<Apple> appleBoxes = new Boxes<>();
        Boxes<Toy> toyBoxes = new Boxes<>();

        Fruit<Integer> fruit = new Apple<Integer>(); // 다형성은 적용됨. 그러나 타입변수엗 대입된 타입은 무조건같아야함.

        fruitBoxes.add(new Fruit());
        fruitBoxes.add(new Apple()); // 됨..! 매개변수 다형성도 적용됨

//        appleBoxes.add(new Fruit());
        appleBoxes.add(new Apple());

        toyBoxes.add(new Toy());
//        appleBoxes.add(new Toy());

        System.out.println(fruitBoxes);
        System.out.println(appleBoxes);
        System.out.println(toyBoxes);
    }
}


class Boxes<T>{
    private List<T> list = new ArrayList<T>();

    public void add(T item){
        list.add(item);
    }
    public T get(int idx){
        return list.get(idx);
    }
    public T remove(int idx){
        return list.remove(idx);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}