package chapter13.mainth;

import javax.swing.*;

// 멀티쓰레드 장점. I O Blocking
// 사용자가 입력하지않고있으면 진행이안되는상황(싱글쓰레드에선)그러나 멀티쓰레드를 사용하면 병렬적으로동작하므로 블락킹당하지않고 자원을 효율적으로 쓸수있음
public class Test3 {
    public static void main(String[] args) {
        Runnable r = new Thzz();
        Thread thread = new Thread(r);
        thread.start();

        String input = JOptionPane.showInputDialog("10초 안에 이름입력해주세요.");
        System.out.println("이름  : " + input);
    }
}

class Thzz implements Runnable{

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