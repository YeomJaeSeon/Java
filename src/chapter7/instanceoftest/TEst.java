package chapter7.instanceoftest;

import restudy.test.CarTest; // 다른패키지의 ㅋ르래스를 사용할땐 import를함 사실 패키지이름 까지 클래스의 fullname인데쓰기귀찮아서 생략하기위해 import사용

import static java.lang.Math.*; // static import하면 static메서드 (클래스메서드)접근할때 클래스이름 생략가능.

class Car{
    int x = 100;
//    restudy.test.CarTest c = new restudy.test.CarTest(); // 클래스 fullname은 패키지이름까지 패키지는 클래스 묵음 실제적인 디렉토리고 클래스는
    // 실제적인 클래스파일이다.
    void printRandom(){
        System.out.println((int)(random() * 10));
    }
}
final class Ambulance extends Car{
    int x = 200;

    @Override
    void printRandom() {
        System.out.println("랜덤 아니지렁~ 낚시임");
    }
}
class FireEngine extends Car{

}

public class TEst {
    public static void main(String[] args) {
        Car c = new Ambulance();
        FireEngine f = new FireEngine();
        Ambulance a = new Ambulance();

        //instanceof 연산자는 참조변수 형변환하기전 되는지확인 참조변수 형변환하기전 이런식으로 확인하고 형변환해야한다.
        System.out.println(c instanceof FireEngine); //X
        System.out.println(f instanceof Car); // O
        System.out.println(c instanceof Object); //O
//        System.out.println(a instanceof FireEngine); --
        System.out.println(a instanceof Car); // O
        System.out.println(a instanceof Object); //O

        // 참조변수와 인스턴스
        System.out.println(a.x);
        System.out.println(c.x);

        a.printRandom();
        c.printRandom();
        // 메서드는 당연히 실제 인스턴스가 Ambulance닌까 당연히 Ambulance멤버가르키는데
        //위에 멤버변수는 실제인스턴스가(a, c참조변수가 가르키는 인스턴스) Ambulance로 같아도 c.x는 100인 부모멤버를 가르킴. 멤버변수만이럼.

    }
}
