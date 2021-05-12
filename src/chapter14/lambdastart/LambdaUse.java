package chapter14.lambdastart;

public class LambdaUse {
    public static void main(String[] args) {
        MyFunction f = new MyFunction() { // 익명클래스 선언동시에 객체생성
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        System.out.println(f.max(5, 3));

        // 람다식을 다루기 위한 참조변수타입은 함수형 인터페이스 타입으로한다.
        // 람다식(익명객체)
        MyFunction f2 = (a, b) -> a > b ? a: b;

        System.out.println(f2.max(10, 30));
    }
}

@FunctionalInterface // 함수형 인터페이스는 단하나의 추상메서드만 가지고있어야함. - 이 표준 애너테이션이 컴파일시 체크해줌
interface MyFunction{
    int max(int a, int b);
//    public abstract int max2(int a, int b);
}
