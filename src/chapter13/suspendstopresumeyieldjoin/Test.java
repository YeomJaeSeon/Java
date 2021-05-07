package chapter13.suspendstopresumeyieldjoin;

// suspend -> 실행중인 쓰레드 정지
// resume -> 대기중인 쓰레드 다시 Runnable로
//stop -> 쓰레드 소멸
// deadlock문제로 deprecated
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
            thread1.suspend();
            Thread.sleep(2000);
            thread1.resume();
            Thread.sleep(3000);
            thread2.stop();
            thread1.stop();
            thread3.stop();
        }catch (InterruptedException e){}
        System.out.println("<<main Thread finish>>");

    }

}
class Th implements Runnable{
    volatile boolean suspended = false; // cpu core에서 변수 복사해서 사용하는게아닌 main memory의 변수를 그대로 원본 그대로사용함.
    volatile boolean stopped = false;
    Thread th;
    Th(String name){
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while(!stopped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
            }else{
                Thread.yield(); // 다른쓰레드에게 양보
            }
        }
    }

    public void suspend(){
        suspended = true;
        th.interrupt();
    }
    public void stop(){
        stopped = true;
        th.interrupt();
    }
    public void resume(){
        suspended = false;
    }
    public void start(){
        th.start();
    }
}
