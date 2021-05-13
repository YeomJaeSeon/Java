package chapter14.lambdastart;

public class Test3 {
    public static void main(String[] args) {
        MyFunc f = new MyFunc() { // 익명 클래스의 객체 생성 - 인터페이스 다형성 - 해당인터페이스 구현한 클래스의 인스턴스가 와라.
            @Override
            public int max(int a, int b) { // 오버라이딩 규칙 ( 접근제어 좁을수없다, 예외많을수 없다.)
                return a > b ? a : b;
            }
        };
        // 람다식 안쓰고 익명 클래스의 객체생성
        int value = f.max(3, 5);
        System.out.println(value);

        // 함수형 인터페이스의 메서드와 형태가 같아야한다. - 당연함
        MyFunc f2 = (a, b) -> a > b ? a : b; //익명 클래스의 객체대신 익명 객체인 람다식 사용
        // 람다식 참조변수 타입은 함수형인터페이스 - 람다식(익명 클래스의 객체)을 위한것.
        int value2 = f2.max(5, 3);
        System.out.println(value2);

    }
}

@FunctionalInterface // 컴파일러가 함수형인터페이스 잘 작성했나 확인해줌. - 틀리면 컴파일에러 - 좋은에러
interface MyFunc{
    int max(int a, int b); // public abstract 생략 - 예외없으므로 생략한것
    //추상메서드로 람다식 호출 (추상메서드 이름 :max - 람다식과 연결해주는 역할)
}
