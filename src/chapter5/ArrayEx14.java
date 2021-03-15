package chapter5;

import java.util.Arrays;

public class ArrayEx14 {
    public static void main(String[] args) {
        System.out.printf("args length : %d%n", args.length);
        String src = new String("ABCDED");

        System.out.println(src.length());
        // 문자열 메서드 string.length()존재하네 마치 배열처럼 ㅋㅋ 그렇다고 배열처럼 인덳로 바로 접근안되고 charAt으로가능.
        for(int i = 0; i < src.length(); i++){
            System.out.print(src.charAt(i)+", ");
        }
        System.out.println();
        // String을 char[] 로 변환
        char[] charArr = src.toCharArray();
        System.out.println(Arrays.toString(charArr));

        char[] charArr2 = {'W', '3', 'C'};
        String web = new String(charArr2);
        System.out.println(web);
    }
}
