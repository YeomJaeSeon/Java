package chapter7.practice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 이겸ㅇ클래스 - 이름 X, 일회용
// 클래스 선언과 객체생성 동시에
// 부모 클래스이름사용하거나 인터페이슫이름사용해서 선언과생성함.
public class Practice28 {
    public static void main(String[] args) {
        Frame f = new Frame();
        // 요런식으로 클래스선언과 클래스 인스턴스 생성을 동시에함.
        // 이름은 부모 클래스이름이나 인터페이스이름 사용해서 선언 생성함.
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}

//7-29
/*
지역 클래스는 해당 메서드가 끝나면 사라짐.
그런데 지역클래스에서 사용되는 멤버는 더 오래사용될 수잇따.
그닌까. 지역클래스의 생명주기는 메서드와 같은데 지역클래스에서 사용하는 멤버는
이 생명주기보다 더 오래사용될수있으므로 지역변수는 final이 붙은 상수만 접근가능
 */