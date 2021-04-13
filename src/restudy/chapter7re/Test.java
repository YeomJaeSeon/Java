package restudy.chapter7re;

class Car{
    int door;
    String color;

    void stop(){
        System.out.println("Car.stop");
    }
    void move(){
        System.out.println("Car.move");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("FireEngine.water");
    }
}

class Ambulance extends Car{
    void loadAndUnload(){
        System.out.println("Ambulance.loadAndUnload");
    }
}

public class Test {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();
        Car c = (Car)f;
        //c.water
        FireEngine f2 = (FireEngine)c;
        f2.water();

//        Ambulance a = (Ambulance) c; // 참조변수타입 Ambulance의 리모컨에는 water가없다. 실제 가르키는 인스턴스에 무슨 멤버가
        // 있는지가중요.
//        a.loadAndUnload();
        Object obj = (Object) c;

        Car car = new Car();
//        Ambulance a = (Ambulance) car; // 실제인스턴스가 가르키는 멤버갯수는 4개인데 5개인 리모컨버튼을 줘버리면 안도미
//        a.loadAndUnload();

        Car carV = new Car();
        System.out.println(carV instanceof Car);
        System.out.println(carV instanceof Object);
        System.out.println(carV instanceof FireEngine); // carV를 FireEngine으로 형변환가능하냐? 안된다..
        // 참조변수 자신이나 부모클래스 타입에 대해서만 instanceof의 결과가 true이다.

        FireEngine fireEngine = new FireEngine();
        System.out.println(fireEngine instanceof Car);
        System.out.println(fireEngine instanceof FireEngine);
        System.out.println(fireEngine instanceof Object);

        Object object = new Object();
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Car); //마찬가지로 object를 자식클래인 Car클래스로 형변환? 불가능
        // 사실가능한데 위험한 형변환이다. 봐라

        // 이렇게 부모자식간의 관계에선 다 참조변수형변환되지만 보면 실제 가르키는 인스턴스의 멤버갯수가 기준이다. !!
        // 그래서 instanceof는 연산되는 클래스타입이 참조변수의 자신이나 부모가 아니면 false를 리턴해서
        // 참조변수형변환을 비추천한다.
        FireEngine f5 = new FireEngine();
        Object object5 = (Object) f5;
        Car car5 = (Car)object5; // 이렇게 ㅜ모타입의 차모변수도 자식타입으 ㅣ참조변수로 형변환가능한데 중요한건 실제 인스턴스읱타입.
        car5.move();


    }
}
