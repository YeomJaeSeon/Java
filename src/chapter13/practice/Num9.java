package chapter13.practice;

import javax.swing.*;

public class Num9 {
    public static void main(String[] args) {
        Exercise13_9_1 th1 = new Exercise13_9_1();
        th1.start();
        String input = JOptionPane.showInputDialog(" 아무 값이나 입력하세요.");
        System.out.println("입력하신값은" + input + " 입니다.");
        th1.interrupt(); // .
    }
}
class Exercise13_9_1 extends Thread {
    public void run() {
        int i = 10;
        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000); // 1초 지연
            } catch(InterruptedException e) { // 쓰레드상태는 다시 interrupted가 false로 변경되므로 다시catch문에서 intrrupet사용해서
                //조건문의 isInterrupted를 true로 바꿔줘야한다.

                interrupt(); // catch문에서 다시 false로 바뀌므로 다시 interrupt()해서 true로 바꿔줘야함.
            }
        }
        System.out.println("카운트가 종료되었습니다.");
    } // main
}

// 7과 9번
/**
 7번은 interrupt로 sleep한 쓰레드 바로 꺠우는것이고
 9번은 interrupt()를 호출하면 sleep한 쓰레드 꺠우긴하지만 interrupted상태가 false로 바뀌기 때문에
 다시 catch문에서 (예외 발생해서 처리하는 catch문) 다시 interrupt()로 true상태로 바꿔줘서 조건문에서 isInterrupted가 true가 될수있또록
 일관성을 갖게한다.
 **/