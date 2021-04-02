package chapter7.interfacegood;

class A{
    // 해당인터페이스가 구현하는 클래스 객체가 매개변수로드러갈것.
    void methodA(I i){
        i.methodB();
    }
}

interface I{
    void methodB(); // public abstract가 생략
}
class B implements I{
    public void methodB(){
        System.out.println("method B");
    }
}
class C implements I{
    public void methodB(){
        System.out.println("method C");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new C());
    }
}
//인터페이스 장점은 이것