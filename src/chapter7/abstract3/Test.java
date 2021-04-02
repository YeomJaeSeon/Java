package chapter7.abstract3;


// 공통의 부모클래스에서 공통부분을 끄러낼슀음
abstract class Units{
    int x, y;
    // 특히 자식에서 다다르게 동작해야하는 메서드는 abstract로 메서드로 구현해놓을수있음 -> 이러면 자식 클래스는 무조건 해당 추상메서드를
    // 구현해야한다.
    abstract void move();
    void stop(){
        System.out.println("유닛 멈춤");
    }
}

class Marine extends Units{
    void move(){
        System.out.println("마린 움직임");
    }
    void stimPack(){
        System.out.println("마린 스팀팩");
    }
}
class Tank extends Units{
    void move(){
        System.out.println("탱크 움직임");
    }
    void changeMode(){
        System.out.println("탱크 시즈모드");
    }
}
class Dropship extends Units{

    void move(){
        System.out.println("드랍쉽 움직임");
    }
    void load(){
        System.out.println("유닛 실어");
    }
    void unload(){
        System.out.println("유닛 내려");
    }
}
public class Test {
    public static void main(String[] args) {
//        //ㄷ형성 두번째 장점
//        Units[] units = new Units[3];
//        units[0] = new Marine();
//        units[1] = new Tank();
//        units[2] = new Dropship();
//
//        for (Units unit : units) {
//            unit.move();
//        }

        Object[] units2 = new Units[3];
        //다형성 최고 부모인 Object도 당연 가능
        units2[0] = new Marine();
        units2[1] = new Tank();
        units2[2] = new Dropship();

        for (Object unit : units2) {
//            unit.move();
            //Object 리모컨엔 move가없음
            Units uni = (Units) unit;
            uni.move();
        }
    }
}
