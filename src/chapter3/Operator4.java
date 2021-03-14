package chapter3;

// 리터럴 연산이란 컴파일러가 미리 계산한뒤 변수에 집어넣는것이다. 인터프리터에의해 실행과정중 계산이 되는게 아니라
// 컴파일러가 미리 계산한 값을 좌 변수에 집어넣음
// short s = 200 + (short)1; 이건 에러안남. 산술변환에의해 int를 short에 넣으니 에러나야할거같은?
// 그게아니라 리터럴연산으로 컴파일러가 미리 계싼된 값을 s에 집어 넣는 flow이다.
public class Operator4 {
    public static void main(String[] args) {
        char c1 = 'a';
//        char c2 = c1 + 1; //변수 c1이있으므로 산술변환에 의해 우항이 int이므로 에러
        char c2 = 'a' + 1; // 리터럴간의 연산이므로 컴파일러가 미리 계산한값을 c2에 넣는것이므로 에러발생 x
        int i = 200;
//        short s = (short)100 + i; 변수가 있으면 컴파일러가 미리 계산 불가. 그러므로 게산하는 과정에서 에러뜨늠
        short s = (short)100 + 200; // 이건 리터럴간의 연산이라 컴파일러가 계산을 미리해놔서 s에300을 넣어놈 그래서됨



        System.out.println('a');

        char c = 'a';
        for(int j = 0; j < 26; j++){
            System.out.print(c++);
        }
        System.out.println();
        c = 'A';
        for(int j = 0; j < 26; j++){
            System.out.print(c++); // postfix로 메서드 실행하고 증가하는걸 알겠당.
        }
        System.out.println();
        c = '0';
        for(int j = 0; j < 10; j++){
            System.out.print(c++);
        }
        System.out.println();

        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32); // lowercase - 32의 결과는 int인건 산술변환. ok? 큰타입으로 자동변환되므로 이항연산에서 피연산자끼리 타입 같아야하므로.

        System.out.printf("%c%n", upperCase);

        float pi = 3.141592F;
        float shortPi = (int)(pi * 1000) / 1000F;
        System.out.printf("%f%n", shortPi);
        System.out.println(shortPi);
        // 보면 pi는 float이지? float * int 산술변환에의해 foat으로 변환되고 3141.592F가된다. 이걸 형변환하면? (int)로 소수날아가고 int가됨. 즉 
        // 3141(int임)에서 1000F로 나누면 산숣녀환에의해 다시 float으로바뀌고 (3141)이 3.141F가된다.
        
        // 반올림
        double pi2 = 3.141592; // 접미사 생략된 double임
        double shortPi2 = (int)(pi2 * 1000 + 0.5) / 1000.0;
        
        System.out.println(shortPi2);

        // Math.rount로 반ㅇ올림
        double pi3 = 3.141592; //double
        double shortPi3 = Math.round(pi3 * 1000) / 1000.0;
        // pi3 * 1000 = 3141.592 (double) 여기서 반ㅇ올림 -> 3142 -> 3142 / (double인)1000.0 하면 double나올텐데 결과는 3.142(double임.)
        System.out.println(shortPi3);

        int x = 10;
        int y = 8;
        System.out.printf("%d를 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고 나머지는 %d이다.%n", x / y, x % y);
        
        // % 나머지연산 /와 똑같다. 0으로 나머지연산 하면안된다.. x / y는 int끼리 나누기 하는것이므로 버림 나머지는 버려진당 ㅋ
        // 음수가 포함된 나머지연산
        System.out.println(-10 % 8);
        System.out.println(10 % -8);
        System.out.println(-10%-8);
    }
}
