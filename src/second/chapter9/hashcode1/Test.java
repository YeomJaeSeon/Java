package second.chapter9.hashcode1;


public class Test {
    public static void main(String[] args) {
        String str1 = new String("1234");
        String str2 = new String("1234");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        // String클래스가 Object의 해쉬코드 메서드를 적절히 오버라이딩함 -> 문자열의 내용이 같으면 같은 해쉬코드 값 반환하도록 오버라이딩함.

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2)); // Object클래스의 hashCode() 메서드와 같음.
        // 서로 다른 인스턴스를 가르키면, 참조변수가 다르면, 다른 객체이면 다른 해쉬값을 반환함


    }
}
