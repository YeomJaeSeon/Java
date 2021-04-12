package chapter9.stringmethod;

import java.util.Arrays;
import java.util.Date;

// String클래스에 정의된 메서드들
public class Ex1 {
    public static void main(String[] args) {
        String s = new String("염재선"); // 생성자로 문자열 생성 -
        char[] c = {'a', 'b', 'c', 'd'};
        String s2 = new String(c);
        System.out.println(s2);
        StringBuffer sb = new StringBuffer("Hello");
        String s3 = new String(sb);
        System.out.println(s3);

        System.out.println(s3.charAt(2));
        int bbb = "abc".compareTo("bbb");
        System.out.println(bbb);
        String def = "abc".concat("def");
        System.out.println(def);
        boolean def1 = "abcdefg".contains("def");
        System.out.println(def1);
        boolean b = "Hello Workd!".endsWith("!");
        System.out.println(b);

        String n1 = "abc";
        boolean abc = n1.equals("abc");
        System.out.println(abc);
        boolean abcdef = "AbCdEf".equalsIgnoreCase("abcdef");
        System.out.println(abcdef);
        int i = "My name is...".indexOf('i');
        System.out.println(i);
        int a = "Your name is ....".indexOf('a', 1);
        System.out.println(a);
        int hi = "Hey you! HI!!!!!".indexOf("HI");
        System.out.println(hi);
        System.out.println("------------------");
        int i1 = "java.lang.Object".lastIndexOf('.');
        System.out.println(i1);
        int i2 = "java.lang.Object".indexOf('.');
        System.out.println(i2);
        System.out.println("hello your nanme is sunny side??".length());
        String sss = "Hello";
        String replace = sss.replace('e', 'E');
        System.out.println(replace);
        String sss2 = "Helloeeee";
        String replace1 = sss2.replace('e', 'E');
        System.out.println(replace1);
        String replace2 = sss2.replace("ll", "LL");
        System.out.println(replace2);
        String sss3 = "AABBCCDDEEFFAA";
        String s1 = sss3.replaceAll("AA", "aa");
        System.out.println(s1);

        String s4 = sss3.replaceFirst("AA", "aa");
        System.out.println(s4);
        String animals = "사자, 호랑이, 표범, 악어";
        String[] split = animals.split(",");
        System.out.println(Arrays.toString(split));
        String[] split1 = animals.split(",", 2);
        System.out.println(split1[1]);
        boolean java = "java.lang.String".startsWith("java");
        System.out.println(java);
        boolean lang = "java.lang.String".startsWith("lang");
        System.out.println(lang);

        String targetString = "Hello My Name is JaeSEON!!";
        String substring = targetString.substring(6);
        System.out.println(substring);
        String substring1 = targetString.substring(6, 7);
        System.out.println(substring1);
        String s5 = String.valueOf(100);
        System.out.println(s5);
        Date today = new Date();
        String s6 = String.valueOf(today);
        System.out.println(s6);

        String example = "air, water, fire, tree";
        // 문자열을 배열로 구분자를통해서. split!
        String[] split2 = example.split(", ");
        for (String s7 : split2) {
            System.out.println(s7);
        }
        // 배열을 문자열로. 구분자를 통해서.. join!
        String join = String.join("-", split2);// String의 join메서드는 클래스(static)메서드이므로 이렇게
        // 클래스이름으로접근 물론 static import로 클래스이름 생략가능
        System.out.println(join);

        //
    }
}
