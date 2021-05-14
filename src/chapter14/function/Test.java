package chapter14.function;

import java.util.function.*;

//java.util.function 패키지의 인터페이스들. - 함수형인터페이스 표준! (람다식 참조할때 사용하던 함수형 인터페이스)
// 자주사용되는 함수형인터페이스를 모아놓은 패키지이다. 이를통해 표준화가가능. 왠만하면 함수형인터페이스를 직접만들지말고 만들어져있는걸사용해야 유지보수도좋고
//표준화도된다.
public class Test {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("안녕"); // 매개변수 X, 반환 X - Runnable 은 쓰레드만들때 사용이되었었다.
        r.run(); // 참조변수로 run멤버호출
        Consumer<String> c = (s) -> System.out.println(s); // 매개변수 O, 반환 X
        c.accept("안녕");
        Supplier<Integer> s = () -> 10 * 10; // 매개변수 X, 반환 O
        System.out.println(s.get());

        Function<Integer, Integer> f = (a) -> (int)(Math.random() * a) + 1; // 매개변수 O, 반환 O
        System.out.println(f.apply(1000));

        Predicate<String> predicate = (string) -> string.equals("염재선"); // 매개변수 O, 리턴 O 그런데 리턴타입이 boolean

        System.out.println("predicate 결과 : " + predicate.test("염재선"));


        // 매개변수 둘
        BiConsumer<Integer, String> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, " = 염재선");

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a > b ? a : b;
        System.out.println("max : " + biFunction.apply(10, 30));

        BiPredicate<String, String> biPredicate = (a, b) -> a.equals(b);
        System.out.println(biPredicate.test("염재선", "염재선"));

        // 매개변수, 리턴타입이 같은 함수형인터페이스 Function, Predicate형이있다.
        UnaryOperator<String> unaryOperator = (str) -> str + "안녕"; // Function 함수형인터페이스 자식이다.
        System.out.println(unaryOperator.apply("염재선 "));

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + ", " + str2; // BiFunction - 매개변수 둘 인 함수형인터페이스 상속받음
        String apply = binaryOperator.apply("염재선", "염민선");
        System.out.println(apply);



    }
}
