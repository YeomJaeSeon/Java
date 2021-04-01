package chapter7.fightable;

class Parent{

}

class Child extends Parent{

}

abstract class Unit{
    int x, y;// 인터페이스와의 차이점
    
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춤");
    }
}

interface Fightable{
    void move(int x, int y);
    void attack(Fightable f);
}

// 이렇게 인터페이스를 이용해서 다중상속같이 할수있는데
// 왜냐면 충돌이 일어나지않잖아. 다중상속이안되는이유는
// 충돌떄문인데 구현체가없는 추상메서드들은 충돌이안일어남.
class Fighter extends Unit implements Fightable{

    @Override
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y +"] 로 이동");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }

    Fightable getFighter(){
        Fighter f = new Fighter();
        System.out.println("싸울 상대 : " + f);
        return f;
    }
}

public class Test {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fighter f2 = new Fighter();

        Fightable f3 = new Fighter();

        f.move(10, 20);
        f.attack(f2);

        f3.attack(f);
        f3.move(10, 20);

        f.getFighter();

        Parent p = new Child();
        Child c= new Child();
        sayHello(c);

    }
    static void sayHello(Parent p){

    }
}
