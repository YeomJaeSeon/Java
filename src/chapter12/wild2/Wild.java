package chapter12.wild2;

// 하나의참조변수로 서로 다른 타입이 대입된 지네릭 객체를 다루기위한 와일드카드

import java.util.ArrayList;

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
class Juice{
    String name;

    Juice(String name){
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}
class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        for (Fruit fruit : box.getList()) {
            tmp += fruit + " ";
        }
        return new Juice(tmp);
    }
}
public class Wild {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleFruitBox));

    }
}

class FruitBox<T extends Fruit> extends Box<T>{}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item){
        list.add(item);
    }
    ArrayList<T> getList(){
        return list;
    }
}