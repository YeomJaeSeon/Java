package chapter13.mainthreadtest;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());

        thread.start();

        System.out.println("main 종료"); // main메서드가 종료되도 ,
        //main쓰레드가 종료되어도 실행중인 ㅆ레드, 자겅ㅂ이 끝나지않은쓰레드가존재하면(사용자쓰레드)
        //프로그래밍 종료디ㅗ지안흔다.
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print(1);
        }
    }
}
