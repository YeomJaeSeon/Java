package chapter7.castingtest2;

class Car{
    String color;
    int door;
    void drive(){
        System.out.println("운전중");
    }
    void stop(){
        System.out.println("스탑");
    }
}
class FireEngine extends Car {
    void water(){
        System.out.println("물뿌리는중");
    }
}


public class CastingTest2 {
    public static void main(String[] args) {
        Car c = null;
        FireEngine f = new FireEngine();
        c = f; //참조변수 형변환 -> 사용할수있는 멤버의 개수를 조절 . 5 -> 4개(자식 타입 -> 부모타입) => 안전함. 타입 생략가능
        //c.water() 안됨. 컴파일에러.
        FireEngine f2 = null;
        f2 = (FireEngine)c;
        f2.water();

        Car c2 = new Car();
//        FireEngine f2 = (FireEngine) c2;

    }
}
