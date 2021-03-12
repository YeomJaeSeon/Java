package chapter2;

import java.util.*;

public class PrintF3 {
    public static void main(String[] args) {

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFF_FFF_FFFL;

        int octNum = 010; // 8진수, 10진수로는 8
        int hexNum = 0x10; // 16진수, 10진수로는 16
        int binNum = 0b10; // 2진수, 10진수로는 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c%n", c);

        System.out.printf("c=%d%n", (int)c);

        System.out.printf("[%d] %n", finger);
        System.out.printf("[%5d] %n", finger);
        System.out.printf("[%-5d] %n", finger);
        System.out.printf("[%05d] %n", finger);

        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%d %x%n", hex, hex);

        System.out.printf("ocNum : %d %o%n", octNum, octNum);
        System.out.printf("hexNum(16진수) : %d %x%n", hexNum, hexNum);
        System.out.printf("binNum(2진수) : %d %s%n", binNum, Integer.toBinaryString(binNum)); // 2진수는 2진수를 나타낼 지시자가없음. %b같은.

        // printf2
        String url = "www.naver.com";
//        String url = new String("www.naver.com"); // ref타입ㅇ니거알지? url이 새 객체 주소값 가지고있다.
        float f1 = .10F;
        float f2 = 1e1F;
        float f3 = 3.14e3F;
        double d = 1.23456789;

        System.out.printf("f1=%f %e %g%n", f1, f1,f1);
        System.out.printf("f2 = %f %e %g %n", f2, f2, f2);
        System.out.printf("f3 = %f %e %g %n", f3, f3, f3);

        System.out.printf("d =%f%n", d);// double은 자기 지시자있냐고...  없당
        System.out.printf("d =%14.10f %n", d);
        System.out.printf("d =%12.10f %n", d);
        System.out.printf("d =%11.10f %n", d);

        System.out.printf("[%s] %n", url);
        System.out.printf("[%5s] %n", url);
        System.out.printf("[%15s] %n", url);
        System.out.printf("[%-15s] %n", url);
        System.out.printf("[%.8s] %n", url); // 일부 문자열만 남김
        System.out.printf("[%.5s] %n", url);
    }
}
