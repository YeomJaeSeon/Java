package chapter13.rethread;

import javax.swing.*;
// 멀티쓰레딩 이용하면 IOblocking에서도 자원 효율적으로 사용가능
public class Test {
    public static void main(String[] args) {
        Th thread = new Th();
        thread.start();
        String input = JOptionPane.showInputDialog("아무키나 입력하세요");
        System.out.println("입력값 : " + input);

    }
}
class Th extends Thread{
    @Override
    public void run() {
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);

            } catch (InterruptedException e){}
        }
    }
}
