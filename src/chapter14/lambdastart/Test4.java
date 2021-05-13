package chapter14.lambdastart;

public class Test4 {
    public static void main(String[] args) {
        //인터페이ㅡㅅ 다형성 해당인터페이스 구현한 클래스의 인스턴스가와야함. - 익명클래스의 인스턴스가왔다.(꾸현함)
        MyZZ originM = new MyZZ(){ // 익명클래스
            public int min(int a, int b){
                return a > b ? b : a;
            }
        }; // 이 익명 객체와 람다식은 같다. - 익명 객체와 람다식은 같다. same하다.

        MyZZ m = (a, b) -> a > b ? b : a;
        System.out.println("최소값 : " + m.min(5, 3));

        MyTall t = () -> System.out.println("나는 키가 183입니다.");
        t.printAll();

        ParamLambda paramLambda = (int param) -> System.out.println("파람 : " + param);
        paramLambda.printParam(26);

        YourAge age = () -> 26;
        System.out.println("너의 나이 : " + age.yourAge());
    }
}
@FunctionalInterface
interface MyZZ{
    int min(int a, int b);
}
@FunctionalInterface
interface MyTall{
    void printAll();
}

//람다식을 매개변수값으로 받을수있음
@FunctionalInterface
interface ParamLambda{
    void printParam(int param);
}


// 람다식을 반환값으로
@FunctionalInterface
interface YourAge{
    int yourAge();
}
// JS처럼 함수형프로그래밍이 람다를 통해서 가능하네.. JAVA도