package restudy.intergood;

interface Fightable{
    void attack(Fightable f);
}

// 인터페이스다형성 인터페이스도일종의 조상!이라새생각해도무방함.
class Fighter implements Fightable{
    // Fightable 인터페이스 구현한 클래스의 인스턴스를 매개변수로 줘라.
    public void attack(Fightable f){
        System.out.println(f + "공격");
    }
    // Fightable인터페이스 구현한 클래스의 인스턴스를 리턴해라
    Fightable getFighter(){
        return new Fighter();
    }
}

public class Test {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable newFighter = f.getFighter();

        f.attack(newFighter);
        f.attack(new Fighter());
    }
}
