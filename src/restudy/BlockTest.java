package restudy;

class Carvv{
    static int count;
    int serialNo; // 인스턴스변수
    String gearType;
    String color;
    {
        count++;
        serialNo = count;
        System.out.println("{ }");
    }
    Carvv(){
        this("auto", "white");
        System.out.println("매개변수 x생성자");
    }
    Carvv(String gearType, String color){
        this.gearType = gearType;
        this.color = color;
        System.out.println("매개변수 o생성자");

    }
    Carvv(Carvv other){
        this(other.gearType, other.color);
        System.out.println("복사 생성자");

    }
    // 초기화블럭은 복잡한 초기화를 할때 사용하거나 생성자들의 공통의 로직을 묶어서 중복된코드를 줄여서 재사용성, 유지보수를 높인다.
    // 객체지향이 지향한느 바와같음
    // 추가로 인스턴스 초기화블럭은 생성자 보다 먼저 호출된다.
}

public class BlockTest {
    public static void main(String[] args) {
        Carvv car1 = new Carvv();
        Carvv car2 = new Carvv();
        Carvv car3 = new Carvv("full auto", "red");

        System.out.println(car1.serialNo + ", " + car2.serialNo + ", " + car3.serialNo);

        Carvv car4 = new Carvv(car3);
        System.out.println(car4.serialNo + ", " + car4.gearType + ", " + car4.color);

    }

}
