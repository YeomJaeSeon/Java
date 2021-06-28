package second.chapter9.string1;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(str.charAt(1));
        System.out.println(str.compareTo("abc"));
        System.out.println(str.compareTo("b"));
        System.out.println(str.compareTo("abcdefg"));

        System.out.println(str.compareTo("abc"));
        //이후닌까 양수
        System.out.println(str.compareTo("b"));
        // 이전이닌까 음수

        String s = "Hello";
        String resultS = s.concat(", World!");
        System.out.println(resultS);

        String s2 = "대한민국";
        String resultS2 = s2.concat(" 만세!!");
        System.out.println(resultS2);

        System.out.println(str.contains("bc"));
        //포함한다.

        String fileName = "hello.jpg";
        System.out.println(fileName.endsWith("jpg"));
        // ~로 끝난다.

        System.out.println(fileName.equals("hello.jpg"));

        System.out.println(fileName.equalsIgnoreCase("HELLO.JPG"));
        // 대소 상관없이 equals로 비교

        String s3 = "Hello";
        System.out.println(s3.indexOf('H'));
        System.out.println(s3.indexOf('l'));
        System.out.println(s3.indexOf('l', 3));
        System.out.println(s3.indexOf('l', 4));
        //없으면 -1
        // indexOf로 입려되는 문자나 문자열과 같은 인덱스를 반환한다.

        System.out.println(s3.indexOf("lo"));
        System.out.println(s3.indexOf("lo", 10));

        System.out.println(s3.lastIndexOf('0'));
        System.out.println("==========================");
        System.out.println(s3.lastIndexOf('o'));
        // 뒤에서부터 확인

        String path = "user.hello.jpa";
        System.out.println(path.lastIndexOf("."));
        //뒤에서부터
        System.out.println(path.lastIndexOf("hello"));

        System.out.println(path.length());
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);

        //String클래스에는 length()라는 메서드가 존재함
        //배열은 length라는 멤버 변수가 존재함
        // 차이가 존재!

        String name = "YeomJaeSeon";
        System.out.println(name.length());
        int[] arr2 = new int[]{10, 11, 12, 13, 14};
        System.out.println(arr2.length);

        String v = "Whats your name?";
        String transformStr = v.replace("your", "my");
        System.out.println(transformStr);

        String path2 = "hi.your.jpa.spring";
        String transformStr2 = path2.replace(".", "O");
        System.out.println("변경후 : " + transformStr2);
        // 모두변경함
        // 맞는 문자열을 모두 변경하려는 문자열로 변경함

        //문자를 변경할수도
        String transform3 = path2.replace('.', 'A');
        System.out.println("transform3 = " + transform3);

        String before = "123-2231-34123-341";
        System.out.println(before.replace("-", "--"));
        // 모두변경

        System.out.println(before.replaceFirst("-", "V"));
        //첫번재만 변경

        //문자열을 배열로 split
        String animals = "dog,pig,lion,tiger";
        String[] splitResult = animals.split(",");
        System.out.println(Arrays.toString(splitResult));
        for(int i = 0; i < splitResult.length; i++){
            System.out.println(splitResult[i]);
        }

        //limit도 지정가능 - 배열의 크기를 제한주는거임
        String[] limitSplitResult = animals.split(",", 2);
        System.out.println(Arrays.toString(limitSplitResult));
        for(int i = 0; i < limitSplitResult.length; i++){
            System.out.println(limitSplitResult[i]);
        }

        String vv = "John Cenedy";
        System.out.println(vv.startsWith("John")); // endsWith와 반대
        String subStringResult = vv.substring(2, 4);
        System.out.println(subStringResult);
        System.out.println(subStringResult.length());

        String splitResult2 = vv.substring(5);
        System.out.println("result : " + splitResult2);

        System.out.println(vv.toUpperCase(Locale.ROOT));
        System.out.println(vv.toLowerCase());
        System.out.println(vv.toUpperCase());
        System.out.println(vv.trim());
        String wow = "         wow!!   zz is     ";
        System.out.println(wow.trim());



    }
}
