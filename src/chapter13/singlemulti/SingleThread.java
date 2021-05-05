package chapter13.singlemulti;
//main쓰레드만
public class SingleThread {
    static long startTime = 0L;
    public static void main(String[] args) {
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
        System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 300; i++){
            System.out.print("l");
        }
        System.out.println("소요시간2 : " + (System.currentTimeMillis() - startTime));
    }
}
