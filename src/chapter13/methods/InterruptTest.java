package chapter13.methods;

import javax.swing.*;

// interrupt 쓰레드 제어하는 메서드는쓰레드의 작업을 취소하거나 잠자는 쓰레드를 꺠운다.
// isInterrupted - 인터럽트 ㅅ아태 -> true :인터럽트 OK, false :초기상태
public class InterruptTest {
    public static void main(String[] args) {
        ThreadA thread = new ThreadA();
        thread.start(); // main쓰레드에서 thread 쓰레드 실행 (strat) -> 대기상태로 돌입 (실행순선는 OS스케쥴러가 결정)
        String input = JOptionPane.showInputDialog("아무키나 입력해주세요.");
        System.out.println("입력값 : " +  input);

//        thread.interrupt(); // interrupt -> 수행중인 작업 취소할수있음

//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//        System.out.println("Thread.interrupted() = " + Thread.interrupted()); // static메서드임  - 현재 이코드 실행중인 쓰레드의 interrupt상태를 반환함
        // 이 작업을 수행하는 현재쓰레드는 main쓰레드이므로 false가나올것.

    }
}

class ThreadA extends Thread{
    @Override
    public void run() {
        int i = 10;
        while(i != 0 && !isInterrupted()){ // i 가 0되거나 isInterrupted가 true이면 반복문탈출 // 정형화된 패턴임
            System.out.println("i = " + i--);
            for(long x = 0; x < 2500000000L; x++); // 시간지연
        }
        System.out.println("this.isInterrupted() = " + this.isInterrupted());
        System.out.println("Thread.interrupted() = " + Thread.interrupted());
        System.out.println("Thread.interrupted() = " + Thread.interrupted()); // Thread.interrupted() -> 인터럽트하고 사태를 false로 위에서 초기화했기에 해당 쓰레드 현재쓰레드인터럽트 했어도 false가 나옴
        System.out.println("카운트 종료");
    }
}
