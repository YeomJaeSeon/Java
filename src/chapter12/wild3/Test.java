package chapter12.wild3;

import java.util.ArrayList;
import java.util.List;

// 와일드카드는 하나의 참조변수로 여러 지네릭객체를 다룰수있음 (대입된 타입이 달라도돔!)
class Animal{
    @Override
    public String toString() {
        return "Animal";
    }
}
class Lion extends Animal{
    @Override
    public String toString() {
        return "Lion";
    }
}

class Cat extends Lion{

}
class Product{
    @Override
    public String toString() {
        return "Product";
    }
}
class Computer extends Product{
    @Override
    public String toString() {
        return "Computer";
    }
}

public class Test {
    ArrayList list = new ArrayList();
    public static void main(String[] args) {
        FavoriteAnimals<? extends Lion> lionFavoriteAnimals = new FavoriteAnimals<Cat>();
        FavoriteAnimals<? extends Lion> favoriteAnimals = new FavoriteAnimals<Lion>();
        // 하나의 참조타입으로 여러타입의 지네릭 객체

        FavoriteAnimals.print(new ArrayList<Animal>());

        printAnimal(new Lion());
        printAnimal(new Animal());
        printAnimal(new Cat());
        // 지네릭 메서드 - 호출할떄마다 다른 지네릭 타입을 줄수있음.
    }
    // 지네릭 타입변수 제한(Animal이나 Animal제외)
    static <T extends Animal> void printAnimal(T animal){
        System.out.println(animal);
    }
}

class FavoriteAnimals <T extends Animal>{
    static <T extends Animal> void print(List<T> list){
        System.out.println(list);
    }
    ArrayList<T> list = new ArrayList<>();
    void add(T item){
        list.add(item);
    }
    T get(int idx){
        return list.get(idx);
    }
}