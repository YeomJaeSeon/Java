package second.chapter6.interface2;
// 이클래스는 인터페이스만 의존하면됨 다른 구현체는 몰라도됨.(추상화에만 의존 구체화에는 의존 X) - DIP를 지킨것.. 이 클래스는
// 구현체가 바뀌어도 나는 몰라.. 그냥 인터페이스(선언, 껍데기)만 의존함.
class Use{
    void method(Material material){
        material.method();
    }
}

// 인터페이스를통해서  ------------------------- 선언과
interface Material{
    void method();
}

// ----------------------------------------- 구현을분리
class A implements Material{
    @Override
    public void method() {
        System.out.println("A.method");
    }
}

class B implements Material{
    @Override
    public void method() {
        System.out.println("B.method");
    }
}

class C implements Material{

    @Override
    public void method() {
        System.out.println("C.method");
    }
}

public class Test {
    public static void main(String[] args) {
        Use use = new Use();
        use.method(new A());
        use.method(new B());
        use.method(new C());
    }
}
