package chapter9.wrapper;

public class Ex2 {
    public static void main(String[] args) {
        int i = new Integer("100").intValue(); // 문자열을 기본형으로
        int i2 = Integer.parseInt("101");
        int i3 = Integer.valueOf("102"); // Integer을 리턴하는데 valueOF는 오터박싱으로 primitive로 반환해도 무방

        int i4 = Integer.parseInt("100", 2);
        int i5 = Integer.parseInt("101", 8);
        int i6 = Integer.parseInt("102", 16);

        Integer integer = Integer.valueOf("100", 2);
        Integer integer1 = Integer.valueOf("100", 8);


    }
}
