package chapter13.singlevsmulti;

import chapter11.hashset.Th;

public class Multi {
    static long startTime = 0L;

    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());
        thread.start();

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 300; i++){
            System.out.print(1);
        }
        System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print(0);
        }
        System.out.println("소요시간: " + (System.currentTimeMillis() - Multi.startTime));
    }
}

/**
 싱글쓰레드와 멀티쓰레드의 차이
 싱글쓰레드는 쓰레드하나(call Stack)하나에서 실행됨
 멀티쓰레드는 다중쓰레드, 여러개의 callstack에서 실행이됨
 그래서 컨텍스트 스위칭비용이 발생 (cpu coreㅢ) 그래서 약간식나이 더걸림
 **/
/**
 그래도 멀티쓰레드가 유용한 이유는?
 그이유를 다음 IO blocking예에서 알아보자
 **/