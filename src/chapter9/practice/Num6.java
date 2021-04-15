package chapter9.practice;

import chapter5.Array;

import java.util.Arrays;

public class Num6 {
    public static String fillZero(String src, int length){
        if(src == null || src.length() == length){
            return src;
        }
        if(length <= 0)
            return "";
        if(src.length() > length){
            return src.substring(0, length);
        }
        char[] charArr = new char[length];
        for(int i = 0; i < length; i++){
            charArr[i] = '0';
        }
        for(int i = 0; i < src.length(); i++){
            charArr[charArr.length - src.length() + i] = src.charAt(i);
        }
        String s = new String(charArr); // 생성자 매개변수로 char 배열받을수있음.
        return s;

    }
    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,8));

        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
        System.out.println(fillZero(src,2));


    }
}
