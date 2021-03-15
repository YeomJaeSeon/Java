package chapter5;

import java.util.Arrays;

public class ArrayEx13 {
    public static void main(String[] args) {
        String name = "abcdefghijklmnop";
        String newString = name.substring(0, 3);
        System.out.println(newString);

        char newChar = name.charAt(5);
        System.out.printf("문자 : %c%n", newChar);

        boolean isEqual = name.equals(newString);
        System.out.printf("둘이 같음? : %b%n", isEqual);

        char[] charArr = name.toCharArray();
        System.out.println(Arrays.toString(charArr)); // 문자열을 문자 배열로 변환
    }
}
