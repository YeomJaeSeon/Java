package chapter13.rethread;

public class Test2 {
    public static void main(String[] args) {
        Runnable r = new Thx1();
        Runnable r2 = new Thx2();
        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r2);

        thread1.setPriority(10);
        thread.setPriority(1);
        // 우선순위를 줘도 완벽하지안흥ㅁ 결국 OS스케쥴러가 쓰레드 실행순서를 결정하기 때문이지.

        thread.start();
        thread1.start();
    }
}

class Thx1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
    }
}

class Thx2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
    }
}