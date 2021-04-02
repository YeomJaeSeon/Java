package chapter7.in.a;
// 인터페이스의 장점! 선언 구현 분리 -> 변경에 유리, 유연한 코드 설계각 가능
class A{
    // A가 B를 의존하고있음 직접적인관계임
    // 인터페이스를 이용하면 A클래스는 인터페이스(껍데기)만 직접사용
    // A와 B는 관계가 없음 느슨한 관계형성
    void method(I i){
        i.method();
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

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        a.method(new C());
    }
}
