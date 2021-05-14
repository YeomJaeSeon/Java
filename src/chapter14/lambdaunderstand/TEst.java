package chapter14.lambdaunderstand;

@FunctionalInterface
interface MyFunctionInterface{
    void displayAll();
}



public class TEst {
    public static void main(String[] args) {
        MyFunctionInterface f = () -> System.out.println("hello"); // 람다식은 객체, 참조타이은 함수형 인터페이스.!
        f.displayAll();
        func().displayAll(); // func()이 리턴하는 객체(람다식)의 멤버를 호출하는것
        func2(() -> System.out.println("나는 매개변수로 람다식을 전달하쥐~"));

        //Runnable
        Runnable r = () -> System.out.println("ㅋ"); // Runnable 함수형 인터페이스이므로 람다식 참조가능(람다식 객체)
        r.run();

    }
    public static MyFunctionInterface func(){
        return () -> System.out.println("나는 리턴타입으로 람다식을 리턴한다.!!");
    }
    static void func2(MyFunctionInterface f){
        f.displayAll();
    }
}
// 이렇게 람다식을 이용하면 리턴타입으로, 매개변수로 메서드를 전달하는것 같으나 사실 메서드가아니라 객체를 리턴하는 것이다.
// 사용될떄 인터페이스 다형성이 사용되는것이고..!
