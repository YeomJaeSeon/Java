package chapter9.practice;

public class Num9 {
    static String delChar(String src, String delCh){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < src.length(); i++){
            // delCh 문자열 내부검사 loop
            String string = String.valueOf(src.charAt(i));
            if(!delCh.contains(string))
                stringBuffer.append(string);
        }
        return new String(stringBuffer);
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));
    }
}
