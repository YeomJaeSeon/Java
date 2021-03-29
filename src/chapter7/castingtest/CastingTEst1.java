package chapter7.castingtest;

public class CastingTEst1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();

        fe.water();
        car = (Car)fe; // 5 -> 4개로 사용할수있는 멤버개수 조절
        //car.water();
        fe2 = (FireEngine) car; // 4개 -> 5개 : 불안전 - 참조변수 형변환 생략불가

        fe2.water();

    }
}
class Car{
    String color;
    int door;
    void drive(){

    }
    void stop(){

    }
}
class FireEngine extends Car{
    void water(){

    }
}
