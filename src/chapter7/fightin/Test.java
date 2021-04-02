package chapter7.fightin;

abstract class Units{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다.");
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
    // Fightable인터페이스 구현한 클래스의 인스턴스를 매개변수로받는다.
    public void attack(Fightable f){
        System.out.println(f+"를 공격");
    }

    // Fightable인터페이스 구현한객체 리턴
    Fightable getFighter(){
        return new Fighter();
    }
}

public class Test {
    public static void main(String[] args) {
//        Fighter f = new Fighter();
//        f.move(100, 200);
//        f.attack(new Fighter());
//        f.stop();

        Fightable f = new Fighter(); //인터페이스 다형성
        f.attack(new Fighter());
        f.move(200, 100);
//        f.stop() 인터페이스의 리모컨에는 없음
        
        Units u = new Fighter(); //다형성
        u.move(100, 200);
//        u.attack(new Fighter()); Units 리모컨에는 attack멤버가없으
        u.stop();

        Fighter f3 = new Fighter();
        Fightable newFighter = f3.getFighter();
        f3.attack(newFighter);
    }
}
