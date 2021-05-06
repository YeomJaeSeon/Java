package chapter13.daemon;

import chapter11.hashset.Th;

/**
 * 데몬쓰레드는 일반쓰레드 보조하는 보조쓰레드
 * 일반쓰레드 작업 모두 수행되서 끝나면 보조쓰레드도 종료됨
 * 보조쓰레드는 주로 자동저장, 가비지컬렉터 등에쓰임.
 * 무한루프로 반복문돌다가 어떤 특정한 조건에서 수행함. (무한루프로 돌아도 프로그램 죽는다. 오내ㅑ면 데몬쓰레드닌까. 일반쓰레드면 프로그램 종료안됨.)
 */
public class AutoTest implements Runnable{
    static boolean autoSave;
    public static void main(String[] args) {

        Thread thread = new Thread(new AutoTest());
        thread.setDaemon(true); // 데몬쓰레드(일반쓰레드 보조역할하는 데몬쓰레드로 설정)
        thread.start(); // setDaemon으로 데몬쓰레드 설정하는 부분으 start()하기전에해야함
        autoSave = true;
        for(int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);

            }catch (Exception e){}
        }
        System.out.println("프로그램이 종료되었습니다.");

    }
    @Override
    public void run() {
        while(true){ // 무한루프를 돌고있어도 데몬쓰레드이므로 메인 쓰레드~! (일반쓰레드)가 다 수행끝나서 종료되면 데몬쓰레드도 종료된다.
            try{
                Thread.sleep(3 * 1000);
            }catch (Exception e){}
            if(autoSave) autoSave();
        }
    }
    public static void autoSave(){
        System.out.println("자동저장!");
    }
}
