package second.chapter6.abastract;

abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("stop");
    }
}

class Marine extends Unit{
    void stimPack(){
        System.out.println("스팀팩");
    }

    @Override
    void move(int x, int y) {
        System.out.printf("마린 [%d, %d] move\n", x, y);
    }

}

class Tank extends Unit{
    void chaneMode(){
        System.out.println("시즈모드 ");
    }

    @Override
    void move(int x, int y) {
        System.out.printf("tank [%d, %d] move\n", x, y);
    }
}
class DropShip extends Unit {
    void load(){
        System.out.println("태우기");
    }
    void unload(){
        System.out.println("내리기");
    }

    @Override
    void move(int x, int y) {
        System.out.printf("dropship [%d, %d] move\n", x, y);

    }
}

public class Test2 {
    public static void main(String[] args) {
        Unit[] units = new Unit[4];
        units[0] = new Marine();
        units[1] = new Marine();
        units[2] = new Tank();
        units[3] = new DropShip();

        for (Unit unit : units) {
            unit.move(100, 200);
        }
    }
}
