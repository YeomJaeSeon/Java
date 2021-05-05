package chapter13.multibetterreason;

import javax.swing.*;

public class Multi {
    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());
        thread.start();
        String input = JOptionPane.showInputDialog("아무나 입력");
        System.out.println("입력한값ㅇ느 : " + input + "입ㄴ디ㅏ.");
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 10; i > 0 ; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
/**
 멀티쓰레드 이용하면 사용자가 아무~ 것도입력안할때도 다른쓰레드(메인 쓰레드아닌)가 실행을 하므로 효율적으로 CPU를 사용할수있다.
 다른 callstack에서 실행이될슁ㅅ으므로
 자원을 효율적으로 쓸수있음
 멀티쓰레드는 이래서 사용한다. 단순히 컨텍스트 스위칭으로 비용이발생하긴하지만 이렇게 자원을 효율적으로 쓸수잇다는 장점이있음
 **/