package second.chapter9.strbufferbuilder;

public class Test {
    public static void main(String[] args) {
        //Strig은 불변 클래스이지만 StringBuffer나 StringBuilder는 하나의 인스턴스를 가르킨 상태에서 문자열 요리조리 변경가능
        String s = "abcdefg";
        System.out.println(System.identityHashCode(s));
        String b = "하하하";
        s = s + b;
        System.out.println(System.identityHashCode(s));

        StringBuilder sb = new StringBuilder(2);
        sb.append('a');
        System.out.println(System.identityHashCode(sb));
        sb.append('b');
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());
        sb.append("c");
        System.out.println(System.identityHashCode(sb));
        sb.append("d");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());

        //모두 같다.

        String s1 = "염재선입니다";
        StringBuilder sb3 = new StringBuilder(s1);
        System.out.println(sb3);
        System.out.println(sb3.getClass());
        String builderToString = sb3.toString();
        System.out.println(builderToString.getClass());

        StringBuilder sb4= new StringBuilder();
        sb4.append("abdfef");
        System.out.println(sb4.charAt(1)); // b
        Character character = sb4.charAt(0);
        System.out.println(character.getClass());
        //character

        sb4.deleteCharAt(1);
        System.out.println(sb4);

        sb4.delete(1, 4);
        System.out.println(sb4);
        //delete는 범위지정가능
        //deleteCharAt은 해당 idx의 문자 delete

        System.out.println(sb4.length());
        System.out.println(sb4.capacity());

        StringBuilder sb5 = new StringBuilder("hihi my name is cat!");
        sb5.replace(0, 1, "H");
        System.out.println(sb5);
        sb5.replace(0, 4, "Hello");
        System.out.println(sb5);
        //replace stringbuilder도 가능

        sb5.reverse();
        System.out.println(sb5);

        sb5.setCharAt(5, 'M');
        System.out.println(sb5);

        System.out.println(sb5.length());
        sb5.setLength(5);
        System.out.println(sb5);
        System.out.println(sb5.length());
        sb5.setLength(20);
        System.out.println(sb5);
        System.out.println(sb5.length());

        StringBuilder sb6 = new StringBuilder("안녕하소서 우리사랑");

        String substringString = sb6.substring(0, 5);
        System.out.println("substringString = " + substringString);

    }
}
