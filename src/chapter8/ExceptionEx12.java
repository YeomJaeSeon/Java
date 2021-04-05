package chapter8;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        try{
            method1();
        }catch (Exception e){
            System.out.println("예외처리 완료");
        }
    }
    static void method1() throws Exception{
        method2();
    }
    // 메서드에 예외선언
    static void method2() throws Exception{
        throw new Exception();//예외발생
    }

    // 메서드에 예외선언해서 예외처리하는건 실제로예외를 처리하는게아니라. 자신을 호출한 메서드에게 예외를 전달한다. 폭탄돌리기..
    // 위코드에서 method2()메서드에서 Exception 에러발생한다.(checekd에러임.)
    // 그래서 try-catch라던가 실제적으로 예외를 처리하지않으면 프로그램 비정상적으로 종료된다. 그래서 제일마지막에 실행되는 메인메서드에서 예외를 전달받아서
    // try- catch로깔끔ㅎ게 예외처리한것이다.

    //그럼 왜 메서드에 예외선언해? 이 메서드느 ㄴ이러한 예외가 발생할수있따고 알려주는 아주 좋은기능을한다.
}
