package chapter3;

public class Practice {
    public static void main(String[] args) {
        /*
        문제 1
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A' 65 의 문자코드는

        System.out.println(1 + x << 33); - > 몰랑(3을 왼쪽으로 33번 움직이는건뎅 int는 32bit, 33번 움직인다
        3 은 ...0011
        33번 왼쪽으로 shift는 한번만 shift한다.
        즉 ...00110이되고 이는 6이다.
        System.out.println(y >= 5 || x < 0 && x > 2); -> true
        System.out.println(y += 10 - x++); // 15 - 3 = 12
        // postfix 제대로 한번더짚고가자
        y = y + 10 - x++
        y = y + (10 - x)한다음에 x++된다. 그러므로
        10 - 2된다ㅡㅇㅁ에 x가 더해짐 이건 뭐 ㅋㅋ 혼자더해지는거야
        즉 y= 13이다.
        // x는 postfix로 1더해진상태이므로 3 + 2
        System.out.println(x+=2); // 5
        System.out.println( !('A' <= c && c <='Z') ); // false

// 대충알고넘어가지말고 이거 int보다 작기때매 산술변환으로 둘다 int로 변환된다으 ㅁ여낫ㄴ되느ㅓ이
        System.out.println('C'-c); // 2

        System.out.println('5'-'0'); // 5
        System.out.println(c+1); // 66
        System.out.println(++c); // B
        System.out.println(c++); // B
        System.out.println(c); // C
        // c는 char이므로 문자로 출력돔돔
        */

        /*
        문제2
        numOffApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
         */

        /*
        문제3
        num > 0 : "양수" ? ( num == 0 ? "0" : "음수");
         */

        /*
        문제4
        num % 100 * 100
         */

        /*
        문제5
        num / 10 * 10 + 1
         */

        /*
        문제6
        (num / 10 + 1) * 10 - num
         */

        /*
        문제7
        (int)((5/9 * (fahrenheit - 32)) * 100 + 0.5) / 100.0
         */
        // 나눗셈으로 소수버리는 매커니즘을 이용한 문제이다.

        //문제 8
        byte a = 10;
        byte b = 20;
        int c = a + b;
        char ch = 'A';
        ch = (char)(ch + 2);
        float f = (float)3 / 2;
        long l = (long)3000 * 3000 * 3000;
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = (float)d==f2;
        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);

        //문제9
        char ch1 = '1';
        boolean b1 = ch1 >= 'a' && ch1 <= 'z' || ch1 >= 'A' && ch1 <= 'Z' || ch1 >= '1' && ch1 <= '9';
        System.out.println(b1);

        System.out.println();
        // 문제10
        char ch3 = 'f';
        char lowerCase = ch3 >= 'A' && ch3 <= 'Z' ? (char)(ch3 + 32) : ch3;
        System.out.println("ch:"+ch3);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
