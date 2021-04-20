package chapter11;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();
    public static void main(String[] args) {
        goUrl("1.네이트");
        goUrl("2.야후");
        goUrl("3.네이버");
        goUrl("4.다음");

        printStatus();

        goBack();
        System.out.println("뒤로버튼누름");
        printStatus();

        goBack();
        System.out.println("뒤로버튼누름");
        printStatus();

        goForward();
        System.out.println("앞으로가기 버튼누름");
        printStatus();

        goUrl("codechobo.com");
        System.out.println("get");
        printStatus();


    }
    public static void printStatus(){
        System.out.println("back = " + back);
        System.out.println("forward = " + forward);
        System.out.println("현재 화면은 '" + back.peek() + "'입니다");
        System.out.println();
    }
    public static void goUrl(String url){
        back.push(url);
        if(!forward.empty()) // foward stack에 뭔가있따면
            forward.clear();
    }
    public static void goForward(){
        if(!forward.empty())
            back.push(forward.pop());
    }
    public static void goBack(){
        if(!back.empty())
            forward.push(back.pop());
    }
}
