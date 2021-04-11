package chapter8.test;

public class TEst {
    public static void main(String[] args) throws Exception {
        method1(); // JVM try -catch한테 예외 떠넘김
        System.out.println("종료");
    }
    static void method1() throws Exception{
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}

