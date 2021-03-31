package restudy.test;

class FireEngine extends Car{
    void water(){
        System.out.println("물뿌리는중");
    }
}
class Ambulance extends Car{
    void bbibbo(){
        System.out.println("삐뽀삐뽀");
    }
}

class Car{
    String color;
    int doorCnt;
    
    void drive(){
        System.out.println("brrrr...");
    }
    void stop(){
        System.out.println("stop!!");
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c = new Car(); // 실제존재하느 인스턴스의 멤버가 4개
        FireEngine f = new FireEngine();

        System.out.println(f instanceof Car);

//        f = (FireEngine) c; // FireEngine멤버는 6개..
        // 실제 인스턴스가 뭔지식별하는게중요 실제 인스턴스의 멤버개수가 기준이도미
        // 참조변수 형변환은 사용할수있는 멤버 갯수를 조절하는것이고, 상속관계에서만 형변환가능

        FireEngine f2 = new FireEngine(); // 인스턴스의 멤버갯수가 기준임 총 5개
        Car c2 = null;
        FireEngine f3 = null;
        c2 = (Car)f2; //안전.  자식 -> 부모 : 사용할수잇는 멤버에서보면 5개 - 4개이므로 안전
        //c2.water()은 없으므로 안됨

        f3 = (FireEngine) c2; // 그래서 classCaseException error가 안나오는것.
        // 안전 X , 부모 -> 자식 : 사용할수있는 멤버갯수 기준에선 4개 -> 5개 : 위험한 형변환이다고 알려주기위해 생략불가
        f3.water();
    }
}
