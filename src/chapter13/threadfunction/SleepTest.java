package chapter13.threadfunction;

public class SleepTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());

        thread.start();
        thread2.start();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){}
        System.out.println("<<메인 종료 >>");
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
    }
}