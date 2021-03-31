package chapter7.bindingtest4;

class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    int x = 200;

    @Override
    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child(); // 다형성 부모타입의 참조변수고 자식 타입의 인스터느 참조가능
        Child c = new Child();

        System.out.println("p.x = " + p.x); // 100
        p.method();
        // 200
        // 100
        // 200

        System.out.println("c.x = " + c.x); // 200
        c.method();
        // 200
        // 100
        //200
    }
}
