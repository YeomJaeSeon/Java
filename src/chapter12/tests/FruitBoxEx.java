package chapter12.tests;

import java.util.ArrayList;

// 지네릭클래스의 객체생성, 사용
// 지네릭 타입변수 제한 <T extends Type>
// wild card
//세개복습
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

class Juice{
    String name;

    Juice(String name){
        this.name = name + "Juice";
    }
    public String toString(){
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        ArrayList<? extends Fruit> list = box.getList();
        for (Fruit fruit : list) {
            tmp += fruit + " ";
        }
        return new Juice(tmp);
    }
}

public class FruitBoxEx {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
//        FruitBox<Toy> toyFruitBox = new FruitBox<Toy>(); 지네릭타입의 타입변수제한함.Fruit or 그자식타입만

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        Juice juice = Juicer.makeJuice(fruitBox);
        System.out.println(juice);
        FruitBox<Apple> fruitBox1 = new FruitBox<>();
        Juice juice1 = Juicer.makeJuice(fruitBox1);
        System.out.println(juice1);

    }
}

class FruitBox<T extends Fruit> extends Box<T>{

}

// 지네릭 클래스 -타입변수 <T>
class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    // void add(Fruit item){ ~}
    void add(T item){
        list.add(item);
    }
    T get(int idx){
        return list.get(idx);
    }
    int size(){
        return list.size();
    }

    ArrayList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}