package second.chapter9.string1;

public class Test {
    public static void main(String[] args) {

        String a = "a";
        System.out.println(System.identityHashCode(a));
        String b = "b";
        a = a + b;
        System.out.println(System.identityHashCode(a));
        // String클래스는 변경불가능한 클래스다 읽을수만있지 변경은안됨
        // 변경되기 전후의 a의 참조주소는 다르다.
        // 변경할수가없음 변경하려면 새로운 인스턴스를 참조함
        // 문자열 + 연산조심 -> 계속 메모리를 할당함 문자열 자꾸 변경할땐 메모리 할당안되게 StringBuffer를 이용하도록!
        // StringBuffer는 인스턴스하나에서 문자열을 계속변경가능

        String str1 = "abc";
        String str2 = "abc";
        // 이미 존재하는 인스턴스를 재사용
        // 두 참조변수는 같은 인스턴스를 참조한다.

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1==str2);

        // 새로운 인스턴스를 생성 new로.
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println(str3 == str4);
    }
}
