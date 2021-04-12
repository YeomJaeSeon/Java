package chapter9.stringmethod;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class Ex3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "가";
        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println("UTF-8 : " + joinByteArr(bArr));
        System.out.println("CP949: " + joinByteArr(bArr2));

        System.out.println("UTF-8 : " + new String(bArr, "UTF-8"));
        System.out.println("CP949 : " + new String(bArr2, "CP949"));
    }
    static String joinByteArr(byte[] bArr){
        StringJoiner sj = new StringJoiner(":", "[", "]");
        for (byte b : bArr) {
            sj.add(String.format("%02X", b));
        }
        return sj.toString();
    }
}
