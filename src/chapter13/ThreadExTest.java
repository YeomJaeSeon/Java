package chapter13;

public class ThreadExTest {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Runnable r = new Thread2();
        Thread thread2 = new Thread(r);
        // 쓰레드 생성

//        // 쓰레드 실행
        // start()메서드 호출한다고 해당쓰레드가 바로실행되는게아니라 실행가능 `상태`가 되는것
        // 실행 순서는 OS 스케쥴러(나는 윈도우 스케쥴러)가 결정한다.
        // thread2가먼저실행될 `수도`있다.
        // 쓰레드는 OS에 종속적이다. OS가 결정한 순서에 따라서 실행함.
//        thread1.start();
        thread2.start();
        for(int i = 0; i < 500; i++){
            System.out.print(0);
        }
        // 이건 메인메서드의 ㅆ레드와 thread2의 쓰레드가 독립적으로 실행되기에 뭐가먼저 호출될지는 알수없음. OS 스케쥴러가 쓰레드 실행순서결ㅈ어함.

//        for(int i = 0; i < 500; i++){
//            System.out.println(0);
//        }
//        for(int i = 0; i < 500; i++){
//            System.out.println(1);
//        }
        // main메서드의 싱글쓰레드로 순서절대안바뀜
    }
}

// 쓰레드 구현 방법
// 1. extends Thread
// 2. Runnable인터페이스 구현
// 어쨌든 run 메서드를 구현해야한다.

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 500; i++){
            System.out.print(0);
        }
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 500; i++){
            System.out.print(1);
        }
    }
}

/**
 근데 쓰레드 구현할때 run메서드를 구현해야한다매?
 start()로 왜 실행함? run으로 실행해야하는거아닌가?
 call stack을 보면알수잇음
 main메서드의 callstack에선
 start()메서드가 쌓이고
 start()메섣느ㅡㄴ 새로운 `Call Stack`을 생성함
 해당 콜스택에서 run메서드를 가지고있고 글면 callstack 두개가 독립적으로 실행됨
 **/