package chapter2;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890F;
        float f2 = 1.2345678901234567890F;
        double d= 9.12345678901234567890;

        System.out.printf("f : %f%n", f);
        System.out.printf("f : %24.20f%n", f);
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d : %24.20f%n", d);

        float f3 = 9.1234567F;
        int i = Float.floatToIntBits(f3);

        System.out.printf("%f%n", f3);
        System.out.printf("%x%n", i);
    }
}
