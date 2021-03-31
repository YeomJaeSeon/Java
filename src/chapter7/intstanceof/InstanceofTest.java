package chapter7.intstanceof;

class Car{

}
class FireEngine extends Car{

}
class Ambulance extends Car{

}

// instanceof는 참조변수 형변환 가능한지 여부를 확인하는 연산자
// 참조변수 형변환전에 instanceof로 형변환 가능한지 여부를 먼저살핀다.
public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        Car c = new Car();

        // 참조변수와 타입과 같은 인스턴스 타입은 OK
        if(fe instanceof FireEngine){
            System.out.println("This is a FireEngine instance");
        }
        // 참조변수타입보다 조상인 Car 타입은 OK
        if(fe instanceof Car){
            System.out.println("This is a Car Instance");
        }
        Car c2 = fe; // 참조변수 형변환 가능.
        //참조변수보다 조상인 Object타입은 ok
        if(fe instanceof Object){
            System.out.println("This is a Object Instance");
        }

        Object o = (Object) fe;
        // 이건 false. c는 FireEngine의 조상클래스이므로.
        if(c instanceof FireEngine){
            System.out.println("This is a FireEngine Instance");
        }

        FireEngine f3 = (FireEngine)c2;  // 참조변수 형변환이가능하긴한데. 생략불가.
        System.out.println(fe.getClass().getName());
    }
}
