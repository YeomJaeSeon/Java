package chapter9.math;

public class Ex2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println(i);
        System.out.println(+(-i));

        try{
            System.out.println(Math.negateExact(10));
            System.out.println(Math.negateExact(-10));
            System.out.println(Math.negateExact(i));
        }catch (ArithmeticException ae){
            System.out.println(Math.negateExact((long)i)); // overflow발생하면 이걸로 예외처리. 더 큰타입인 long으로 바꿔서
        }
    }
}
