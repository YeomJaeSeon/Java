package chapter9.equals;

// java.lang패키지의 Object 클래스의 메서드 equals를 봐보자.
class Car{

}
class FireEngine extends Car{

}
class Animal{

}
public class Ex1 {
    public static void main(String[] args) {
        Car car = new Car();
        Animal animal = new Animal();
        Car c1 = new FireEngine();
        System.out.println(car.equals(c1));
    }
}
