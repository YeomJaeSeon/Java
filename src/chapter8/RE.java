package chapter8;

public class RE {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0); //예외가 발생하면 예외 인스턴스가생성되고
            System.out.println(4);
        }catch (ArithmeticException ae){ //catch문들을 찾으면서 하나씩 instanceof연산자로 true인 catch블럭을 찾는다. 찾았으므로
            System.out.println(5); // 실행한다. catch블럭한번 실행되면 try-catch문나간다.
        }catch (Exception e){ // 모든 예외의 부모인 Exception도 instanceof하면 true인데 catch하나만실행되므로 여기 메서드 수ㅐㅎㅇ안됨
            System.out.println(6);
        }
        System.out.println(7); // try-catch예외처리잘되면 나와서 나머지 실행도하고 프로그래미이 정상적으로종료한ㄷ.
    }
}
/*
예외처리 : 프로그램의 예외를 대비하여 ㅗㅋ드를짜는것
목적 : 프로그램의 비정상적인 종료를 막고 정상적으로 종료를 유도함.

 */
