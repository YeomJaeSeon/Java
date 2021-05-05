package chapter13.mainthread;

// main메서드도 쓰레드에 의해 실행된다. 하나의 쓰레드에의해
// 메인메서드가 끝나도 사용자 쓰레드가 있으면(작업이 안끝났으면) 프로그램은 종료되지않는다. 예를보자
public class Test1 {
    public static void main(String[] args) {
        Runnable r = new Th();
        Thread thread = new Thread(r);
        thread.start();
//        Test t = new Test();
//        t.run();
    }
}

class Test{
    public void run(){
        throwException();
    }
    public void throwException(){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Th implements Runnable{

    @Override
    public void run() {
        throwException();
    }
    public void throwException(){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}