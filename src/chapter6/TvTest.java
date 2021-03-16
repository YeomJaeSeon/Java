package chapter6;

class Tv{
    // Tv의 멤버변수(속성)
    String color;
    boolean power;
    int channel;

    //Tv의 메서드(기능)
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

public class TvTest {
    public static void main(String[] args) {
        Tv t; // ref변수 t (참조변수임) - 이는 Tv클래스의 Tv인스턴스의 주소를 갖게될것이다.
        t = new Tv(); // Tv 인스턴스 생성 - new 키워드로, Tv인스턴스를 실제로 생성하고 해당 인스턴스의 주소를 참조변수(ref type)t에 넣는과정\
        // Primitive type이외는 전부 ref타입이지!? 그러므로 t조 타입이 클래스인 reftype이고 이는 주소를 갖게된다. Tv인스턴스의 주소를 t가 갖게된다.
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 "+ t.channel + "입니다.");
    }
}
