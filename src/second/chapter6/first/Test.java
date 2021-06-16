package second.chapter6.first;

class Car{
    String color;

    void drive(){
        System.out.println("뛰뛰빵빵");
    }
}

// 상속이란 기존의 클래스를 재사용하여 새로운 클래스를 생성하는것.
//
class SportsCar extends Car{

    //오버라이딩 : 부모클래스의 메서드(상속받은 메서드)를 자신에맞게 변경한것
    // 선언부는 그대로, 바디만다르게!(내용만 변경)
    @Override
    void drive(){
        System.out.println("우르르쾅쾅!!");
        super.drive();
    }


    //오버로딩
    void drive(String msg){
        System.out.println(msg);
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        SportsCar sportsCar = new SportsCar();
        // 자식인스턴스를 생성하면 부모의멤버와, 자신의 멤버를 가지고있는 인스턴스가 생성됨

        car.color = "black";
        sportsCar.color = "red";

        System.out.println(car.color);
        System.out.println(sportsCar.color);


        car.drive();
        sportsCar.drive();

        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        // 클래스의 풀네임은 패키지까지 포함된것

        //import하면 다른 패키지의클래스의 패키지이름을 생략할수있음
        //외부 패키지이름을 지정하는게import임
        // import없으면 다른 패키지의 클래스 사용할때 다 저렇게 패키지이름으 ㄹ써줘야함..



    }
}
