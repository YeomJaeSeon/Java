package chapter13.suspendstopresumeyieldjoin;

// static아님. 현재쓰레드가 특정쓰레드 작업끝날떄까찌 대기한다.
public class JoinTest {
    static long startTime = 0;
    public static void main(String[] args) {
        Th2 thread = new Th2();
        Th3 thread1 = new Th3();
        thread.start();
        thread1.start();
        startTime = System.currentTimeMillis();
//
        try{
            thread.join(); // 현재쓰레드(main쓰레드)가 thread 작업끝날떄까직디ㅏ림
            thread1.join(); // 현쨰쓰례드(main쓰레드가) thred작업 긑날떄까지 ㄱ디ㅏ림
        }catch (InterruptedException e){}
        System.out.print("Zz");
        System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime));
    }
}

class Th2 extends Thread{

    @Override
    public void run() {
        for(int i = 0;i < 3000; i++){
            System.out.print("-");
        }
    }
}
class Th3 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 3000; i++){
            System.out.print("l");
        }
    }
}