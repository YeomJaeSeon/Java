package chapter7.tester;

class Car{
    int door;
    String color;

    void drive(){
        System.out.println("부릉");
    }
    void stop(){
        System.out.println("멈춤");
    }
}
class FireEngind extends Car{
    void water(){
        System.out.println("물뿌리는중");
    }

}
class Ambulance extends Car{
    void bbibbo(){
        System.out.println("삐뽀삐뽀");
    }

}

public class Test {
    public static void main(String[] args) {
        Car c = new FireEngind();
        // 다형성, 부모의 타입의 참조변수가 자식타입의 인스턴스 접근가능
//        FireEngind f = new Car(); // error 역은안됨
        // 좌변의 사용가능한 멤버개수가 적거나같아야함 이건 에러임 리모컨의 버튼수가더많음

        //c.water()이건 없음 Car의 멤버중 water()메서드가 없음.

        c.drive();

        Car c2 = null;
        FireEngind f2 = new FireEngind();
        FireEngind f4 = null;

        c2 = (Car) f2; //사용가능한 멤버개수 5개 -> 4개 안전
        c2.stop();
        f4 = (FireEngind)c2; //이건됨 실제인스턴스의 멤버가 5개이므로 그러나 위험함 생략불가
        f4.water(); //이것도딤 실제 가르키는 인스턴스의 멤버중에 water()가있음 실제 가르키는 인스턴스가 FireEngine임..
        //이렇게 참조변수에따라서 사용가능한 멤버개수가 다를수있음.


//        Car c3 = new Car();
//        FireEngind f3 = null;
////        f3 = (FireEngind) c3; // 상속관계는 참조변수 형변환가능 -  멤버개수조절
//        // 4개 -> 5개 위험 형변환 생략불가
//        //그런데 이거는 classCastError나옴. 실제 인스턴스가 가지고있는건 4개
//        // f3는 5개 이러헥 중요한건 실제 인스턴스의 멤버개수가 기준인된다.
//        f3.drive();
    }
}
