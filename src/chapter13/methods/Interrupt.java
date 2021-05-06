package chapter13.methods;

import chapter11.hashset.Th;

import javax.swing.*;

public class Interrupt {
    public static void main(String[] args) {
        ThTh thread = new ThTh();
        thread.start();
        System.out.println(thread.isInterrupted());
        String input = JOptionPane.showInputDialog("아무값이나 입력해주세요.");
        System.out.println("입력한값: "+ input);
        
        thread.interrupt();
//        
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//        System.out.println("Thread.interrupted() = " + Thread.interrupted());
    }
}

class ThTh extends Thread{

    @Override
    public void run() {
        int i = 10;
        while(i != 0 && !isInterrupted()){
            System.out.println(i--);
            for(long x = 0; x < 2500000000L; x++);
        }
        System.out.println("this.isInterrupted() = " + this.isInterrupted());
        System.out.println("Thread.interrupted() = " + Thread.interrupted()); // static메서드인 interrupted는 호출되면 interrupted boolean상태변수 false로 초기호하ㅏㅁ
        // true이면 interrupt()를 했다, false이면 interrupt()안했다 . 그차이임.
        System.out.println("this.isInterrupted() = " + this.isInterrupted());
        System.out.println("카운트가 종료되었습니다.");
    }
}