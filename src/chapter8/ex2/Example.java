package chapter8.ex2;

public class Example {
    public static void main(String[] args) {
        // Exception 예외같으 ㄴ경우는 두가지임 사용자에의한 예외, 프로그래머에의한 예외
        // 전자는 예외처리안하면 컴파일에러남. - 예외처리를 강제화함
        // 후자는 예외처리안해도 컴파일에러안남 - 예외처리를 강제화함.
        //예외처리를 하면 프로그램의 비정상 종료를 막을수있음 - 정상종료되도록할수있음!
        // 일붤 예외발생시키는 건 throw문으로.. throw 참조변수..
        // 예외가발생하면 예외 인스턴스가 생성됨(해당 클래스의 인스턴스) -> catch문의 참조변수를 돌면서 instanceof연산자를 발생함
        // true인 catch블럭을 찾으면 그대로 catch블럭수행하고 try-catch문 나옴.
        try{
            throw new RuntimeException(); // throw new 로 예외 일부러 발생시키기.
        }catch(Exception e){
            System.out.println("에러");
        }

        try{
            throw new Exception("에러");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        // 예외처리강제화하게 컴파일에러가 나버림. 예외처리안했기때문임. 이런
        // 샤용자에의해 발생할수있는 예외는 예외처리를 강제화함. -> try -catch로 예외처리해야함
        System.out.println("예외처리 잘돼서 프로그램 정상적으로 종료됨");
    }
}
