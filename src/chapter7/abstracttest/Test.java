package chapter7.abstracttest;

// 부모클래스로갈수록 추상휘 자식클래스로갈수록 구체화. 추상화란 공통저긴 부분을 의미함.
// abstract클래스란 abstract메서드가 있는 클래스를 의미하는데 왜 abstract메서드가필요할까?
// 공통적인 부분을 묶는데 추상메서드가필요ㅏㅎ다. apple mac컴퓨터도 종류가 엄청많은데 그중 70%는 공통적인 부분이있을것이다.cpu라던지 화면, 키보드 등등..
// 이러한부분을 묶을수있다abstract로.
abstract class Units{
    int x, y;
    abstract void move(int x, int y); // 추상메서드 - 선언부만있음 이러면 Units클래스 상속받는 클래스는 무조건 이 메서드 구체화해야함 그렇지않으면 해당
    //클래스도 추상크래스임
    void stop(){} // 구현된완전하 메서드
}
// 내 테란 유닛들의 공통적인 부분을 이런식으로 빼낼수있따.
class Marine extends Units{
    @Override
    void move(int x, int y) {
        System.out.println("마린 움직여");
    }
    void stimPack(){
        System.out.println("스팀팩~");
    }
}
class DropShip extends Units{
    @Override
    void move(int x, int y) {
        System.out.println("드랍쉽 움직여 ");
    }
    void load(){}
    void unload(){}
}

class Tank extends Units{
    @Override
    void move(int x, int y) {
        System.out.println("탱크 움직여");
    }
    void sizeMode(){}
}

public class Test {
    public static void main(String[] args) {
        Units[] units = new Units[10]; // 10개의 유닛을 가질수있는 객체배열- 다형성이용
        units[0] = new Marine();
        units[1] = new Marine();
        units[2] = new DropShip();
        units[3] = new Tank();
        units[4] = new Tank();
        units[5] = new DropShip();
        //내 분대는 두개의 드랍쉽가 두개의탱크 두개의마린 모두 수송하려면 두개의 드랍쉽이필요

        //내분대는 두마리의 마린과 하나의 드랍쉽 이걸로 저그 드랍가자
        for(Units unit : units){
            if(unit == null) break;
            unit.move(100, 200); //저그 해처리 위치
        }
    }
}
