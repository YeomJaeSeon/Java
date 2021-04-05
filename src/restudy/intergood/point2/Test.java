package restudy.intergood.point2;


//인터페이스장점 ! 변경에유리한 유연한코드
// 인터페이스를통해서 선언부 구현부 분할 ! 껍데기알맹이분할

class A{
    // I인터페이스 구현한 객체만 넣어라. 넘들만와라.
    public void method(I i){
        i.method();
    }
}

interface I{
    public void method();
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
        a.method(new C());
    }
}
