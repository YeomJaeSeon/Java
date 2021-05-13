package chapter14.lambdastart;

@FunctionalInterface //함수형인터페이스는 람다식을 위해존재.
interface MyFF{
    void run(); //함수형인터페이스로 추상메서드 하나만존재
}

public class Ex14_2 {
    static void execute(MyFF f){ // 매개변수로 함수형인터페이스 타입을 받는다. - 매개변수로 람다식을받음
        f.run();
    }
    static MyFF getMyFF(){ // 반환타입으로 함수형인터페이스를 준다. - 람다식을 리턴함.
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        MyFF f1 = new MyFF() { // 익명클래스 객체생성 (클래스선언과 객체 생성 동시에)
            @Override
            public void run() {
                System.out.println("f1.run()");
            }
        };
        MyFF f2 = () -> System.out.println("f2.run()"); // 람다식의 참조변수 탕비은 함수형인터페이스타입

        MyFF f3 = getMyFF();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}
