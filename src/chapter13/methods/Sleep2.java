package chapter13.methods;

public class Sleep2 {
    public static void main(String[] args) {
        Thre1 th1 = new Thre1();
        Thre2 th2 = new Thre2();

        th1.start();
        th2.start();

        try{
            Thread.sleep(3000); // 쓰레드 제어하는 메서드중 하나인sleep은 쓰레드 일정시간 재우는건데 static메서드로되어있어서 자기 본인 쓰레드만 제어가능
            // main쓰레드내에 작성되었으므로 자신 쓰레드는 Main쓰레드이다. 그러므로 Main쓰레드가 3초똥안 잔다.
        }catch (InterruptedException e){}
        System.out.println("<< main 쓰레드 종료 >>");

    }
}
class Thre1 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 300; i++){
            System.out.print("-");
        }
        try{
            Thread.sleep(2000); // Thre1 쓰레드 재운다.
        }catch (InterruptedException e) {}
        System.out.println("<< Thre1 쓰레드 종료 >>");
    }
}
class Thre2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
        System.out.println("<< Thre2 쓰레드 종료 >> ");
    }
}
/**
 yield- 쓰레드 실행되다 다른 쓰레드한테 양보하는 제어메서드
 sleep - 쓰레드 재우는 메서드
 (쓰레드 제어메서드들)
 이러한 메서드들은 static으로 되어있다. 그래서자기자신쓰레드 제어할수있음.(지금 작업이 진행되는 현재 쓰레드)
 static으로되어있으면 참조변수말고 class이름으로 해당 멤버접근하잖아. ㅇ류를 줄여주낟. 참조변수로 접근하면 어? 자신쓰레드가아닌 다른 쓰레드도 재울수있네?라고 오해할수있다.
 그러나 static으로되어있으면 클래스일므으로 접근하므로 오해 X
 **/