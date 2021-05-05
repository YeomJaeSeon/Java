package chapter13.singlemulti;

//main쓰레드랑 별개 쓰레드하나,총 두개(멀티쓰레드)쓰레드로 테스트
public class MultiThread {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());
        thread.start();
        startTime = System.currentTimeMillis();

        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
        System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));

    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
        System.out.println("소요시간2 : " + (System.currentTimeMillis() - MultiThread.startTime));
    }
}
