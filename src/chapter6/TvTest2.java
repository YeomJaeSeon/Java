package chapter6;

class Tv1{
    // 클래스 이름 대문자로하는 규칙잊지않았땅.
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

public class TvTest2 {
    public static void main(String[] args) {
        Tv1 t1 = new Tv1();
        Tv1 t2 = new Tv1();
        // 참조변수 (인스턴스의 주소를 저장할 t1, t2)
        // new를 통해서 인스턴스생성했고 해당 인스턴스의 주소를 참조변수 t1, t2에 담았다.
        // 참조변수타입과 ㅇ니스턴스 타입 같아야한다.
        // 그리고 아래에서하겠지만 참조변수를 통해서만 인스턴스에 접근할수있따.

        System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 참조변수.멤버변수(참조변수 t1으로 인스턴스의 멤버변수에접근)
        System.out.println("t2의 channel값은 " + t2.channel + "입니다."); // 그런데 인스턴스의 멤버변수들에초기화안했으니 기본값이 나오겠군

        t1.channel = 7;
        System.out.println("t1의 channel을" +t1.channel + "로 변경했습니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 참조변수.멤버변수(참조변수 t1으로 인스턴스의 멤버변수에접근)
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

    }
}
