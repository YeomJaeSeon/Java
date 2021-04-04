package chapter7.multi.interfgood;

// 인터페이스 - 변경에 유리한 유연한 코드 설게하는거보자
class A{
    // 인터페이스 구현한 넘들만 들어온다. 매개변수로,
    void method(I i){
        i.method();
    }
}

// 인터페이스를 통해서 선언 구현, 껍데기 알맹이 분리해서 두 클래스간의 의존관계 없애보자. 느슨하게 ㅎ만들어보자.

interface I{
    void method();
}
class B implements I{
    // 오버라이딩 규칙, 1 더좁은 제어자로 오버라이딩안됨.
    public void method(){
        System.out.println("method B");
    }
}

class C implements I{

    @Override
    public void method() {
        System.out.println("method C");
    }
}
public class TEst {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());

        a.method(new C());
    }
}
