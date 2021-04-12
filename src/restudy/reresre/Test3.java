package restudy.reresre;

abstract class Unit{
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춤");
    }
}

interface Fightable{
    void attack(Fightable f);
    Fightable findEnemy();
}

class Fighter extends Unit implements Fightable{
    void move(int x, int y){
        System.out.println("["+x+","+y+"]로 이동");
    }
    public void attack(Fightable f){
        System.out.println(f + "를 공격");
    }
    public Fightable findEnemy(){
        return new Fighter();
    }

}

public class Test3 {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.attack(f.findEnemy());


    }
}
