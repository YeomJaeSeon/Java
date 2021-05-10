package chapter13.rethread;

import javax.swing.*;

// interrupt는 잠자거나 하는 쓰레드 깨운다.
// interrupit()는 쓰레드의 작업취소 제어
public class InterruptTest {
    public static void main(String[] args) {
        Tthread thread = new Tthread();
        thread.start();

        String input = JOptionPane.showInputDialog("입력");
        System.out.println("입력값은 : " + input);
        thread.interrupt(); // 필드 interrupted : false -> true
        System.out.println(thread.isInterrupted()); // 현재상태반환
//        System.out.println(Thread.interrupted()); // interupted()는 현재상태 반환 + 상태를 true -> false로초기화
    }
}

class Tthread extends Thread{
    @Override
    public void run() {
        int i = 10;
        while(i != 0 && !isInterrupted()){
            System.out.println(i--);
            for(long x = 0; x < 2500000000L; x++);
        }
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted()); // false로 변해있음
        System.out.println(this.isInterrupted());
        System.out.println("카운트 종료");
    }
}
