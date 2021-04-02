package chapter7.interfacegood.notuseinterface;

class A{
    void methodA(B b){
        b.methodB();
    }
}
class B{
    void methodB(){
        System.out.println("method B");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
