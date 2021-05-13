package chapter14.lambdabasic;
// 익명 객체 = 람다식 -> 참조변수 타입 : 함수형인터페이스타입
public class Lambda {
    public static void main(String[] args) {
        //원래는 익명클래스의 객체로 해야함.- 자바는 메서드혼자 독립적으로 있을수없음 클래스내에 존재해야함
        Object obj = new Object() {
            void printThis(String s) {
                System.out.println(s);
            }
        };
        // obj.printThis("안녕"); // Object참조변수에는 printThis라는 멤버가없으므로 객체의 멤버가 존재해도 해당 멤버에 접근할수 있는 방법이 없다.
        // 그래서. 함수형인터페이스를 이용해서 리모컨을만들어주자
        A a = new A(){
            public void printThis(String s){
                System.out.println(s);
            }
        };
        a.printThis("안녕");

        // 이 익명클래스의 객체가 람다식이다. 람다식은 익명함수가아닌. '객체'이다. 함수나 메서드를 쉽게 표현하게 도와주는게 람다실으로
        // 알고있지만 아니다.
        A a_lambda = (String s) -> System.out.println(s);
        a_lambda.printThis("안녕 난 람다식이야.");

        B b = (age) -> System.out.println("당신의 나이 : " + age);
        b.inputAge(26);


        aMethod((String s) -> System.out.println(s));

        bMethod().printThis("끝");

    }
    static void aMethod(A a){
        a.printThis("ㅎㅎ");
    }
    static A bMethod(){
        return (String s) -> System.out.println(s);
    }
}
@FunctionalInterface // 함수형인터페이스는 람다식을 위한것. 람다식을 참조하는 참조변수 타입(추상메서드 하나 제한) - 표준에너테이션으로 컴파일 체크가능
interface A{
    void printThis(String s);
}

@FunctionalInterface
interface B{
    void inputAge(int age);
}

@FunctionalInterface
interface C{
    C getYourAge();
}