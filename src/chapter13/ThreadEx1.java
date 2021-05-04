package chapter13;

public class ThreadEx1 {
    public static void main(String[] args) {
        // 쓰레드실행
        ThreadEx1_1 t1 = new ThreadEx1_1(); // Thread 클래스 상속받은 클래스의 객체생성

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r); // Runnable 인터페이스 구현한
//        Thread t2 = new Thread(new ThreadEx1_2()); // Runnable인터페이스 구현 한 클래스.
        // 쓰레드 두개를 독립적으로 실행한것.
        t1.start();
        t2.start();

    }
}
// 쓰레드 2개 구현
class ThreadEx1_1 extends Thread{
    @Override
    public void run() { // 쓰레드가 수행할 작업작성
        for(int i = 0; i < 500; i++){
            System.out.print(0);
        }
    }
}
class ThreadEx1_2 implements Runnable{

    @Override
    public void run() { // 스레드가 수행할 작업을 run메서드에 작성함.
        for(int i = 0; i < 500; i++){
            // Runnable인터페이스 구현해서 쓰레드 구현할경우엔 이렇게 메서드접근해야함.
            System.out.println(1);
        }
    }
}
