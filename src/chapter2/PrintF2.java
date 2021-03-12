package chapter2;

public class PrintF2 {
    public static void main(String[] args) {

        String url = "www.codechobo.com";

        float f1 = .10F;
        float f2 = 1e1F;
        float f3 = 3.14e3F;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g %n", f1, f1, f1);
        System.out.printf("f2= %f, %e, %g %n", f2, f2, f2);
//        %g 지시자는 값을 좀더 간단하게 표현하는구나.. %f보다
        System.out.printf("f3 = %f, %e, %g %n", f3, f3, f3);

        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);
        System.out.printf("d=%14.13f%n", d);

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url);

        System.out.printf("[%.5s]%n", url);

    }
}
