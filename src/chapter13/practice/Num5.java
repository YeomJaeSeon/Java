package chapter13.practice;

public class Num5 {
    public static void main(String[] args) throws Exception {
        Thread3 th1 = new Thread3();
        th1.start();
        try {
            Thread.sleep(5*1000);
        } catch(Exception e) {}
        throw new Exception(" ~!!!");
    }
}
class Thread3 extends Thread {
    public void run() {
        for(int i=0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    } // run()
}

/**
 5까지 출력되고 예외발생 (main쓰레드에선)
 th1쓰레드는 계쏙 실행.. 이구나
 멀티쓰레딩 프로그램은 일반쓰레드가 모두 작업중임녀 종료하지않고
 모든 일반쓰레드가 작업을 종료해야 종료하구낭.
 main에대한 호출 스태긍ㄴ 예외발생해서종료되어도
 th1쓰레드에대한 호출스택은 남아있다.
 **/