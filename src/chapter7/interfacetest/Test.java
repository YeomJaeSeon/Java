package chapter7.interfacetest;

class Unit{
    int currentHp;
    int x;
    int y;
}
interface Movable{
    void move(); // 추상메서드이다.보면 구현부분이 구현되어있지않다. 제어자는 public static이 생략되어있고 컴파일러가 컴파일시 자동으로 붙여준다.
}
interface Attackable{
    void attack(); // 이렇게 인터페이스는 추상 메서드만 가지고있고 구현된 메서드는 가질수없다. (JDK 1.8 이하버전에선)
}
interface Fightable extends Movable, Attackable{} // 일엏게 인터페이스끼리의 상속은 다중상속이가능하다.
//이제 Fightable 인터페이스는 move()와 attack()메서드 사용가능.

class Fighter extends Unit implements Fightable{

    // 이 FIghter 클래스도 추상클래스로 만들고 싶지않으면 인터페이스의추사메서드를 구체화해줘야함.
    @Override
    public void move() {
        System.out.println("멈춰!!");
    }

    @Override
    public void attack() {
        System.out.println("공격!!!");
    }
}
public class Test {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        if(f instanceof Unit){
            System.out.println("f는 Unit의 자식클래스입니다.");
        }
        if(f instanceof Fightable){
            System.out.println("f는 Fightable을 구현(구체화)했습니다.");
        }
        if(f instanceof Movable){
            System.out.println("f는 Movable인터페이스를 구체화했습니다.");
        }
        if(f instanceof Attackable){
            System.out.println("f는 Attackable인터페이스를 구체화했습니다.");
        }
        if(f instanceof Object){
            System.out.println("f는 Object 자식클리스입낟.");
        }
    }
}
