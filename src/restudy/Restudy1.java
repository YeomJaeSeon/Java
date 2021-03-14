package restudy;

public class Restudy1 {
    public static void main(String[] args) {
        // 변수 : 단하나의 값을 저장할수있는 메모리공간 (타입으로 메모리 공간 크기 지정, 이름으로 변수 접근가능)

        double d = 3.14;
        double castD = 3.14F; // 자동형변환 (float을 double로 형변환은 자동형변환 가능)

        int i = 10;
        float f = 10.3F;

        System.out.println(i + (int)f);
        // 이항연산의 두 피연산자의 타입은 같아야함
        // 이걸도와주는게 산술변환
        // 산술변환이란 연산 수행 직전에 발생하는 피연산자의 자동 형변환.

        char ch = 'a';
        System.out.printf("공백의 유니코드 : %d%n", (int)ch);
    }
}
