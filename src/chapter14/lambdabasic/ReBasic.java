package chapter14.lambdabasic;

public class ReBasic {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b;
        Object obj = new Object(){
            int max(int a, int b){
                return a> b ? a : b;
            }
        };
//        System.out.println(obj.max(10, 3))); -- Object에는 max 리모컨이 없다.
        // 랃마식(익명객체) 사용하려면 참조변수탕비을 뭐로할까?

        MyFunc f = (a, b) -> a > b ? a: b; // 람다식 사용하려면 함수형 인터페이스 타입이필요하다.
        System.out.println(f.max(100, 300)); // -> 300

        MyFunc2 f2 = () -> System.out.println("ㅋㅋ"); // 람다식 접근하는 참조변수 f2!
        //
        f2.printThis();

        getMax((a, b) -> a > b ? a : b);

        System.out.println(returnMax().max(10, 30));

    }
    static void getMax(MyFunc f){
        System.out.println(f.max(30, 50));
    }
    static MyFunc returnMax(){
        return (a, b) -> a> b ? a: b;
    }
}

@FunctionalInterface
interface MyFunc2{
    void printThis();
}

@FunctionalInterface
interface MyFunc{
    int max(int a, int b);
}
/**
 * 람다식 - 메서드(함수) 간단하게 식 하나로 표현가능..!
 * 원래 자바에서 메서드란 클래스안에 존재해야하고 그러려면 클래스 생성 -> 객체생성-> 참조변수생성 -> 참조변수로 메서드 접근... 귗낳아.
 * 이걸 생략해도되게해주는게 람다식이다.
 * 반환타입, 함수이름 생략한다. - 익명함수라고함. 사실함수는아님
 * 자바에서 함수는 클래스내에존재해야하므로 메서드를 만드려면 클래스와 개게를 생성해야함.
 * 그래서 람다식은 익명 객체이다.(익명 클래스를 통해 만들어진 객체)
 * 자자 해보자
 * 람다식은 익명 객체임을 잊지말자. 람다식은 객체! - 참조변수가 필요 참조변수타입은 함수형인터페이스! 함수형인터페이스는 추상메서드 한개!.. 이러한 매커니즘)
 */
