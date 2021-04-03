package chapter7.practice;

abstract class Unit{
    int x, y;
    abstract void move(int  x, int y);
    void stop(){
        System.out.println("stop");
    }
}
class Marine extends Unit{
    void move(int x, int y){
        System.out.println(x +", " + y +"로 마린이동");
    }
    void stimPack(){
        System.out.println("스팀팩");
    }
}
class Tank extends Unit{
    void move(int x, int y){
        System.out.println(x +", " + y +"로 탱크이동");
    }
    void changeMode(){
        System.out.println("시즈모드");
    }
}
class DropShip extends Unit{
    void move(int x, int y){
        System.out.println(x +", " + y +"로 드랍쉽이동");
    }
    void load(){
        System.out.println("유닛 실어");
    }
    void unload(){
        System.out.println("유닛 드랍");
    }
}

public class Practice17 {
    public static void main(String[] args) {
        Unit[] units = {new Marine(), new Marine(), new Tank(), new DropShip()};

        for (Unit unit : units) {
            unit.move(100, 200);
        }
    }

}
