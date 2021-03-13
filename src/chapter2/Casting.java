package chapter2;

public class Casting {
    public static void main(String[] args) {
//        Casting(형변환)어떤 연산을할때 두 타입간 일치가 되어있어야한다.
//        형변환 방법 : (타입)피연산자 - very easy

        double d = 85.5;
        int score = (int)d;
        System.out.printf("score : %d%n", score);
        System.out.printf("형변환 한후의 d : %f%n", d);
        System.out.println(d);
//        형변환 한 후의 d는 변화없음 그냥 형변환한 값을 score에 넣었을 뿐이므로 d변수는 변화없암!

        char ch = 'A';
        int charToInt = (int)ch;

        int num = 66;
        char intToChar = (char)num;

        float fNum = 32.4F;
        int floatToInt = (int)fNum;

        int INum = 32;
        float intToFloat = (float)INum;

        System.out.printf("%d%n", charToInt);
        System.out.printf("%c%n", intToChar);
        System.out.printf("%d%n", floatToInt);
        System.out.printf("%f%n", intToFloat);


    }
}
