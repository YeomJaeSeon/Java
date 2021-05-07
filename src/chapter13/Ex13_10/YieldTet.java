package chapter13.Ex13_10;

// yield는 다른 쓰레드에게 양보,
public class YieldTet {
    public static void main(String[] args) {
        Th11 thread = new Th11("*");
        Th11 thread2 = new Th11("**");
        thread.start();
        thread2.start();

        try{
            Thread.sleep(4000);
            thread.suspend();
            Thread.sleep(2000);
            thread.stop();
        }catch (InterruptedException e){}
    }
}

class Th11 implements Runnable{

    volatile boolean suspended = false;
    volatile boolean stopped = false;
    Thread th;

    Th11(String name){
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        String name = th.getName();

        while(!stopped){
            if(!suspended){
                System.out.println(name);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
            }else{
                Thread.yield(); // suspended상황이면 낭비하지않게 현재쓰레드를 다른쓰레드에게 양보(다른쓰레드는 특정하지않음) Runnable상태인 queue에서 대기하는 쓰레드에게양보함.

            }
        }
    }

    void suspend(){
        suspended = true;
        th.interrupt();
    }
    void stop(){
        stopped = true;
        th.interrupt();
    }
    void resume(){
        suspended = false;
    }
    void start(){
        th.start();
    }
}