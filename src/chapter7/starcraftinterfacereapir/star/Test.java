package chapter7.starcraftinterfacereapir.star;

interface Repairable{}
abstract class Units{
    final int MAX_HP;
    abstract void move();
    Units(int hp){
        MAX_HP = hp;
    }
}
class GroundUnits extends Units{
    GroundUnits(int hp){
        super(hp);
    }
    
    void move(){
        System.out.println("땅에서 움직이는중");
    }
}
class AirUnits extends Units{
    AirUnits(int hp){
        super(hp);
    }
    void move(){
        System.out.println("하늘에서 움직이는중");
    }
}

class Tank extends GroundUnits implements Repairable{
    Tank(){
        super(150);
    }

    @Override
    public String toString() {
        return "Tank";
    }
}

class DropShip extends AirUnits implements Repairable{
    DropShip(){
        super(120);
    }

    @Override
    public String toString() {
        return "DropShip";
    }
}

class Marine extends GroundUnits{
    Marine(){
        super(50);
    }

    @Override
    public String toString() {
        return "Marine";
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
    
    void repair(Units u){
        if(u instanceof Repairable)
            System.out.println(u+"수리 완료");
        else{
            System.out.println(u+"은 수리가 안되네요. 메딕한테 부탁하세요.");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // 다형성의 두번쨰장점. 하나의 배열로 여러종류의 객체를 다룰수있다는것. 부모타입의 참조변수로 자식타입의 인스턴스접근이 가능하다.
        Units[] units = new Units[]{new Tank(), new DropShip(), new Marine(), new SCV()};
        SCV scv = new SCV();

        for (Units unit : units) {
            scv.repair(unit);
        }
    }
}
