package chapter9.string;

public class Ex1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc"; // str2는 이미 존재하는 , str1이 가르키는 인스턴스를 재사용한다.
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ? " + (str1 == str2)); // 같다.
        System.out.println("str1.equals(str2) " + str1.equals(str2)); // 사실 Object의 메서드 equals를 String이 자신에맞게
        //오버라이딩한거쥐~?
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
