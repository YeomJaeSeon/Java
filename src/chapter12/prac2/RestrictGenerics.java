package chapter12.prac2;

// 지네릭클래스의 타입변수에 오는 타입을 제한하는 제한된 지네릭 클래스

import java.util.ArrayList;

interface Eatable{}
class Fruit implements Eatable{
    public String toString(){
        return "Fruit";
    }
}
class Kiwi extends Fruit{
    public String toString(){
        return "Kiwi";
    }
}
class Grape extends Fruit{
    public String toString(){
        return "Grape";
    }
}

class WaterMelon extends Fruit{
    @Override
    public String toString() {
        return "WaterMelon";
    }
}
class Desk{
    @Override
    public String toString() {
        return "Desk";
    }
}

public class RestrictGenerics {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Kiwi> kiwiFruitBox = new FruitBox<>();
        FruitBox<Grape> grapeFruitBox = new FruitBox<>();
        Box<Desk> deskFruitBox = new Box<>();
//        FruitBox<Eatable> eatableFruitBox = new FruitBox<Eatable>();
//        FruitBox<Object> objectFruitBox = new FruitBox<Object>();
        Box<Object> objectBox = new Box<>();
        // 제한된 타입이 없으므로 OK!
//        FruitBox<Desk> deskFruitBox1 = new FruitBox<Desk>();
        FruitBox<WaterMelon> waterMelonFruitBox = new FruitBox<WaterMelon>();
//        waterMelonFruitBox.add(new Kiwi());
        waterMelonFruitBox.add(new WaterMelon());

//        FruitBox<Fruit> fruitBox1 = new FruitBox<WaterMelon>();



        fruitBox.add(new Fruit());
        fruitBox.add(new Kiwi());
        fruitBox.add(new Grape());

        kiwiFruitBox.add(new Kiwi());
//        kiwiFruitBox.add(new Fruit());
//        kiwiFruitBox.add(new Grape());

        deskFruitBox.add(new Desk());
//        deskFruitBox.add(new Fruit());

        System.out.println(fruitBox);
        System.out.println(kiwiFruitBox);
        System.out.println(deskFruitBox);


    }



}
// 제한된 지네릭 클래스, 타입변수에 대입할수있는 타입을 Fruit이나 Fruit자식 타입으로 제한했음.
// 그외이 타입은 오지못함.
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

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
    public String toString(){
        return list.toString();
    }
}
