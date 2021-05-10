package chapter13.rethread;

// daemon쓰레드 - 일반쓰레드의 보조쓰레드
// 일반쓰레드 모두 작업종료하면 daemon쓰레드도 알아서 종료됨(데몬쓰레드 무한루프 작업해도 괜찮음.)
public class Test4 implements Runnable {
    static boolean autoSave;
    public static void main(String[] args) {
        Thread thread = new Thread(new Test4());
        thread.setDaemon(true); // 데몬쓰레드 설정
        thread.start();
        for(int i = 10; i > 0; i--){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(i);
            if(i == 5){
                autoSave = true;
            }
        }
        // 메인쓰레드(일반쓰레드)종료되면 프로그램종료. 데몬쓰레드는 보조쓰레드이므로 일반쓰레드 모두종료되면 알아서종료
    }
    public void autoSave(){
        System.out.println("자동 저장완료");
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(2 * 1000);
            }catch (InterruptedException e){}
            if(autoSave){
                autoSave();
            }
        }
    }
}