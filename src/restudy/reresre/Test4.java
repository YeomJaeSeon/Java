package restudy.reresre;

class A{
    // 인터페이스 다형성(인터페이스도 일종의 부모) - 이인터페이스 구현한 클래스의 객체가 파라미터로 들어와라.
    void method(I i){
        i.method(); // 인터페이스의 추상메서드 호출할수있음. 추상메서드는 선언부는 존재하기때무닝ㅁ.
    }
}

interface I{
    void method();
}

class B implements I{
    public void method(){
        System.out.println("method B");
    }
}

class C implements I{
    public void method(){
        System.out.println("method C");
    }
}

class D implements I{

    @Override
    public void method() {
        System.out.println("method D");
    }
}

public class Test4 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        a.method(new C());
        a.method(new D());
        // 구현체가 다 달라도 A클래스는 Interface를 의존하고있으므로 공통의 로직으로 처리할수있따.\
        // 인터페이스를 통해서 선언, 구현 (껍데기 알맹이)로 분리할수있고 하나의 인터페이스에서 여러개의 구현체를 구현하면
        // 해당 구현체들을 사용하는, 의존하는 클래스는 인터페이스만 의존하면 어떠한 형태의 구현체에 대해서도
        // 공통의 로직으로 처리할수있다.
    }
}
