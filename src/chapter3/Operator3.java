package chapter3;

public class Operator3 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;

        c3 = (char)(c1 + 1);
        c2++;
        c2++;
        System.out.println("i=" + i); //66? 65에 1더해짐
        System.out.println("c2=" + c2); // char가 나오는군. c2의 타입은 char이므로
        System.out.println("c3=" + c3); // 'b'

        c1 = 'a';
//        c2 = c1 + 1;
        
    }
}
