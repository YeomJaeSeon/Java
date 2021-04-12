package chapter9.stringbuffer;

public class Ex2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        boolean equals = sb.equals(sb2);
        boolean b = sb == sb2;
        System.out.println(equals);
        System.out.println(b);
        // 둘다 false임 , String은 Object의 equals메서드 오버라이딩해서 내부문자열값 비교하지만
        // StringBuffer는 equals메서드 오버라이딩안됨

        // 그래서 toString으로 String으로바꾸고 비교하자. toStirng은 다행이 STringBuffer클래스가 오버라이딩함 ㅋㅋ

        String sbToString = sb.toString();
        String sb2ToString = sb2.toString();

        System.out.println(sbToString.equals(sb2ToString)); // equals - 오버라이딩된 toString이므로 true
        System.out.println(sb2ToString == sbToString); // false - 주소가다르므로 당연히 false
    }
}
