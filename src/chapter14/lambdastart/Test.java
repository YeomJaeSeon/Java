package chapter14.lambdastart;

public class Test {
    int max(int a, int b){
        return a > b ? a : b;
    }

    public static void main(String[] args) {

    }
}

/**
 (int a, int b) -> { return a > b ? a : b;}
 (int a, int b) -> a > b ? a : b
 (a, b) -> a > b ? a : b
 람다식은 메서드를 간단히 표현(메서드를 하나의 식으로 표현)

 (String name, int i) -> { System.out.println(name + "=" + i);}
 (name, i) -> { System.out.println(name + "=" + i); }
 (name, i) -> System.out.println(name + "=" + i)

 (int x) -> { return x * x; }
 (int x) -> x * x
 (x) -> x * x
 x -> x * x
 // 매개변수하나일땐 소괄호도 생략가능

 () -> { return (int)(Math.random() * 6); }
 () -> (int)(Math.random() * 6)

 **/