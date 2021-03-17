package chapter6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }
    static void firstMethod(){
        secondMethod();

        return;
    }
    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
