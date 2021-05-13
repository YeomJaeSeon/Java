package chapter14.lambdastart;

public class Test2 {
    public static void main(String[] args) {
        // 람다식과 위 익명 클래스의 객체가 아애 같다.
        // 람다식은 '객체'이다.
        // 람다식은 '객체'이다. - 참조변수필요.
        // 참조변수 탕빙느? 익명클래스의 객체인데 Object로할까? - 리모컨에 버튼이없음 사용할..
        // 그래서 해당 타입정의하기위해서 함수형인터페이스를정의 - 추상메서드하나인 인터페이스
        // 타입을 해당 인터페이스로하여 원하는 멤버에접근

        CalculateMax calculateMax2 = new CalculateMax(){
            public int max(int a, int b){
                return a > b ? a: b;
            }
        };

        System.out.println(calculateMax2.max(5, 3));
//        calculateMax2.max(5, 3);

        CalculateMax calculateMax = (a, b) -> a > b ? a : b;
        System.out.println(calculateMax.max(50, 30)); // 람다식은 익명객체체


       // 이 익명 객체 대신
//        CalculateMax calculateMax = (a, b) -> a > b ? a: b; // 람다식으로 함수형인터페이스 메서드 생성
        // 람다식은 메서드, 함수간단하게 표현하도록 도와줌 ->

//        System.out.println(calculateMax.max(10, 30));
    }
}

@FunctionalInterface
interface CalculateMax{
    int max(int a, int b);
}
