package chapter9.util;

//java.util.Stringtokenizer 클래수
public class StringTokenizer {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        java.util.StringTokenizer st = new java.util.StringTokenizer(source, ",");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
