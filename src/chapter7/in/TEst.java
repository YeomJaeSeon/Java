package chapter7.in;

// 직접적인 관계에있음
class A{
    void method(B b){
        b.methodB();
    }
}
class B{
    void methodB(){
        System.out.println("B method");
    }
}

public class TEst {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
    }
}
