package chapter9.string22;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("abaadsfadsfasdfasdfasdfasdfasdfasfasdfasdf");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);

        System.out.println(sb.delete(3, 43));
    }
}
