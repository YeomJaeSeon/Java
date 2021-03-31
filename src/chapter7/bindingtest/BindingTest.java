package chapter7.bindingtest;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child(); // 다형성, 부모타입의 참조변수로 자식타입의 인스턴스 참조가능
        Child c = new Child();

        System.out.println(p.x);
        p.method();

        System.out.println(c.x);
        c.method();
    }
}

class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    int x = 200;

    void method(){
        System.out.println("Child Method");
    }
}
