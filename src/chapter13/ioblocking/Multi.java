package chapter13.ioblocking;

import javax.swing.*;

public class Multi {
    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());
        thread.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신값은 " + input + "입니다.");
    }
}

class Th1 implements Runnable{
    @Override
    public void run() {
        for(int i = 10; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        System.exit(0);
    }
}