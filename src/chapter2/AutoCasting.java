package chapter2;

public class AutoCasting {
    public static void main(String[] args) {
        float f= 1234;
//        float f = 1234.1;
//        위두개의 차이점이 처음엔 헷갈렷는데 한 10초생각하니 바로이해도미
//        위에건 정수인 1234를 auto 형변환 즉, float f= (float)1234;이고
//        아래건 리터럴값이 실수이므로 F리터럴 접미사를 붙여줘야한다.! 그래서 아래는 에러나고 위에는 에러안나는 것이다.
        System.out.printf("%f%n", f);

        byte b = (byte)1000;
        System.out.println(b);
//        byte b = 1000;으로 auto casting 자동형변환시키면 loss of data일어날수도 있따로 에러뜨지만 직접 형변환 연산자를 쓰면
//        아~ 내가 일부러했어라는 개발자의 의도를 알아먹고 에러없애줌!

        int i = 3;
        double d = 1.0 + i; // i는 auto casting으로 (double)i 즉 3.0으로 자동형변환되어 연산된다. - 이렇게 연산과정에서 자동형변환되는 것을 산술 변환이라한다.
        System.out.printf("%f %n", d);
    }
}
