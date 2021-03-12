package chapter2;

public class Primitive {
    public static void main(String[] args) {
        boolean isPowerOn = false;
        System.out.printf("power : %b%n", isPowerOn);
//        %b 지시자는 boolean 나타냄.

//        boolean isSwitchOn = False; Java는 대소문자 구분조심. 리터럴 접미사 L, F는 안하지만 .. 이것도 대문자로 하기로했당.!

//        char
        char ch = 'A';
        // 실은 변수 ch에 'A'문자가 저장되는거같지만 컴퓨터는 숫자밖에 이해못하기 때문에 문자의 유니코드인 정수가 들어간다.
//        즉 ch 메모리 안에 유니코드 65 (정수)가 들어가서 저장되어있는 상태이다.
        System.out.printf("ch : %c%n", ch);

        char ch2 = 65;
        System.out.printf("ch2 : %c%n", ch2);

//        ch와 ch2의 결과가같다. 왠냐면 char 타입 변수는 메모리공간에 문자를저장하는게아니라 유니코드(정수)를 저장하므로
//        ch와 ch2는 같은 결과를 갖는다.

        int code = (int)'B';
//        문자는 유니코드를 각각모두가지고있는데 해당문자의 유니코드를 알고싶으면 형변환 해주면된당!
        System.out.printf("'B'의 유니코드 : %d%n", code);

        int num = 300;
        System.out.printf("10진수로 표현 : %d%n", num);
        System.out.printf("16진수로 표현: %x%n", num);
        System.out.printf("8진수로 표현: %o %d %n", num, num);
        System.out.printf("2진수로 표현 : %s %n", Integer.toBinaryString(num));

        char ch3 = 'A';
        int code3 = (int)ch3;

        System.out.printf("%c=%d(%#x)%n", ch3, code3, code3);
        System.out.printf("%c=%d(%x)%n", ch3, code3, code3);
//        %x는 code3(int)인 정수, 'A'의 유니코드를 16진수로 변경 (64 + 1 = 65)

        char ch4 = '가';
        int code4 = (int)ch4;

        System.out.printf("%c=%d(%#x)%n", ch4, code4, code4);

//        해당문자의 유니코드알면 문자리터럴 '' 사용안할수도있음 ㅋㅋ 그냥그렇다고 이건넘어가자 그래도한번해보면
        char ch5 = 44032;
        System.out.printf("ch5 = %c%n", ch5);
//        이런식으로 문자리터럴'' 작은따음표 안쓰고 문자를 변수에 저장할수있당. 사실이거다~~~ 유니코드 정수를 저장하는거 아시죠?
//        문자리터럴 사용해서 유니코드가 변수에저장되는거아시죠~~~

//        특수문자 다루기 , 두문자 같지만 한문자를 의미한다.
        System.out.println('\t');
        System.out.println('\'');
        System.out.println('\f');
        System.out.println('\b');
//        한문자로 인식되닌까 문자 리터럴 작따를 쓰는구만 암암!!
        System.out.println('\r');
        System.out.println('\\');
        System.out.println('\"');

//        특수무자다루는거 쉽네잉!
        System.out.println("abc\t123\b456"); // \b backspace에 의해서 3이 지워진다.
        System.out.println('\n');
        System.out.println("\"Hello\"");
        System.out.println("c:\\");

        char ch10 = 'A';
        System.out.printf("%d%n", (int)ch10);
        short shortNum = 65;

        System.out.println(ch10);
        System.out.println(shortNum);

    }
}
