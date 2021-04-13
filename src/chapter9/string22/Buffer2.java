package chapter9.string22;

public class Buffer2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);
        // sb, sb2, sb3전부 같은 StringBuffer인스턴스 주소를 참조한다.
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);
        // StringBuffer는 STring클래스와는다르게 인스턴스의 문자열이 변경가능하므로 문자열을 늘리거나 삭제하는 이러한
        // 변경은 하나의 참조되는 주소 내에서 동작하므로. 같은 인스턴스주소를 참조한다.

        System.out.println(sb.deleteCharAt(10));
        System.out.println(sb.delete(3, 6));
        System.out.println(sb.insert(3, "abc"));
        System.out.println(sb.replace(6, sb.length(), "END"));

        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }

}
