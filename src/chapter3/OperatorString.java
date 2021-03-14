package chapter3;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class OperatorString {
    public static void main(String[] args) {
        String str = "염재선";
        String str2 = "염재선";

        System.out.println(str == str2);
        // equals 메소드로 두 문자열 비교해야함
        System.out.println(str.equals(str2));

        String string1 = "abc";
        String string2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf(" string1 == \"abc\" ? %b%n", string1=="abc");
        System.out.printf(" string2==\"abc\" ? %b%n", string2 == "abc");//엥 ㅋ ㅋ왜이건 false임?

        System.out.printf("string1.equals(\"abc\") ? %b%n", string1.equals("abc"));
        System.out.printf("string2.equals(\"abc\") ? %b%n", string2.equals("abc"));
        System.out.printf("string2.equals(\"ABC\") ? %b%n", string2.equals("ABC"));
        System.out.printf("string2.equalsIgnoreCase(\"ABC\") ? %b%n", string2.equalsIgnoreCase("ABC"));
        
//        결론! 문자열 비교는 그냥 equals()메서드를 이용하자
//        나중에 == 와 의차이를 알게될것ㄷ이ㅏ.
//        String은 클래슨데 축약으로 String name = new String("염재선"); 이렇게 안하고 String name = "염재선"; 이렇게가능한데 ==는 두결과가다르다 ㅠ 이상하네


    }
}
