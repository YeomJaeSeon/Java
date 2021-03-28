package restudy;

class Carg{
    int max_speed;
    String color;
    String gearType;
    static String company = "HyunDai";

    Carg(){
        this(200, "white", "auto");
    }
    Carg(int max_speed, String color, String gearType){
        //super()이 숨겨져있음 이건 Object()로 Object클ㄹ래스의 생성자.
        this.max_speed = max_speed;
        this.color = color;
        this.gearType = gearType;
    }

    void display(){
        System.out.println("gear : " + gearType + ", " + "Color : " + color + ", 최고속도" + max_speed);
    }
}
class SportCarg extends Carg{
    String sportType;

    SportCarg(){
        this.sportType = "아우디";
    }
    SportCarg(int max_speed, String color, String gearType, String sportType){
        super(max_speed, color, gearType);
        this.sportType = sportType;
    }

    @Override // 오버라이딩 선언부는 같으나 바디부분이 다름.
    void display() {
        super.display(); // super.참조변수로 부모클래스 오버라이딩한 메서드에 접근간으. 부모클래스 멤버에 메서드도 super.로접근가능
        System.out.println("스포츠카 차종 : " + this.sportType);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        SportCarg sportCar1 = new SportCarg();
        sportCar1.display();
        SportCarg sportCar2 = new SportCarg(300, "red", "not auto", "람보르기니 r8");
        sportCar2.display();
    }
}
// 계속 부모클래스의 생성자부터 호출해서 부모클래스의 멤버를 초기화부터한다. 정확히는 Object 생성자부터 가장먼저 호출되서 Object멤버 초기화
// 이이유는 자식클래스는 부모클래스의 멤버와 자식클래스의 멤버를 다가지고있으므로 모두사용가능. this.으로접근도가능 ㅡ래서
// 근데 자식클래스에서 (부모클래스의 멤버 초기화전에)부모클래스 멤버에 접근할수도있으므로 생성자 가자 ㅇ첫줄이 super();가 숨겨져이;ㅆ다.
//그래서 부모클래스의 멤버부터 부모클래스 생서앚가 ㅎ출되서 초기화되는것이다.