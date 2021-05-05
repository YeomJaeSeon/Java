package chapter13.makethread;

public class Thead1 {
    public static void main(String[] args) {
        Th1 th1 = new Th1();
//        Runnable r = new Th2(); // 인터페이스 다횽송..
//        Thread th2 = new Thread(r);
        Thread th2 = new Thread(new Th2());


        // 쓰레드 실행은 start메서드로.
        th1.start();
        th2.start();
        // 실행가능 상태가되는거지 쓰레드가 실행되는건아니다. 쓰레드 실행은 OS 스케쥴러가 정한다. 쓰레드는 OS에 종속적, 의존적이다.
        // OS가 하라는데로 하닌까> 쓰레드는..
    }
}

// java에서 쓰레드를 구현하는  두가지 방법 - Thread 클래스 상속, Runnable인터페이스구현
class Th1 extends Thread{

    // run메서드 내에는 수행할, 작업할 내용을적는다.
    @Override
    public void run() {
        for(int i = 0; i < 500; i++)
            System.out.print(0);
    }
}

class Th2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 500; i++){
            System.out.print(1);
        }
    }
}
