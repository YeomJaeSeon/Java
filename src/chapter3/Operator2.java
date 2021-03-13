package chapter3;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Operator2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d / %d = %d%n", a, b, a / b);
        // 산술변환, 연산수행 직전에 타입 형변환(1. 두 피연산자 타입 같게, int보다 작으면 int로 형변환)
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);

        byte a1 = 3;
        byte b1 = 4;
        int c = a1 + b1;
        // 산술변환으로 연산수행 직전에 피연산자 형변환, a1과 b1이 각각 int로변환(why? byte로 int보다 작은타입이므로 ㅋㅋ)
        byte c2 = (byte)(a1 + b1);
        System.out.printf("c : %d%n", c);
        System.out.printf("c : %d%n", c2);
        a1 = 10;
        b1 = 30;
        int c3 = (a1 * b1);
        // 이건 byte로 연산결과를 담으려하니 오버플로우발생한거다.
        System.out.printf("c3 : %d%n", c3);

        int a2 = 1_000_000; // int
        int b2 = 2_000_000; // int

        long c22 = (long)a2 * b2;
        // a2에 long 형변환 안해주면 a2 int, b2 int로 연산결과 int인데 연산결과가 20억이 넘어. .int overflow로 이상한값이 c22(long)에
        // 들어갈것\
        System.out.printf("c22 : %d%n", c22);

        long a3 = 1_000_000 * 1_000_000;
        long b3 = 1_000_000 * (long)1_000_000;
        System.out.printf("%d %d%n", a3, b3);

        int a4 = 1000000;
        int result1 = a4 * a4 / a4; // overflow발생할듯
        int result2 = a4 / a4 * a4; // 제대로될듯 왜냐면 연산 방향 ->잖아. 대입이랑 단항연산자 빼곤 다 ->이다.
        System.out.printf("%d %d%n", result1, result2);

        // 문자의 사칙연산, 사실 문자도 유니코드로 정수인거 알쥐?
        char ac = 'a';
        char dc = 'd';
        char zero = '0';
        char two = '2'; //죄다 문자이다. 변수(메모리)에 유니코드(쩡수)들어가있음.

        System.out.printf("'%c' - '%c' = %d%n", dc, ac, dc - ac);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c'=%d%n", ac, (int)ac);
        System.out.printf("'%c'=%d%n", dc, (int)dc); //전챕터에서봤지만 이런식으로 문자의 유니코드 알수있음 (형변환으로)
        System.out.printf("'%c'=%d%n", zero, (int)zero);
        System.out.printf("'%c'=%d%n", two, (int)two);


    }
}
