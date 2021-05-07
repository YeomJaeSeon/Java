package chapter13.Ex13_10;

public class Test2 {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadJoin1());
        Thread thread1 = new Thread(new ThreadJoin2());

        thread.start();
        thread1.start();
        startTime = System.currentTimeMillis();

        try{
            thread.join(); // 현재쓰레드가 특정 쓰레드를 기다려야할때 join()을사용함
            thread1.join();
        }catch (InterruptedException e){}
         //join도 sleep같이 대기상태 벗어날떈 interrupt로 벗어날수있으므로 try -catych예외처리해줭함
        System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime));
    }
}

class ThreadJoin1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
    }
}

class ThreadJoin2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
    }
}