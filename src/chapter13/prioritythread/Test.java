package chapter13.prioritythread;

import chapter11.hashset.Th;

// 쓰레드에 우선순위를 줄수잇다. 그러나 ㅆ레드 실행순서 결정ㅎ나늑너 겱구 OS스케쥴러임, 즉, 쓰레드ㅡ에 우선순위를 준다는건 그런 희망사망을 준다는것. 확률 가능서만 높아지는것이지 확실한 우선순위는아니다.
// 결국 OS 스케쥴러가 쓰레드의 실행순서를 결정하기때문이지..
public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Th1());
        Thread thread2 = new Thread(new Th2());

        thread2.setPriority(10);
        System.out.println("Priority of th1(-) : " + thread1.getPriority());
        System.out.println("Priority of th2(l) : " + thread2.getPriority());
        thread1.start();
        thread2.start();
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("-");
            for(int x = 0; x < 10000000; x++);
        }
    }
}

class Th2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
            for(int x = 0; x < 10000000; x++);
        }
    }
}

// Th2 쓰레드에 더 높은 우선순위를 준다고 꼭 먼저 끝나는건아니다. 결국 쓰레드실행순서결정은 OS스케쥴러가 하기떄문