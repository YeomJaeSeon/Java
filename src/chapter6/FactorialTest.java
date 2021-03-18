package chapter6;

public class FactorialTest {
    public static void main(String[] args) {
        int result  = factorial(4);
        System.out.println(result);;

    }

    // 재귀함수를 이용하면 속도는 느리고 메모리도 부족할수있지만 직관성이 좀좋다. 첫눈에보면 재귀함수가 더 직과넞ㄱ이긴함.
    static int factorial(int n){
        if(n <= 0 || n > 12) return -1; // 매개변수 n에 대한 유효성 검사를 항상넣어줘야한다.
        if(n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
