package chapter13.practice;

import com.sun.security.jgss.GSSUtil;

public class Num7 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();
        try {
            Thread.sleep(6*1000);
        } catch(Exception e) {}
        System.out.println("stopped");
        stopped = true;
        th1.interrupt(); // 잠들어있는 (3000ms)동안 쓰레드를 바로깨워서 for조건문으로 보내야한다.
//        System.out.println(th1.isInterrupted()); // false일걸.
    }
}

class Thread5 extends Thread {
    public void run() {
        for(int i=0; !Num7.stopped; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3*1000);
            } catch(Exception e) {
            }
        }
    }
} // run()


/**
 * th1쓰레드는 잠자고있는 상태에서 stopped 가 true로 바뀌었기 때문에 잠깨기 전까지 시간이 있으므로
 * 그냥 stopped빠뀌면 interrupt해야한다.
 * interrupt()를 이용해야한다.
 */
