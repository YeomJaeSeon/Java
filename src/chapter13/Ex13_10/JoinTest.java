package chapter13.Ex13_10;

//특정쓰레드 끝날떄까찌 대기
public class JoinTest {
    public static void main(String[] args) {
        Runnable r = new Thread10();
        Thread thread = new Thread(r);
        thread.start();

        try{
            thread.join(); // 시간지정하면 그 시간만기다림
            // main쓰레드는(현재 지정 된 쓰레드)는 특정 쓰레드이 작업이 끝날떄까지기다린다.
        }catch (InterruptedException e){}
        System.out.println("<<main 종료>>");
    }
}

class Thread10 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i  < 10; i++){
            System.out.println(i);
            delay(1000);
        }
    }
    void delay(int times){
        try{
            Thread.sleep(times);
        }catch (InterruptedException e){}
    }
}