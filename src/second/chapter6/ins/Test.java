package second.chapter6.ins;

class Car{
    void drive(){
        System.out.println("brr");
    }
}
class FireEngine extends Car{
    void siren(){
        System.out.println("BBI BBO ~");
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new FireEngine();
        FireEngine fireEngine = new FireEngine();

        Car car1 = new Car();

        if(fireEngine instanceof FireEngine){
            System.out.println("this is a FireEngine instance");
        }

        FireEngine fireEngine1 = fireEngine;

        if(fireEngine instanceof Car){
            System.out.println("this is a Car instance");
        }

        Car car2 = fireEngine;

        if(fireEngine instanceof Object){
            System.out.println("this is a object instance");
        }
        Object o = fireEngine;


    }
}

/**
 instanceof : 참조변수 형변환전에 확인하는 연산자
 참조변수를 해당 타입으로 형변환가능하단뜻.
 실제 가르키는 인스턴스 타잉과 같은 타입이거나 부모타입이면 true로 참조변수 형변환 가능
 많은 멤버 -> 적은멤버 가르키는건 문제안됨.
 **/