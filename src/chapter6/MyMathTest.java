package chapter6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5, 3);
        double result4 = mm.divide(5L, 3L);
        // 인자는 double이여도 인자가 더큰타입이므로 auto cating이된다. 즉, 5.0, 3.0 double로 전달된다.

        System.out.println(result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}

class MyMath{
    long add(long a, long b){
        return a + b;
    }
    long subtract(long a, long b){
        return a - b;
    }
    long multiply(long a, long b){
        return a * b;
    }
    double divide(double a, double b){
        return a / b;
    }
}
