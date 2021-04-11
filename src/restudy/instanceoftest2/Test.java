package restudy.instanceoftest2;

class Car{

}
class FireEngine extends Car{

}
class Ambulance extends Car{

}
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        // instanceof는 참조변수 형변환전에 확인하는 연산자.
        FireEngine f = new FireEngine();
        System.out.println(c instanceof Car);
        System.out.println(c instanceof FireEngine);
        System.out.println(f instanceof Car);
        System.out.println(f instanceof FireEngine);
    }

}
