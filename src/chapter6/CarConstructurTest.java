package chapter6;

class Carv{
    String color;
    String gearType;
    int maxSpeed;

    Carv(){
        this("white", "auto", 200); // 생성자가 다른생성자호출 - 규칙1 첫줄, 규칙2 : this()를 통해 다른생성자호출
    }
    
    Carv(String color, String gearType, int maxSpeed){
        this.color = color; // this는 자신의 인스턴스를 가르키는 참조변수임, 이 this는 인스턴스 메서드가 기본적으로 숨겨놓고가지고있따. - 인스턴스변수사용하는메서드 - 생성자도포함
        this.gearType = gearType;
        this.maxSpeed = maxSpeed;
    }
}

public class CarConstructurTest {
    public static void main(String[] args) {
        Carv c1 = new Carv();
        System.out.println(c1.color + ", " +c1.gearType + ", " + c1.maxSpeed);
        //생성자에의해 기본값호ㅜㄹ
        Carv c2 = new Carv("red", "not auto", 300); // 위와는 다른 생성자를 호출함. - 매개변수있는 생성자호출
        System.out.println(c2.color + ", " +c2.gearType + ", " + c2.maxSpeed);

    }
}
