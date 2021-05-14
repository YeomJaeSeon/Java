package chapter14.lambdaunderstand;

// 람다식 테스트

/**
 * 1. 람다식은 익명 객체
 * 2. 람다식(객체)참조하는 참조변수 타입은 함수형인터페이스(추상메서드 한개)
 * 3. 람다식을 메서드의 매개변수, 메서드의 리턴타입에 줄수있음(메서드를 줄수있다 생각하지말고 객체를 인터페이스 다형성으로 주는것이다.)
 */
@FunctionalInterface
interface WhatsYourName{
    void displayYourName(String s);
}
public class Test2 {
    public static void main(String[] args) {
        //람다식 객체 생성
        WhatsYourName yourName = (s) -> System.out.println(s + "님 안녕하세요? 합격하셨습니다"); //람다식이용
        WhatsYourName yourName1 = new WhatsYourName() { // 익명클래스 이용
            @Override
            public void displayYourName(String s) {
                System.out.println(s  + "님 안녕하세요?불합격이십니다.");
            }
        };
        yourName.displayYourName("염재선");
        yourName1.displayYourName("김민재");

        func().displayYourName("염재선");
        func2((s) -> System.out.println(s + "님 안녕히가세요"), "박수영");
    }
    static WhatsYourName func(){
        return (s) -> System.out.println(s + "님 어서오세요");
    }
    static void func2(WhatsYourName yourName, String s){
        yourName.displayYourName(s);
    }
}
