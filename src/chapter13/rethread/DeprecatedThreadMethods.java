package chapter13.rethread;

public class DeprecatedThreadMethods {
    public static void main(String[] args) {
        TT thread1 = new TT("*");
        TT thread2 = new TT("**");
        TT thread3 = new TT("***");

        thread1.start();
        thread2.start();
        thread3.start();

        // dead lock문제 때문에 deprecated
        try{
            Thread.sleep(2000);
            thread1.suspend();
            Thread.sleep(2000);
            thread1.resume();
            Thread.sleep(3000);
            thread1.stop();
            Thread.sleep(3000);
            thread2.stop();
            Thread.sleep(3000);
            thread3.stop();
        }catch (InterruptedException e){}

    }
}
class TT implements Runnable{
    // 직접 제어 메서드 만들면 deprecated안뜸.!
    volatile boolean stopped;
    volatile boolean suspended;

    Thread thread;

    public TT(String name) {
        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        while(!stopped){
            if(!suspended){
                System.out.println(thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
            }else{
                // suspended 가 true이면 의미없이 while문 돌기만한다. - busy waiting
                // 그럴바엔 다른 쓰레드에게 양보하자. -> 효율성 높아짐.
                Thread.yield();
            }
        }
    }

    void suspend(){
        suspended = false;
        thread.interrupt();
    }
    void resume(){
        suspended = true;
    }
    void stop(){
        stopped = true;
        thread.interrupt();
    }
    void start(){
        thread.start();
    }
}
