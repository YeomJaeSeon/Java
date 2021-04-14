package chapter9.util;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"},{"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"},{"AAA", "BBB"}};

        //Objects의 메서드인 deepEquals(static메서드임)
        System.out.println(Objects.deepEquals(str2D, str2D_2));
        System.out.println(Objects.equals(str2D, str2D_2));

        System.out.println(Objects.isNull(null)); // nullcheck Object보조클래스 Objects
        System.out.println(Objects.nonNull(null));

        System.out.println(Objects.hashCode(null)); // null체크 오버라이딩도미
        System.out.println(Objects.toString(null));

        Comparator c = String.CASE_INSENSITIVE_ORDER; // 대소문자 구분안하는 비교 - 11장에서배움

        System.out.println(Objects.compare("aa", "bb", c));
        System.out.println(Objects.compare("bb", "bb", c));
        System.out.println(Objects.compare("bb", "aa", c));
        System.out.println(Objects.compare("aB", "Ab", c)); // 0이나올듯 대소문자구분 X





    }
}
