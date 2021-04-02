package chapter7.starcraftinterfacereapir;


// 상속관계도에서서로 관계없는 드랍쉽 탱크, SCV를 하나의 인터페이스 묶어서 관계를제공함.

interface Repairable{}

class Units{
    int hitPoint;
    final int MAX_HP;
    Units(int hp){
        this.MAX_HP = hp;
    }
}

class GroundUnits extends Units{
    GroundUnits(int hp){
        super(hp);
    }
}
class AirUnits extends Units{
    AirUnits(int hp){
        super(hp);
    }
}

class Tank extends GroundUnits implements Repairable{
    Tank(){
        super(150);
    }

    @Override
    public String toString() {
        return "TANK";
    }
}

class DropShip extends AirUnits implements Repairable{
    DropShip(){
        super(120);
    }

    @Override
    public String toString() {
        return "DROPSHIP";
    }
}
class Marine extends GroundUnits{
    Marine(){
        super(50);
    }

    @Override
    public String toString() {
        return "MARINE";
    }
}
class SCV extends GroundUnits implements Repairable{
    SCV(){
        super(30);
    }

    @Override
    public String toString() {
        return "SCV";
    }
    // 인터페이스 매개변수 - Repairable인터페이스 구현한 넘듦나들어와.
    void repair(Repairable r){
        if(r instanceof Units){
            Units u = (Units) r;
            System.out.println(u+"의 수리 끝");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropShip);

        scv.repair(new SCV());
//        scv.repair(marine); 마리능ㄴ Repairable 이넡페이스 구현 X
    }
}
