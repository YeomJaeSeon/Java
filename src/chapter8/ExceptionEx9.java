package chapter8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("일부러 발생시킨 예외"); // 생성자에 String을넣어주면 에러 메시지 가된다.
            throw e;

        }catch (ArithmeticException ae){

        } catch (Exception e){
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("에외처리를 잘해서 프로그램이 정상종료되었습니다.");
    }
}
