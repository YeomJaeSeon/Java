package chapter7.fightin.ㅋ;

//인터페이스 다형성

abstract class Units{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춤");
    }
}
interface Fightable{
    void move(int x, int y);
    void attack(Fightable f);
}

class Fighter extends Units implements Fightable{
    public void move(int x, int y){
        System.out.println(x+","+y+"로 이동");
    }
    public void attack(Fightable f){
        System.out.println(f+"를 공격");
    }
    Fightable getFighter(){
        Fighter f = new Fighter();
        return f;
    }

}

public class Test {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Fightable f3 = (Fightable) fighter.getFighter();

//        Fighter f = new Fighter();
//        f.move(100, 200);
//        Fighter f2 = new Fighter();
//        f.attack(f2);
        Fightable f = new Fighter(); //다형성
        f.move(100, 200);
        f.attack(new Fighter());
        //f.stop(); //인터페이스 리모컨엇ㅂㅇ므

        Units u = new Fighter();//다형성
        u.move(200, 100);
        u.stop();
//        u.attack(new Fighter()); Units클래스엔 해당 리모컹넚음

    }
}
