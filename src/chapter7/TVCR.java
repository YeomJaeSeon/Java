package chapter7;

class Tv3{
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
class VCR{
    boolean power;
    int counter = 0;

    void power(){
        power = !power;
    }
    void play(){

    }
    void stop(){

    }
    void replay(){

    }
}
public class TVCR extends Tv3 {
    VCR vcr = new VCR(); // 자바는 다중상속이 안되므로 Tv3는 상속받고 VCR는 포함하여사용함.

    // vcr.power()를 사용하지않는다면 Tv3의 메서드인 power()과 겹치징낳는다.
    //다중상속은 이러한 단점이있지만 확장성이높은 장점이있다. 자바는 단일상속만 허용한다.
    // 자식클래스에서 인스턴스생서앟면 부모클래스의 멤버와 자식클래스 멤버 합친 인스턴스를 생성한다.
    void play(){
        vcr.play(); // 외부적으론 TVCR클래스의 메서드를 사용하는거 같지만 내부적으론 VCR메서드를 사용하는것임
    }
    void stop(){
        vcr.stop();
    }
    void replay(){
        vcr.replay();
    }
    public static void main(String[] args) {

    }
}
