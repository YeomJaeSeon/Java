package chapter13.practice;

public class Num1 {
    public static void main(String[] args) {
        Runnable r = new Thread1();
        Thread th1 = new Thread(r);
//        Thread1 th1 = new Thread1();
        th1.start();
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print('-');
        }
    }
}

//class Thread1 extends Thread {
//    public void run() {
//        for(int i=0; i < 300; i++) {
//            System.out.print('-');
//        }
//    }
//}

/**
 * 2번
 *  0 1 2 3 4 5 ... 9 0 1 2 3 4 ... 9 (b가 옳다.)
 *  single thread임.
 *
 *  3번
 *  b - 재개
 *  f - 통보(객체의 waiting pool에있는 쓰레드 임의로 락을 전달)
 *
 *  4번
 *  c - wait()메서드도 interrupt()호출되면 InterruptedException발생해(예외 발생) 실행대기 상태가되서 queue에 대기한다. - OS scheduler가 정한 순서로
 *  d - resume()으로 꺠어남(deprecated임.)
 *
 *
 */
