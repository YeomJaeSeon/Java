package chapter13.rethread;

// sleep() - 쓰레드 제어메서드, 자기 자신쓰레드 잠자게함(waiting상태로.)
// yield()와 같이 static메서드로 클래스이름으로 접근해야함.
public class SleepThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Threads1());
        Thread thread1 = new Thread(new Threads2());

        thread.start();
        thread1.start();
        try{
            Thread.sleep(2000); // sleep은 static메서드로 현재작업중인 현재 쓰레드에 대해서만 제어가능(yield도 마찬가지)
        }catch (InterruptedException e){} // sleep해있는 쓰레드꺠우려면 timeout, interrupt는 예외발생하면서 깨기떄문에 예외처리해줘야함
        System.out.println("<< main 종료 >>");
    }
}

class Threads1 implements  Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
        System.out.println("<< thread1 finish >>");
    }
}
class Threads2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
        System.out.println("<< thread2 finish >>");
    }
}
