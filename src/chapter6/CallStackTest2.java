package chapter6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main메소드 시작");
        firstMethod();
        System.out.println("main메소드 끝");
    }
    static void firstMethod(){
        System.out.println("first메소드 시작");
        secondMethod();
        System.out.println("first메소드 시작");

    }
    static void secondMethod(){
        System.out.println("secont메소드 시작");
        System.out.println("secont메소드 시작");

    }
}
