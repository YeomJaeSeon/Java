package chapter13.mainth;

// 메인메서드도 사실 하나의쓰레드
//메인쓰레드
//프로그램은 작업이 수행중인쓰레드가 있으면 종료하지 않는다.
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());
        thread.start();
        System.out.println("메인 종료"); // 메인쓰레드는 종료되어도 start()메서드가 새로운 call stack을 생성해서 해당 call stack에서 해당 쓰레드 동작이 수행되.
        // 메인메서드도 메인쓰레드라는의미 프로그램은 수행중인 쓰레드가 없어야 종료된다.
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
    }
}
