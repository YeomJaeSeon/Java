package chapter9;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("Korea");
        Date today = new Date();

        System.out.println(str);
        System.out.println(str.toString()); // String클래스에서 오버라이딩되어있는 Object의 toSTringㅁ세ㅓ드임.
        System.out.println(today);
        System.out.println(today.toString());
    }
}
