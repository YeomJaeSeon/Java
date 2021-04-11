package chapter9.hashcode;


public class Ex1 {
    public static void main(String[] args) {
        String str1 = new String("KOREA");
        String str2 = new String("KOREA");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() == str2.hashCode()); // String클래스에서Object hashcode메서드를 오버라이딩함.
        // 무낮열이 같으면 해쉬코드도같게

        // 원래는 달라야함 요로케
        System.out.println(System.identityHashCode(str1) == System.identityHashCode(str2));
    }
}
