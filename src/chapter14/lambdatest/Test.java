package chapter14.lambdatest;

@FunctionalInterface
interface MyFunction{
    int max(int a, int b);
}

public class Test {
    public static void main(String[] args) {
        Object object = new Object(){
            int max(int a, int b){
                return a > b ? a : b;
            }
        };
//        System.out.println(object.max(1, 3));
//        Object objLambda = (a, b) -> a > b ? a: b;
        MyFunction f = (a, b) -> a > b ? a: b;
        System.out.println(f.max(3, 5));
        // 람다식은 익명 객체이므로 참조변수로 참조해야함 참조변수 타입은 함수형 인터페이스(추상메서드 하나.(

        int max = func1().max(3, 5);
        System.out.println("max : " + max);

        func2((a, b) -> a > b ? a : b); // 매개변수 param으로 함수가 전달되는것같다. 람다식 그러나 실제론 매개변수로 익명객체가 전달되는것이고 그객체는
        // 메서드에서 인터페이스로받는다. (함수형 인터페이스)

    }
    static MyFunction func1(){ // 그리고 리턴하는 람다식(익명객체)는 인터페이스 다형성을이용한다, 해당 인터페이스를 구현한 클래스의 객체를 반환 - 인터페이스다형성
        return (a, b) -> a > b ? a : b; // 메서드의 리턴타입이 함수인것같다. 그러나 사실 람다식은 익명객체이므로 객체를 리턴하는것
    }
    static void func2(MyFunction f){
        int max = f.max(3, 5);
        System.out.println("max : " + max);
    }
}
