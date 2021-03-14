package chapter3;

public class Operator5 {
    public static void main(String[] args) {
        // 문자가 유니코드임에 주의. 자꾸봐도 헷가릴네 char랑 unicode랑.
        System.out.printf("10 == 10.0F \t %b%n", 10==10.0F);
        System.out.printf("'0' == 0 \t %b%n", '0'==0);
        System.out.printf("'A'==65 \t %b%n", 'A'==65);
        System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
        System.out.printf("'A'+1 != 'B' \t %b%n", 'A' + 1 != 'B');

        System.out.println();
        float f = 0.1F;
        double d = 0.1;
        double d2 =(double)f;

        System.out.printf("10.0==10.0F %b%n", 10.0==10.0F);
        System.out.printf("0.1==0.1F %b%n", 0.1==0.1F); //
        // 10.0같은 경우는 2진수로 변환할때 그대로 변환할수있따.
        // 0.1같은 부분은 2진수로 변환할때 오차가 발생하는데 float과 double의 정밀도가 다르기때문에 다른값이 메모리상(변수)에 저장됨
        // 그러므로 다르다고 뜨는것이다.
        System.out.printf("f = %19.17f%n", f);
        System.out.printf("d = %19.17f%n", d);
        System.out.printf("d2 = %19.17f%n", d2);

        System.out.printf("0.11 == 0.11F %b%n", 0.11 == 0.11F);
        // 이것도 똑같다. 대입연산자도 이항연산자로 각 피ㅇ연산자들으 ㅣ타입이 같아야한다. 그러므로 형변환이 double로 이루어지는데..
        // 0.11같은경우엔 2진수로 변환되는 과정중 오차가 발생하므로.. double과 float은 정밀도가 2배차이나므로 다른값이 저장됨 그래서
        // float정밀도 입장에서 저장된값을 형변환해도 그값이 double로만 바뀌는거지 달라지는건없다.

        // 0.1같은경우엔 메모리상에 저장될때 오차가 발생하는데.. 그럼어케? 이런식으로 double을 float으로 형변환해버린다음 비교하자.
        System.out.printf("0.1 == 0.1F %b%n", (float)0.1 == 0.1F);
    }
}
