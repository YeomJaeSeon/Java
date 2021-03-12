package chapter2;

public class Hello {
//    java.exe 자바 인터프리터에의해 항상 메인 메서드 호출되도록 약속됨.
    public static void main(String[] args){
        System.out.println("Hello, world. /*이것은 주석아님 */");
    }
}
//실행되는과정 Hello.java ->(javac.exe) -> Hello.class -> (java.exe) -> "Hello, world." 출력

/*
1. 자바소스코드는 모두 클래스안에, 클래스들이 모여서 자바어플리케이션을 구성한다.
2. 메인메서드는 자바어플 내에 최소한개는있어야함. (자바의 시작점), java.exe(자바인터프리터)에 의해 호출되도록 약속되어짐.
3. 소스파일의 이름,(Hello.java)과 public class이름(public class Hello)은 같아야함(대소문자구분함)
 */

//참고로 소스파일과달리 클래스파일은 클래스마마다 만들어짐
/*
//Hello.java
class Hello2 {}
class Hello3 {}
 */

//Hello.java가 javac.exe.에의해 클래스파일로 변경되면 Hello2.class, Hello3.class두개의 파일로 변경됨..

//마지막 추가로 하나의 소스파일안에 public 클래스 두개있으면안된다..