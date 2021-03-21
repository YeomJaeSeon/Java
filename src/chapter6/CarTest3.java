package chapter6;

class Carf{
    String color;
    String gearType;
    int door;

    Carf(){
        this("white", "auto", 30); // 생성자가 다른생성자호출할땐 this()를 이용한다.
        //참조변수 this와 이 this()는 아애다름, this()는 생성자임.
    }
    Carf(Carf c){
        this(c.color, c.gearType, c.door); // 이런식으로 매개변수 세개인 생성자 호출하는게 더 좋음
    }
    Carf(String color, String gearType, int door){
        this.color = color; // 인스턴스변수와 매개변수의 이름이 같을땐 this.를 붙여서 구별한다.
        //여기서 this는 인스턴스 자신을 가르키는 참ㅂ조ㅕㅂㄴ수이다. 즉, 자신의 인스턴스 주소가 this에들어있다.
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest3 {
    public static void main(String[] args) {
        Carf c1 = new Carf(); // 기본값으로 인스턴스 변수 초기화됨
        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
        Carf c2 = new Carf(c1); // c2인스턴스는 c1의 인스턴스를 복사한거임. //생성자중 복사 생성자 이용함
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door); // 위 문장과 아애같다.

        c1.door = 300;
        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door); // 인스턴스변수 door은 다르다 ㅋㅋ
        // 왜냐며 ㄴc1과 c2의 참조변수는 다른 인스턴스를 가르키잖아. c1을 통해서 c1의 인스턴스 뭐 별지랄을해도 c2인스턴스는 관계가없음 아애다른 인스턴스를
        //두 참조변수가 가르키고있으므로

    }
}
