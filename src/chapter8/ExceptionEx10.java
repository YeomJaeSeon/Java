package chapter8;

public class ExceptionEx10 {
    public static void main(String[] args) {
        try{
            throw new Exception(); // 예외처리 안하면 컴파일에러남.
            // 사용자에의해서발샐할수있는 예외이므로 컴파일조차안됨(예외처리안해서) 즉, 예외처리를 강제화한다.
            // 그러나 프로그래머에의해서 발생할수있는 예외인 RunTimeException같은 unchecked예외의경우는 예외처리를 강제화하지않는다.
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 잘종료됨!");
    }
}
