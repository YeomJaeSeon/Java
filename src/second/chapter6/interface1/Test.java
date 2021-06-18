package second.chapter6.interface1;

interface A{
    public abstract void print();
}

interface B{
    void print2();
}

class NewA implements A, B{
    public void print(){
        System.out.println("ㅋ");
    }

    @Override
    public void print2() {

    }
}

//인터페이스구현이란 인터페이스의 추상메서드의 바디를 구현한다는 의미이당~
abstract class AbsClass implements A{
    //A인터페이스의 추상메서드 구현안하면 abstract붙어야함. - 미완성설계도임 객체생성못함. abstract 클래스 되기싫으면 인터페이스의 추상메서드 바디를 구현해야함
}
// 인터페이스는 클래스와 다르게 다중 구현이가능 -
// 인터페이스는 추상메서드의 집합으로 선언부만 존재하기에 가능함. 바디간의 충돌이없음.

interface Figteable{
    void attack(Figteable f);
}

class Fighter implements Figteable{
    String name;

    public Fighter(String name){
        this.name = name;
    }

    @Override
    public void attack(Figteable f) { // 이 매개벼수로는 해당인터페이스 구현한 클래스의 객체가와얗나다.
        //즉, 인터페이스 구현한녀석이와야함 ㅋㅋ
        System.out.println(f + " 공격!");
    }

    Figteable findFighter(){
        Fighter fighter = new Fighter("일본쪼무래기병사");
        return fighter; // Figteable f = fighter = new Fighter("~");
        // Figteable 구현한 클래스의 객체가 와라.. - 인터페이스 다형성
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        Fighter fighter = new Fighter("김두한");
        Fighter fighter1 = new Fighter("요시모토");
        fighter.attack(fighter1);
        Figteable fighter2 = fighter.findFighter();
        System.out.println("그다음 상대는 누구인가? " + fighter2);
    }
}
