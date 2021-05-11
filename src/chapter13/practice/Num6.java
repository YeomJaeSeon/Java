package chapter13.practice;

public class Num6 {
    public static void main(String[] args) throws Exception {
        Thread4 th1 = new Thread4();
        th1.setDaemon(true);
        th1.start();
        try {
            th1.sleep(5*1000);
        } catch(Exception e) {}
        throw new Exception(" ~!!!");
    }
}
class Thread4 extends Thread {
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
 th1은 데몬쓰레드이므로 보조쓰레드임.
 main쓰레드가 예외 발생해서 끝나면 프로그램도 th1이 작업이 끝나지않았어도 프로그램은 종료함
 데몬쓰레드는 일반쓰레드 모두종료해서 프로그램종료하면 작업중이라도 종료한다.(일반쓰레드의 보조쓰레드이므로)
 **/