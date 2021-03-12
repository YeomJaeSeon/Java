package chapter2;

public class ConstExam {
    public static void main(String[] args){
        final int MAX_SPEED = 1000;
//        상수는 final키워드 붙여주면됨.
        String name = "염재선";
        int age = 26;

        float distance = 3.14F;
        double distance2 = 3.53;

        long sum = 100_000_000_000L;

        int octNum = 010;
        System.out.println(octNum);
        int hexNum = 0x10;
        System.out.println(hexNum);
        int bunNum = 0b110;
        System.out.println(bunNum);

        final double PI =3.1413563434;

        System.out.println(PI);
        System.out.println(MAX_SPEED);

        System.out.println("-------------");

        char alphabet = 'a';
        String myName = "염재선입니다!";

        String yourName = new String("강수호입니다.!");

        System.out.println(alphabet);
        System.out.println(myName);
        System.out.println(yourName);
    }
}
