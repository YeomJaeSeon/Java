package chapter13.mainthr;
// 메인메서드도 사실 하나의 쓰레드로 동작하는거였따. 지금까진 우린 싱글 쓰레드만 이용한것이였다. 메인메서드를 통해서만 하나의 CallStack만사용해서 프로그램이 동작했었음
// 확인해보자
public class TT {
    public static void main(String[] args) {

        test();

        Thread thread = new Thread(new Th2());
        thread.start();
//        Thread thread = new Thread(new Th1());
//        thread.start();
//        System.out.println("main 메서드 종료, main쓰레드, main Callstack종료");
        // mai 쓰레드가 종료ㅐㅎ도 자겅ㅂ이 덜끝난쓰렏그ㅏ있으면 프로그램은 종료하지않난ㄷ
        // 즈그 프로그램은 모든 쓰레드의 작업이 종료해야 프로그램이 종료된다.
    }
    static void test(){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Th2 implements Runnable{

    @Override
    public void run() {
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
