package chapter9.string;

public class Ex2 {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.lenghth = " + cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}


