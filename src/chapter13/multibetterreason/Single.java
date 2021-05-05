package chapter13.multibetterreason;

import javax.swing.*;

public class Single {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무값이나 입력해주세요.");
        System.out.println("입력한값은 : " + input+"입니다.");

        for(int i = 10; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
/** 사용자가 입력안하면 io blocking으로 프로그램이 진행이안도미
 다른 예를 생각해보면 프린트를 하는데 아무것도 시스템이 동작을아나는 그런경우임
 멀티 쓰레드 예를 보자
 **/