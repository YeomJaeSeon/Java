package chapter12.generic;

import java.util.ArrayList;

class Animal{
    @Override
    public String toString() {
        return "Animal";
    }
}
class Cat extends Animal{
    @Override
    public String toString() {
        return "Cat";
    }
}
class Dog extends Animal{
    @Override
    public String toString() {
        return "Dog";
    }
}
public class Test {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        animalBox.add(new Animal());
        animalBox.add(new Cat());

        Box<Cat> catBox = new Box<>();
        catBox.add(new Cat());
        catBox.add(new Cat());


        Test.<Cat>print(new Cat()); //타입생략가능.
        print(new Dog());

        print2(animalBox);
        print2(catBox);

    }
    //지네릭 메서드 - 메서드선언부에 타입변수 선언 -> 메서드 호출할떄마다 다른 타입을 지정해줄수있음
    static <T> void print(T thing){
        System.out.println(thing);
    }
    // 와일드 카드 - 하나의 참조변수에 다른 지네릭 타입의 여러 객체를 담을수있음
    static void print2(Box<? extends Animal> box){
        System.out.println(box);
    }
}
// 지네릭 제한된타입 - Animal타입이나 Animal 자식타입.
class Box<T extends Animal>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){
        list.add(item);
    }
    T get(int idx){
        return list.get(idx);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}