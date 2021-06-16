package second.chapter6.casting;

import chapter13.synchronize.Dish;

class Animal{
    int age;
    String color;

    void breath(){
        System.out.println("alive..");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swimming ~ ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bark Bark!!");
    }
}

public class Test3 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test3() {
        Animal animal = new Fish();
        animal.breath();
        //다형성 실제인스턴스는 Fish여서 swim멤버도있음 참조변수에따라서 사용할 멤버개수가 조절됨
        Fish fish = (Fish) animal;
        fish.swim();
    }

    static void test1(){
        Fish fish = new Fish();
        fish.swim();
        Dog dog = null;
//        dog = (Dog)fish; 참조변수 형변환은 상속관계만가능
        Animal animal = fish;
        animal.breath();
        //animal.swim(); - 참조변수에따라 사용할수있는 멤버의개수가 조절되므로 Animal타이븨 참조변수는 swim멤버가없음
    }
    static void test2() {
        Animal animal = new Animal();
        Dog dog = null;
        //dog = (Dog) animal; // classCastException 발생
        //dog = new Animal(); //같은골임
    }

}
