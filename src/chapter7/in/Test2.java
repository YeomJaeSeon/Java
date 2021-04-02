package chapter7.in;

// 인터페이스는 두 대상간의 소통 연결하는 중간역할
// 인터페이스를 껍데기로하여 선언, 구현 = 껍데기, 알맹이로 분리해보자.

// A와 B간의 직접적ㅇ니 관게가 사라짐 ㅇ니터페이스를 매개ㅔ촐 느슨한관계형성
// A는 인터페이스와하고만 직접적인관계를 갖음 A B는 간접관계임
class A1{
    void method(I i){
        i.method();
    }
}

interface I{
    void method();
}
class B1 implements I{
    public void method(){
        System.out.println("method B");
    }
}

// 이렇게 새로운 클래스로 변경해도
// 알맹이만 구현되어있는 알맹이만 변경하면 되므로 변겨엥너무유리함.즉 유연한 설계가가능
class C1 implements I{
    public void method(){
        System.out.println("method C");
    }
}

public class Test2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.method(new B1());
        a.method(new C1());
    }
}

// 인터페이스 선언- 구현분리 -> 변경에유리한 유연한설계가가능

