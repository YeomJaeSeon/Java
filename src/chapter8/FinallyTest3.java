package chapter8;

public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println(3);
    }
    static void method1(){
        try{
            System.out.println(1);
            return; // return; 으로 early exit해도 finally문은 실행된다.

        }catch (Exception e){

        }finally {
            System.out.println(2);
        }
    }
}
