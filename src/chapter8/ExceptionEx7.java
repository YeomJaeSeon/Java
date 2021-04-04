package chapter8;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            // 예외가 발생하면 발생한 예외클래스의 인스턴스가 생성이됨.
            System.out.println(4);
            // 생성된 예외클래스의 인스턴스와 catch문에 정의된 참조변수 instanceof하면서 boolean 리턴.true면 해당 catch문실행
            // true인 catch문 즉, 발생한 예외에 맞는 catch문의 참조변수가 없으면 catch문실행 x -> 예외처리도안됨.
        }catch (ArithmeticException ad){
            if(ad instanceof ArithmeticException){
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
