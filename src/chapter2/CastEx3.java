package chapter2;

public class CastEx3 {
    public static void main(String[] args) {
        float f = 9.1234567F;
        double d = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f = %20.18f%n", f);
        System.out.printf("d = %20.18f%n", d);
        System.out.printf("d2 = %20.18f%n", d2);
    }
}
