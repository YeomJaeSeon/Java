package chapter13.methods;

import javax.swing.*;

// interrupt - 쓰레드 제어메ㅓㅅ드(쓰레드 작업취소 & 잠자는 쓰레드 꺠움)
// sleep - 쓰레드 재우는 제어메서드
public class InterAndSleep {
    public static void main(String[] args) {
        Thrdd thread = new Thrdd();
        thread.start();
        String input = JOptionPane.showInputDialog("아무키나 입려해주세요.~");
        System.out.println("입력된값 : " + input);

        delay(3000);


        thread.interrupt(); // 해당쓰레드 작업취소하려고 interrupted 필드 -> true로 변경
        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
        System.out.println("Thread.interrupted() = " + Thread.interrupted());
    }
    static void delay(int ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException e){}
    }
}

class Thrdd extends Thread{
    @Override
    public void run() {
        int i = 10;
        while(i != 0 && !isInterrupted()){
            System.out.println("i = " + i--);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                this.interrupt();
            }
        }
        System.out.println("타이머 종료");
    }
    static void delay(int ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException e){}
    }
}
