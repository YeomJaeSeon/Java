package second.chapter9.strmethod;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "안녕안녕";
        System.out.println(s.charAt(0));
        String s2 = "abcdefg";
        String s3 = "bcdefgh";
        System.out.println(s2.compareTo("aaa"));
        System.out.println(s2.compareTo(s3));

        String s4 = "Helo, ";
        String s5 = "World!";
        System.out.println(s4.concat(s5));
        String concatResult = s4.concat(s5);
        System.out.println(concatResult);

        String s6 = "아름다운 우리강산 너무아름다워라";
        System.out.println(s6.contains("우리강산"));

        String s7 = "abcdefg";
        System.out.println(s7.endsWith("efg"));
        //이걸로 끝나나?

        String s8 = "index.jpg";
        System.out.println(s8.endsWith(".jpg"));

        System.out.println(s8.equals("index.jpg"));

        System.out.println(s8.equalsIgnoreCase("InDEX.jPg"));
        //대소문자 무시하고
        System.out.println(s8.equals("index.JpG"));

        String s9 = "HI my name is jaeseon, what's your name?";
        System.out.println(s9.indexOf('I'));
        System.out.println(s9.indexOf("my name"));
        System.out.println(s9.indexOf("what", 9));
        System.out.println(s9.indexOf("what", 25));
        //못찾으면 -1리턴

        System.out.println(s9.indexOf('n', 20));

        System.out.println(s9.lastIndexOf("name"));
        System.out.println(s9.lastIndexOf("name", 20));
        System.out.println(s9.lastIndexOf("name"));

        System.out.println(s9.lastIndexOf('y'));

        System.out.println(s9.length());
        //길이
        int[] intArr = {1, 2, 3, 4, 5};
        System.out.println(intArr.length);

        String s10 = "aaaabbbbbcccceeeeaaaaafff";
        System.out.println(s10.replace('a', 'A'));

        System.out.println(s10.replace("aaa", "AAA"));

        System.out.println(s10.replaceFirst("a", "A"));
        //첫번재거만 바꿈
        System.out.println(s10.replaceAll("a", "A"));
        System.out.println(s10.replace("a", "A"));

        System.out.println(s10.replaceFirst("a", "A"));

        String s11 = "What's your name, my name is mymy";
        System.out.println(s11.replaceFirst("m", "M"));

        System.out.println(s11.replace('m', 'M'));
        System.out.println(s11.replace("m", "M"));
        //replaceFirst는 만나는 첫번째 원소를 변경
        //replace는 문자열내에서 변경할때,, replaceFirst도존재, 이건 인자가 그런데 String이와야함. char말고!

        String s12 = "호랑이,말,하마,고양이,강아지,원숭이";
        String[] strArr = s12.split(",");
        for(String v : strArr){
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(strArr));
        //split : String -> String[]

        String[] strArr2 = s12.split(",", 3);
        System.out.println(Arrays.toString(strArr2));

        String s13 = "hi my name is god!";
        System.out.println(s13.startsWith("hi"));
        //~로 시작하는지? : startsWith,
        // ~로끝나는지? : endsWith

        String s14 = "mylectureisPhysical";
        String substringResult = s14.substring(2, 2 + "lecture".length());
        System.out.println(substringResult);
        //substring : String에서 subString .. 문자열 뽑아내기

        System.out.println(s14.toUpperCase());

        String s15 = "MYHOBBYISPLAYINGSOCCER";

        System.out.println(s15.toLowerCase());
        //소문자 대문자로

        String ttt = "          my name is dog!     ";
        System.out.println(ttt.trim());
        String trimResult = ttt.trim();
        System.out.println("trimResult = " + trimResult);

        int v = 100;
        String intToString = String.valueOf(v);
        System.out.println(intToString.charAt(0));









    }
}
