package chapter6;

public class FactorialTest2 {
    static long factorial(int n){
        if(n <= 0 || n > 20) return -1;
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {

        int n = 21;
        long result = 0L;

        for(int i = 1; i <= n; i++){
            result = factorial(i);
            if(result == -1){
                System.out.printf("유효하지 않네 이새끠야! %d%n", n);
                break;
            }
            System.out.printf("%2d!=%20d%n", i, result);
        }

    }
}
