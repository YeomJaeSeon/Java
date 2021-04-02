package chapter7.interfacegood.useinterface;

class A{
    // 인터페이스구현한 클래스객체가 매개변수들어갈것
    void methodA(I i){
        i.methodB();
    }
}

// 껍데기
interface I{
    void methodB();
}

//알맹이
class B implements I{
    public void methodB(){
        System.out.println("method B");
    }
    void printB(){
        System.out.println("print");
    }
}
//B클래스를 껍데기와 알맹이로 구분, 인터페이스와 해당인터페이스구현한 클래스로 구분
// 이렇게되면 A클래스는 Interface만 알면되기때문에 알맹이를 C로바꿔도 A클래스는 코드 바꿀필요가업음
// 이렇게 인터페이스를 이용하면 선언, 구현즉, 껍데기 알맹이로 구분하여 껍데기는 인터페이스 알맹이는 해당인터페이스구현클래스
// 알매이를 교체하는데 유리하다.


class C implements I{
    @Override
    public void methodB() {
        System.out.println("method C");
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new C());
    }
}
