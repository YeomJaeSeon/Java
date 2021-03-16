package chapter6;

class Tv3{
    // 클래스 속성인 멤버변수
    String color;
    boolean power;
    int channel;
    
    //클래스 기능인 메서드
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

public class TvTest3 {
    public static void main(String[] args) {
        Tv3 t1 = new Tv3(); // 참조변수 ref 변수 t1에 인스턴스의 주소를담음
        Tv3 t2 = new Tv3(); // 참조변수, ref변수 t2의 인스턴스 주소를담음

        System.out.printf("t1 채널 : %d%n", t1.channel);
        System.out.printf("t2 채널 : %d%n", t2.channel);

        t2 = t1; // 주소가 같아짐. t2 참조변수도 t1이 가르키던 인스턴스를 가르키게됨. 주소가같게됨.
        t1.channel = 7;

        System.out.printf("t1 채널 : %d%n", t1.channel);
        System.out.printf("t2 채널 : %d%n", t2.channel);

        // ref타입 변수 t1과t2가 동일하게 t1이 가르키던 인스턴스를 가르키고있으므로 t1.channel이 변경되면 당연히 t2.chanel도변경되는것이다.
    }
}
