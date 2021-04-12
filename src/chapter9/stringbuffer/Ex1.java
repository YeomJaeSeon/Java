package chapter9.stringbuffer;

public class Ex1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer zz = sb.append("zz");
        StringBuffer dd = zz.append("dd");
        System.out.println(sb);
        // sb, zz, dd모두 같은 주소를 참조하고있따.
        // 참고로 이렇게 Stringbuffer.append를하면 리턴타입이String buffer이ㅏㄷ.

    }
}
