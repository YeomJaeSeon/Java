package chapter13.rethread;

// join()메서드는 다른 쓰레드가 작업할때까지 대기하는 쓰레드제어메서드이다. (현재쓰레드가 특정쓰레드가 작업끝날떄까찌 기다리낟.)
public class JoinTest {
    public static void main(String[] args) {
        Runnable r = new T();
        Runnable r2 = new T2();
        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r2);

        thread.start();
        thread1.start();

        try{
            thread.join();
            thread1.join(); // join도 대기상태중 interrupt로 벗어날수있으므로 예외처리해야함(InterruptedException예이 발생하면서 waiting상태에서 나올슁ㅆ음)
        }catch (InterruptedException e){}
        // 메인쓰레드가 thread, thread1작업이 끝날떄까지 대기한다.

        System.out.print("<<main 쓰레드 종료>>");
    }
}
class T implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
        System.out.print("<<thread1 finish>>");
    }
}
class T2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
        System.out.print("<<thread2 finish>>");

    }
}
