package chapter12.genericcasting;

class Animal{
    void breath(){
        System.out.println("숨쉽니다.");
    }
}

class Cat extends Animal{
    void catSound(){
        System.out.println("야옹");
    }
}
class Dog extends Animal{
    void dogSound(){
        System.out.println("멍멍");
    }
}
public class CastingTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal = (Animal) cat;
        Cat cat2 = (Cat)animal;
        cat2.catSound();

        Animal animal1 = new Cat();
        ((Cat)animal1).catSound();

        Animal animal2 = (Animal)new Dog();
        ((Dog)animal2).dogSound();

        Cat c = new Cat();
        Animal a = (Animal) c;

        ((Cat)a).catSound();

        Animal a2 = new Animal();
//        Cat cat1 = (Cat) a2;
//        cat1.catSound();

        Animal animal3 = (Animal) new Cat();
        ((Cat)animal3).catSound();

        Cat cat1 = (Cat) animal3;
        cat1.catSound();
    }
}
