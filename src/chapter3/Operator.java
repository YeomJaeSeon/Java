package chapter3;

public class Operator {
    public static void main(String[] args) {
        int x;
        int y;
        x = y = 100;
        // 오른쪽에서 왼쪽으로(대입연산자는 그렇다 방향이)

        int i = 10;
        float f = 2.0F;
        float result = i + f;
        System.out.printf("%f%n", result);
//        일반적으로 작은 크기의 타입이 큰타입으로 형변환됨 -> 산술변환이라한다.

        long longNum = 100_000_000_000L;
        int intNum = 300;

        long resultNum = longNum + (long)intNum;
        System.out.println(resultNum);

        byte b = 1;
        short s = 5;

        System.out.println(b + s);

        int n1 = 5;
        int n2 = 2;
        System.out.println((double)n1 / n2);
//        n1 / n2로 그냥하면 int가 연산결과이므로소수점 버려짐.
//        두 피연산자중하나를 형변환하면 된다. double이나 float로. 그러면 나머지도 큰타입으로 자동 형변환(산술변환)되서 소수점 안버려짐.

//        자주 사용했던 증감연산자
        int i5 = 5;
        // 증감연산 postfix
        i5++;
        System.out.printf("%d%n", i5);
        i5 = 5;
        // 증감연산 prefix
        ++i5;
        System.out.printf("i5 : %d%n", i5);

        // 둘의 차이는없다 어떤 수식에잇어야 차이가보임

        //보여줄게
        i5 = 5;
        int result5 = ++i5;
        System.out.printf("prefix한 result : %d%n", result5);

        i5 = 5;
        result5 = i5++;
        System.out.printf("postfix한 result : %d%n", result5);

        i = 5;
        int j = 5;
        // 메소드 호출에 postfix 증감연산자, 5가나옴
        System.out.println(i++);
        // 메소드호출에 사용한 prefix 증감연산자 6이나옴
        System.out.println(++j);
        
        // 참고로 이렇게 피연산자의 값을 바꾸거나 타입변경하는 연산자는 대입연산자 증감연산자밖에없음 나머지연산자들은 피연산자를 연산결과로만사용

        i = -10;
        i = +i;
        System.out.printf("i : %d%n", i);

        i = -i;
        System.out.printf("i : %d%n", i);

        int a = 10;
        b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
        System.out.printf("%d / %f = %f%n", a, (double)b, a / (double)b);

        System.out.printf("%d / %f = %f%n", 300, (double)70, 300 / (double)70);
        // int / int 하면 연산결과도 int라 소수점버려짐 두 피연산자중 하나 형변환(실수로)그러면 나머지 피연산자도 알아서 형변환됨 -> 산술변환
//        그럼 결과도 적절히 실수로 나올것이다.

//        주의할 예제
        byte aa = 3;
        byte bb = 4;
        byte cc = (byte)(aa + bb); // 왜냐면 aa + bb는 둘다 int보다 작기때문에 int로 산술변환되는데 그걸 byte에담으려니 에러가생긴다.

        System.out.printf("byte cc : %d%n", cc);


        // 실수(뿌동소수점)지시자는 %f였쥥?  float, double 모두해당

        // 위와 다른 주의할 예제
        byte a1 = 30;
        byte b1 = 10;
        int c1 = a1 * b1; // a1, b1 이 byte이므로 + 연산자는 둘을 int타입으로 형변환해주고 연산을 행한다. 그럼 연산결과도  int이므로 딱맞다! 참고로 300은 byte범위넘어가므로 overflow생김.
        System.out.printf("byte c1 : %d%n", c1);

        // 이것도 주의할예제 ㅋㅋ 연산어렵네
        int a11 = 1_000_000;
        int b11 = 2_000_000;

        long c = a11 * b11;
        // int a11와 int b11을 곱한 연산결과는 int인데 20억을 넘어가므로 overflow가생김 ㅋㅋ 그러므로 여기자체에서 이상한값이나오고
//        이 이상한값이 long타입인 c에 대입연산되는거임 그러닌까 흠.. a11과 b11자체를 곱할때 연산결과에서 overflow생김
        System.out.printf("c : %d%n", c);

        long rightC = (long)a11 * b11;
        System.out.printf("rightC : %d%n", rightC);

        // 위예제 복습느낌으로한번더~
        long aaa = 1_000_000 * 1_000_000; // int인 백만 두개곱하는겨
        long bbb = 1_000_000 * 1_000_000L; // int백만과 long 백만곱하니 산술변환에의해 롱으로나옴 ㅋㅋ 아마 이게 제대로 나올듯 위에건 오버플로우나오고
        System.out.printf("aaa : %d, bbb : %d%n", aaa, bbb);

        // 잠깐 복습!! 형변환 왜한다햇지 챕터2에서? 연산할때 피연산자들끼리 타입이 같아야하므로..
        // 산술변환이란 뭐게? 연산 수행직전에 피연산자들의 타입을 자동으로 형변환해줌.. (연산할때 타입이 같아야하닌까.)
        // 산술변환엔 두가지 규칙이있따 1. 두 피연산자의 타입을 같게 일치시킨다...(뽀다 큰 타입으로 일치. 왜냐면 loss of data가 없는 방향으로.)
        // 2. 피연산자의 타입이 int(4byte)보다 작으면 피연산자 타입을 int로 변환
        byte rere = 1;
        byte aeae = 2;
        byte ccz = (byte)(rere + aeae); // int보다 작은 피연산자들은 자동으로 int로 형변환됨 그럼 연산결과도 int근데 byte에 넣으라고/ 안되지..

        int zzef = rere + aeae;
    }
}
