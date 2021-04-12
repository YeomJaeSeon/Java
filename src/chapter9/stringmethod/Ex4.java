package chapter9.stringmethod;


public class Ex4 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);
        System.out.println(strVal);
        System.out.println(iVal+"");

        //기본형 문자열로
        double dVal = 200.0;
        String s = String.valueOf(dVal);
        System.out.println(s);
        System.out.println(dVal + "");

        int i = Integer.parseInt("+" + strVal);
        System.out.println(i);

        // 문자열에서 기본형으로 바꾸는건 valueOf나 parse~나 똑같다. 단순히 valueOf내부에서 parse~를사용
        double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(s);
        System.out.println(sum);

        double sum2 = Integer.valueOf(strVal) + Double.valueOf(s);
        System.out.println(sum2);

        String trim = "     Helo!!!   ".trim();
        System.out.println(trim); // 좌우 공백 없앤 String을 리턴.
    }
}
