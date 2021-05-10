package chapter13.rethread;

// 메인함수도 하나의쓰레드,
// 프로그램은 하나라도 쓰레드가 작업중이면 종료하지않는다.
public class Test3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thv());
        thread.start();


//        try{
//            throw new Exception();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}

class Thv implements Runnable{

    @Override
    public void run() {
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
