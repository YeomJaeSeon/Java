package restudy;

class CarAs{
    int price;
    double speed;
    String color;

// 생성자는 인스턴스변수 초기화.하는 작업을한다.
    CarAs(int price, double speed, String color){
        this.price = price;
        //this.price 는 인스턴스변수를 가르킴, this는 인스턴스 자신을 가르키는 참조 변수임다. 우항의 price는 매개변수임
        this.speed = speed;
        this.color = color; // this는 인스턴스 자신을 가르키는 참조변수 (ref변수)
    }
    CarAs(CarAs otherInstance){
        this(otherInstance.price, otherInstance.speed, otherInstance.color);
        // 생성자에서 다른생성자 호출하기.
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        CarAs a = new CarAs(1000, 300.5, "red");
        System.out.println(a.price + ", " + a.speed + ", " + a.color);

        CarAs b = new CarAs(a);
        System.out.println(b.price + ", " + b.speed + ", " + b.color);

        a.price = 2000;
        System.out.println("변경 후");
        System.out.println(b.price + ", " + b.speed + ", " + b.color);

    }
}
