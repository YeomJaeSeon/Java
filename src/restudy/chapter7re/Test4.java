package restudy.chapter7re;

class A{
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

    @Override
    public void method() {
        System.out.println("method C");
    }
}

class D implements I{
    @Override
    public void method() {
        System.out.println("method D");
    }
}

//class C{
//    void method(){
//        System.out.println("method C");
//    }
//}

public class Test4 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.method(b);

        a.method(new C());


        a.method(new D());

    }

}
