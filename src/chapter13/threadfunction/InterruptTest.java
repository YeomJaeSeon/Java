package chapter13.threadfunction;

import chapter11.hashset.Th;

import javax.swing.*;

// 쓰레드 작업 중단 ,sleep 쓰레드 꺠우는 제어메서드 (static X) static한 메서드는 sleep, yield -> 자기 쓰레드메안 ㅁ적용가능한 제어메서드라는 의미임
public class InterruptTest {
    public static void main(String[] args) {
        Thread3 thread = new Thread3();
        thread.start();
        String input = JOptionPane.showInputDialog("아무키나 입력");
        System.out.println("입력하신 값은 : " + input + "입니다");
        thread.interrupt();
        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
        System.out.println("Thread.interrupted() = " + Thread.interrupted());
    }
}

class Thread3 extends Thread{
    @Override
    public void run() {
        int i = 10;
        while(i != 0 && !isInterrupted()){
            System.out.println(i--);
            delay(1);
        }
        System.out.println("타이머 종료되었습니다.");
        System.out.println("Thread.interrupted() = " + Thread.interrupted());
    }
    public void delay(int time){
        try{
            Thread.sleep(time * 1000);
        }catch (InterruptedException e){
            interrupt();
        }
    }
}
/**
 * 실행중이던 작업 취소 -> interrupt() : interrupted false -> true
 * isInterrupted() -> 상태
 * interrupted() -> 상태출력후 interrupted상태 false로 초기화(static임.)
 */
