package chapter2;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;

        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        int i2 = 300;
        byte b2 = (byte)i2;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i2, b2); // loss of data
//        범위가 큰 int의 값인 300을 byte는 담지못함.. 그러므로 loss of data가일어남.

        b = 10;
        i = (int)b;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);
//        여기선안나오지만 i (int) 메모리상 모두 0으로 채워졌을것이다.. 작은타입 byte -> 큰타입 int

        b = -2;
        i = (int)b;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("i = " + Integer.toBinaryString(i));

    }
}
