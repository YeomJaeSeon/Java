package chapter13.methods;

// sleep메서드는 자기자신 쓰레드 잠자게한다. 일정시간동안.
// sleep메서드는 static으로되어있다. - 자기 자신 쓰레드에게 적용한다는읨이ㅣㅁ. static으로하면..
// 쓰레드 제어하는 메서드중 static으로 되어있는것 들 1. sleep, 2. yield는 모두 자기 자신 쓰레드에게만 적용한다는 의미로 static이 적혀있음
// 객체이름.으로 접근하면 다른 쓰레드를 잠들게하는건가? 하고 헷갈릴수있으므로
// sleep메서드는 InterruptedExceptioㅂ라생함

import chapter11.hashset.Th;

public class Sleep {
    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());
        Thread thread1 = new Thread(new Th2());
        thread.start();
        thread1.start();

        try{
            Thread.sleep(2000); // 쓰레드 제어하는 메서드인 sleep은 static으로되어있음 자기자신쓰레드에만 적용한다는 의미임. yield와 같다.!
        }catch (InterruptedException e){}
        System.out.println("<<메인 쓰레드 종료 >>");
    }
}
class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
        System.out.print("<<th1 쓰레드 종료>>");
    }
}
class Th2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
        System.out.print("th2 쓰레드 종료>>");
    }
}
