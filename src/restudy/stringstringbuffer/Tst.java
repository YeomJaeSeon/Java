package restudy.stringstringbuffer;

public class Tst {
    public static void main(String[] args) {
        String string = new String("abc");
        StringBuffer stringBuffer = new StringBuffer("abc");
        String newString = string + "d";
        StringBuffer s = stringBuffer.append("d");

        System.out.println(string == newString); // String클래스는 불변클래스라서
        // 새롭게만들어진 객체주소를가르키는중
        System.out.println(stringBuffer == s); // StringBuffer는 불변클래스인 String과 다르게
        // 객체의 문자열변경이가능하다. 그래서 같은 주소를 참조하는데 문자열 내용만 변경된것!

        Long id = 20L;
        Long id2 = Long.valueOf(10L);

        long result = id + 20L; //참조변수와 primitive type간의 연산..
        // 컴파일러가 자동적으로 오토박싱 언박싱을 해줘서 타입을 ㅁ자춰준다.

        Long result2 = id + 20L;
        System.out.println(result);
        System.out.println(result2);
    }
}
