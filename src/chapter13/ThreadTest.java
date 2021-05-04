package chapter13;

public class ThreadTest {
    public static void main(String[] args) {
        Th1 thread1 = new Th1(); // 쓰레드 객체 생성
        Runnable r = new Th2();
        Thread thread2 = new Thread(r);
        // 쓰레드 객체생성

        //쓰레드 실행
        thread1.start(); // 쓰레드 실행
        thread2.start();
        for(int i = 0; i < 100; i++){
            System.out.print(2);
        }
        // 먼저 start()메서드 호출한다고 해당 쓰레드가 먼저 호출되는건 절대아님 OS스케쥴러가 쓰레드 실행순서를 결정한다.(자신만의 로직으로)
        // 쓰레드는 OS쓰케쥴러가 하라는데로할뿐임. 종속적이다.
        // 쓰레드구현은 run메서드를 구현한느건데 run메서드로 실행안하는 이유는?
        // start()를 호출해야 새로운 call stack을 생성하기 때문이다. - 콜스택 독립적으로 실행..
    }
}
// 쓰레드 구현하는방법 2가지 Thread클래스상속, Runnable interface 구현
class Th1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.print(0);
        }
    }
}
class Th2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.print(1);
        }
    }
}
