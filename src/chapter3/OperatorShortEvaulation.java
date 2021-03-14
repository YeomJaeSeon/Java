package chapter3;

public class OperatorShortEvaulation {
    public static void main(String[] args) {
        int a = 5;
        int b= 0;

        System.out.printf("a=%d, b=%d%n", a,b);
        System.out.printf("a != 0 || ++b!=0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a=%d, b=%d%n", a,b );
        System.out.printf("a==0 && ++b!= 0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a=%d, b=%d%n",a, b);
        
        // && || 은 왼쪽부터 연산하는데 &&은 false나오면 오른쪽연산 X, ||는 true나오면 오른쪽 연산 X어짜피 결과는 다 정해져있으므로

    }
}
