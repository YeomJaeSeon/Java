package chapter2;

public class CastingEx4 {
    public static void main(String[] args) {
//        정수와 실수사이의 형변환
        int i = 91234567;
        float f = (float) i;
        int i2 = (int)f;

        double d = (double)i;
        int i3 = (int)d;

        float f2 = 1.666F;
        int i4 = (int)f2;

        System.out.printf("i = %d%n", i);
        System.out.printf("f=%f i2=%d%n", f, i2);
//        float의 정밀도는 7자리이므로 8자리 이후는 정확하지않고 그값을 다시 int로 바뀌어도 잘못저장된값을 형변환한것이므로 i와 i2의 값은 다르다.

        System.out.printf("d=%f ie=%d%n", d, i3);
//        정밀도가 15자리인 double은 정수에서 실수로 형변환이 잘된걸 볼수있다. 그러므로 i3도 같은 값을 가진다.

        System.out.printf("(int)%f=%d%n", f2, i4);
//        실수형에서 정수형으로 형변환 할때는 소수점 버려지는것을 볼 수가 있다.

    }
}
