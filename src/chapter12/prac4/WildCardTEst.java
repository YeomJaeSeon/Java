package chapter12.prac4;

import java.util.ArrayList;

// 박스에 과일넣고 박스를 쥬스에넣으면 과일쥬스완성
//와일드 카드
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
    public Juice(String name){
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
        for(Fruit f : box.getList())
            tmp  += f + " ";
        return new Juice(tmp);
    }
}
public class WildCardTEst {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<? extends Fruit> wildCardBox = new FruitBox<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleFruitBox));
        // new FruitBox<Fruit>(), new FruitBox<Apple>();
        // 참조변수와 생성자의 대입된 타입이 달라도 OK - 와일드카드로..!
        //<? extends Fruit> : Fruit과 Fruit자식
        //<? super Fruit> : Fruit과 Fruit부모
    }
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
    ArrayList<T> getList(){
        return list;
    }

}