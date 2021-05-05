package chapter13.singlevsmulti;


// 프로세스내에 쓰레드한개! 싱그르레드
public class Single {
    static long startTime = 0;
    public static void main(String[] args) {
        for(int i = 0; i < 300; i++){
            System.out.print("0");
        }
        System.out.println("소요시간1: " +(System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 300; i++)
            System.out.print("1");

        System.out.println("소요시간2: " + (System.currentTimeMillis() - startTime));

    }
}
