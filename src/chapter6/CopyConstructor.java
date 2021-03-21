package chapter6;

class Carc{
    String color;
    String gearType;
    int maxSpeed;

    Carc(){
        this("white", "auto", 200);
    }
    Carc(Carc anotherInstance){
//        color = anotherInstance.color;
//        gearType = anotherInstance.gearType;
//        maxSpeed = anotherInstance.maxSpeed;
        this(anotherInstance.color, anotherInstance.gearType, anotherInstance.maxSpeed);//이런식으로 복사생성자도
        // 다른 매개변수있는 생성자를 호출하면 더간단하게할수있음.
    }
    Carc(String color, String gearType, int maxSpeed){
        this.color = color; // this.는 자신 인스턴스를 가르키는 ref변수
        this.gearType = gearType; //인스턴스변수와 매개ㅕㅂㄴ수이름같을때사용
        this.maxSpeed = maxSpeed;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Carc c1 = new Carc();
        Carc c2 = new Carc("red", "autoauto", 500);

        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.maxSpeed);
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.maxSpeed);
        //이렇게 c1인스턴스와 c2인스턴스는 다른 인스턴스 변수를 가지고잇음 ㅋ

        Carc copyC1 = new Carc(c1);
        Carc copyC2 = new Carc(c2);
        System.out.println(copyC1.color + ", " + copyC1.gearType + ", " + copyC1.maxSpeed);
        System.out.println(copyC2.color + ", " + copyC2.gearType + ", " + copyC2.maxSpeed);

        c1.maxSpeed = -100;
        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.maxSpeed);
        System.out.println(copyC1.color + ", " + copyC1.gearType + ", " + copyC1.maxSpeed);
        // 별개의 인스턴스를 가르키고있음. 참조변수가 . 그러므로 -100해도 반영안도미
    }
}
