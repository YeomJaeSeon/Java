package second.chapter6.casting;
class Car{
    String color;
    int door;
    void drive(){
        System.out.println("drive, brrr");
    }
    void stop(){
        System.out.println("stop!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("water !!");
    }
}

class Ambulance extends Car{
    void siren(){
        System.out.println("siren~~~!!");
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        try{
            fe = (FireEngine) car;
        }catch (ClassCastException e){
            System.out.println("자식타입이 부모타입 인스턴스 참조못해요.. 참조변수의 타입의 멤버가 더 적거나 같아야하빈다.");
            System.out.println("왜냐면!? 참조변수(리모컨)이 없는걸가르키는건 프로그래밍적으로 에러거든요");
        }
        //참조변수형변환은 상속관계 ok
        //사용할수있는 멤버의개수 조절 ok

        //실제인스턴스는 그대로가만히있다는게 중요한것임.

    }
}
