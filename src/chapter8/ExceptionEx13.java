package chapter8;

// 메서드에 예외선언하기 : 이 메서드는 이러한 예외가 발생할수도있으니 이 메서드를 사용하는 쪽은 예외처리를할 준비를해라~
// 라고알려주는것이다. 메서드 선언부 throws Exception
public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }
    static void method1(){
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("method1에서 예외발생했는데 처리했어요");
            e.printStackTrace();
        }
    }
}
