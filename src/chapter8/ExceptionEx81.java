package chapter8;

public class ExceptionEx81 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
//        System.out.println(0/0);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
            System.out.println("에러 원인 : " + e.getMessage());
        }
        System.out.println("프로그램 정상정료.");
    }
    // 이렇게 예외처리하면 try-catch로 (예외처리란 예외 대비해서 짠 코드) 프로그램의 비정상적인 종료를 막아 정상적으로 종료될수있게할수있따.
    // 위 예보면 try-catch밖에서 예외발생시키면 비정상적으로 종료하지만 try문내에서 예외발생하면 catch블럭으러가서 잘 예외처리되고 마지막구문도 잘실행된다.
    // 참고로 try문은 예외가밟생할 수있는 코드를 적는다.
}
