package chapter7.defaultmethod;

// 인터페이스에서 사용하는 디폴트 메서드 - 인터페이스는 추상메서드집합인데 {}가있는 메서드가존재 그게 디폴트메서드
// 인터페이스를 변경해야할때 추상메서드를 추가하는게 원칙 그러나 해당 인터페이스구현한 클래스를 모두 변경해줘야함 - 귗낳
// 그래서 디폴트메서드를 인터페이스에 추가 (키ㅜ어드를 붙여야함 접근제어자 default와는 다른다.)
class Parent{
    public void method2(){
        System.out.println("method2() in Parent");
    }
}

interface MyInterface{
    // 디폴트 메서드 인터페이스안에{}인 메서드가있다
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MYInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}
class Child extends Parent implements MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method1() in Child");
    }
}
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
