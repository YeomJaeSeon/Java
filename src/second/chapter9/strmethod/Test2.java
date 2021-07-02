package second.chapter9.strmethod;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "car is beautiful";
        System.out.println(s1.charAt(2)); // r

        String s2 = "abcdefg";
        String s3 = "aabcdefg";
        //사전순 비교
        System.out.println(s2.compareTo(s3)); // 양수나옴 오른쪽이 더빠름 a - b라고생각

        String s4 = "hihi, ";
        String s5 = "my name is js";
        System.out.println(s4.concat(s5));
        String concatResult = s4.concat(s5);
        System.out.println("concatResult = " + concatResult);

        String s6 = "Pocketmonster is good things";
        System.out.println(s6.contains("is")); // 포함하냐?

        System.out.println(s6.endsWith("s"));
        //~로 끝나냐?


    }
}
