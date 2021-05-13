package chapter14.lambdabasic;

//람다식 을 반환하는 함수, 람다식을 매개변수로 받는 함수 - 함수를 매개변수로, 리턴으로.. first class Function - JS 함수와 같네
//함수형 프로그래밍이 자바도 람다식으로 가능해졌다. 다만 여기 람다식은 익명 객체이다.

@FunctionalInterface
interface MyFunction{
    void run();
}

public class Ex14_1 {
    static void execute(MyFunction f){
        f.run();
    }
    static MyFunction getMyFunction(){
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1 run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}
