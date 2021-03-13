package chapter2;

public class Overflow {
    public static void main(String[] args) {
//        2byte인 short와 char 오버플로우에 대해서 알아보자.
//        최대값 + 1 -> 최소값, 최소값 - 1 => 최대값을 봐보자.
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.printf("sMin = %d%n", sMin);
        System.out.println("sMin - 1 = " + (short)(sMin - 1));

        System.out.println("sMax= " + sMax);
        System.out.println("sMax + 1 = " + (short)(sMax + 1));

        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin - 1 = " + (int)--cMin);

        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax + 1 = " + (int)++cMax);
    }
}
