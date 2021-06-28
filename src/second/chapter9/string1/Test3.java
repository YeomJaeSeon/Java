package second.chapter9.string1;

public class Test3 {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        String s = "Hello!, ";
        System.out.println(System.identityHashCode(s));
        String str2 = "World..";
        s = s.concat(str2);
        System.out.println(System.identityHashCode(s));

        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.capacity()); // 15 + 16 (16더더해짐)
        System.out.println(sb.length());
        StringBuffer sb2 = new StringBuffer(20);
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer(5);
        System.out.println(sb3.capacity());

        //String을 불변클래스 인스턴스 한번생성하면 읽기만 가능 변경불가능
        // 변경하는게 아닌 다른 인스턴스를 또생성하는것 참조값 비교 == 하면 확인가능
        String s1 = "abc";
        System.out.println(System.identityHashCode(s1));
        String refS1 = s1;
        System.out.println(System.identityHashCode(refS1));
        s1 += "d";
        System.out.println(System.identityHashCode(s1));
        System.out.println("비교 : " + (refS1 == s1));
        //다를것임.

        //StringBuffer는 하나의 인스턴스에서 문자열 변경가능
        //append메서드를 통해서 +연산처럼 문자열 추가할수있는데 append()메서드는 StringBuffeㄱ자시느이 인스턴스를 리턴한다.
        //StringBuffer는 변경을위한 버퍼를 따로 사용하기에  변경이가능한것! STring과다르다
        StringBuffer sb10 = new StringBuffer(20);
        sb10.append("ab").append("cd").append("dd");
        System.out.println(sb10);
        StringBuffer refS10 = sb10;
        System.out.println(System.identityHashCode(refS10));
        sb10.append("hihihi");
        System.out.println("StringBuffer비교 : " + (refS10 == sb10));
        System.out.println(System.identityHashCode(sb10));
        //StringBuffer는 String과 다르게 equals 오버라이딩안되어있음

        StringBuffer v1 = new StringBuffer("abc");
        StringBuffer v2 = new StringBuffer("abc");
        System.out.println(v1.equals(v2));
        System.out.println(v1 == v2);

        //String으로 바꿔서 equals로 비교하자
        String sv1 = v1.toString();
        String sv2 = v2.toString();
        System.out.println(sv1.equals(sv2));
    }
}
