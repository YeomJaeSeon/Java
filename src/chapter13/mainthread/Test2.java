package chapter13.mainthread;

public class Test2 {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Th1());
        Thread thread2 = new Thread(new Th2());

        thread1.start();
        thread2.start();

        startTime = System.currentTimeMillis();


        System.out.println("수행시간 : " + (System.currentTimeMillis() - startTime));
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
    }
}

class Th2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
    }
}
