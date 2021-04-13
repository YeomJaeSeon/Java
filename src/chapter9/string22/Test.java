package chapter9.string22;

public class Test {
    public static void main(String[] args) {
        // 기본형 -> 문자열로
        String intToString = String.valueOf(100);
        System.out.println(intToString);
        String charToString = String.valueOf('a');
        String s = "" + 100L;
        System.out.println(s); // 기본형 문자열로 변환


    }
}
