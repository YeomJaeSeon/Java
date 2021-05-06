package chapter13.mainth;

// single thread - maint hread
public class Test2 {
    static long startTime = 0;
    public static void main(String[] args) {
        T1 thread = new T1();
        thread.start();

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
        System.out.println(System.currentTimeMillis() - startTime);


    }
}

class T1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
        System.out.println(System.currentTimeMillis() - Test2.startTime);
    }
}

/**
 싱글쓰레드로 동작하면 메인쓰레드 하나에서 동작(CallStack하나)에서 동작하기 떄문에 컨텍스트 스위칭비용이 적게든다.(프로세스 쓰레드간 작업 변경)
 멀티쓰레드는 컨텍스트 스위칭 비용이 들기에 싱끌쓰레드보단 ㅇ약간이지만 수행시간ㅇ 더오래걸린다. 그럼에도 멀티쓰레드는 자원을 효율적으로 사용할수있기에 좋다.
 물론 쓰레드의 수행순서는 OS스케쥴러가 결정한다.
 **/