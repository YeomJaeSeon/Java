package chapter2;

public class PrintF {
    public static void main(String[] args) {
//        지시자에 따라서 다른형식으로 값을 출력할수있음.
//        지시자 종류는 %d, %b, %o, %x, %X ...
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d %n", b);
        System.out.printf("s=%d %n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);

        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);

        System.out.printf("finger=[%05d]%n", finger);

        System.out.printf("big=%d %n", big);

//        println 은 값을 그대로 출력하지만 printF는 `${}`이거와 같이 출력하고싶은대로 출력할수있네
//        값을 변환해서 출력할수있구만!.
        System.out.printf("hex=%#x%n", finger);

        System.out.printf("octNum = %o, %d%n", octNum, octNum);
        System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);
        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);

        char a = 'a';
        System.out.printf("%d", (int)'A');

    }
}
