package restudy.inter2;

//A클래스가 B클래스를 의존. 사용하고있따.
class A{
    // 인터페이스 구현한 클래스의 객체만와라.
    void method(I i){
        i.method();// 추상메서드는 호출가능 . 추상메서드는 {}만없고 선언부는 있으닌까.
    }
}

// 인터페이스느 추상메서드의 집합이므로 추상메서드가 정의되어있다.
interface I{
    void method();
}

// 인터페이스 구현한 구현체가 아무리많아도 인터페이스를 이용하면 일관된 코드를 작성할수있따는 장점이있다.
class B implements I{
    // 인터페이스 구현 -> 인터페이스의 추상메서드 구현부를 만든다는 뜻
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

public class InterfaceGoodThing {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        a.method(new C());
        a.method(new D());
    }
}
