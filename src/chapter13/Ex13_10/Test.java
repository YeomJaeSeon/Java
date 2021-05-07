package chapter13.Ex13_10;

public class Test {
    public static void main(String[] args) {
        Th thread1 = new Th("*");
        Th thread2 = new Th("**");
        Th thread3 = new Th("***");

        thread1.start();
        thread2.start();
        thread3.start();

        try{
            Thread.sleep(2000);
            thread1.suspend(); // deprecated ..
            Thread.sleep(2000);
            thread2.suspend();
            Thread.sleep(3000);
            thread1.resume();
            Thread.sleep(3000);
            thread1.stop();
            thread2.stop();
            Thread.sleep(2000);
            thread3.stop();
            // main쓰레드제외 나머지쓰레드들 다종료 - stop()으로
        }catch (InterruptedException e){}

    }
}

class Th implements Runnable{

    volatile boolean suspended = false;// volatile은 복사본을 사용하지못하게함. 원본을 사용하게함.
    volatile boolean stopped = false;
    Thread th;

    Th(String name){
        th = new Thread(this, name);
    }

    void start(){
        th.start();
    }
    void stop(){
        stopped = true;
    }
    void suspend(){
        suspended = true;
    }
    void resume(){
        suspended = false;
    }


    @Override
    public void run() {
        while(!stopped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
            }
        }
    }
}
// deadlock문제로 suspend, resume, stop메서드는 deprecated이다.