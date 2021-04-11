package chapter8.rethrowexception;

// 예외 되던지기
public class ReThrowExceptionTest {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }
    static void method1() throws Exception{
        try{
            throw new Exception(); // 예외발생
        }catch (Exception e){
            System.out.println("method1에서 예외 처리되었어요");
            throw e; // 예외가 처리되는 catch문에서 다시 예외를 발생시킨다. 띠용.? 그러면 이 메서드를 호출한곳ㅇ세ㅓ 예외를 처리햐엓다.
            //물론 이메서드는 throws로 예외던지기 준비해야함
        }
    }
}
// 예외가 method1에서 두번발생됨. -> 한번은 method1에서 예외처리 또한번은 해당 메서드 호출한 메인메서드에서 예외처리 총두번의 예외처리.

