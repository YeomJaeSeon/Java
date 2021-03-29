package chapter7.refcasting;

class Car{
    String color;
    int door;
    void drive(){
        System.out.println("드라이브중");
    }
    void stop(){
        System.out.println("멈춘상태");
    }
}
class Ambulance extends Car{
    void bbibbo(){
        System.out.println("삐뽀삐보");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("물뿌리는중");
    }
}

public class Test {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();
        Car c = null;
        FireEngine f2 = null;

        c = f; //멤버의 개수를 5개에서 4로 줄임. 자식 클래스 에서 부모클래스로 형변환 -형변환생략

//        c.water(); Car타입은 water()이 없다.

        f2 = (FireEngine) c;
        f2.water(); // f2는 fireEngine클래스타입이므로 water() 메서드 멤버가있으므로 접근가능1

        //이렇게 참조변수의 형변환은 사용할수잇는 멤버의 개수를 조절한다.

//        Ambulance a = (Ambulance) f;// 부모자식간의 관계 , 상속관계까아지면 참조변수 casting불가능
    }
}
