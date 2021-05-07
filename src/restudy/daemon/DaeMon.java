package restudy.daemon;

public class DaeMon extends Thread {
    static boolean autoSave;
    public static void main(String[] args) {
        DaeMon thread = new DaeMon();
        thread.setDaemon(true);
        thread.start();

        for(int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(i);
            if(i == 5)
                autoSave = true;
        }
        // 메인(일반스레드가)종료되면 데몬쓰레드(보조쓰레드)도 종료돔
        // 프로그램은 종료되지않은 일반 쓰레드가 하나라도 잇으면 프로ㄱ램은 종료되낟.
    }
    public static void autoSave(){
        System.out.println("작업 파일이 저장되었습니다.");
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){}
            if(autoSave){
                autoSave();
            }
        }
    }
}

