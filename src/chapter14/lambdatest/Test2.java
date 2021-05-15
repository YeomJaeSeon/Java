package chapter14.lambdatest;

//java.util.fuction의 함수형인터페잇들 - 제공되는 함수형인터페이스들(표준화가능)

import java.util.function.*;

public class Test2 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello");
        r.run();
        Supplier<String> s = () -> "Hello"; // 반환값만있어
        System.out.println(s.get());
        Consumer<Integer> c = (a) -> System.out.println(a + " 는 숫자다"); // 매개변수반 있어
        c.accept(10);
        Function<Integer, Integer> f = a -> a / 10 * 10;
        System.out.println(f.apply(123));
        Predicate<String> p = str -> str.equals("염재선");
        System.out.println(p.test("염민선"));
        System.out.println(p.test("염재선"));

        // 매개변수 둘
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println( a + " : " + b);
        biConsumer.accept(10, 3);
        // 매개변수 두개 - 매개변수만 ~ : Consumer
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a > b ? a : b;
        System.out.println(biFunction.apply(3, 5));
        BiPredicate<String, String> biPredicate = (str1, str2)->str1.equals(str2);
        System.out.println(biPredicate.test("염재선", "염민선"));
        System.out.println(biPredicate.test("염재선", "염재선"));

        // 지네릭 탕빙 같은,, 즉 매개변수와 반환타입이 같은 - <T, T>, <T, T, T>요런식
        UnaryOperator<String>  u = (str) -> str + " 안녕";
        System.out.println(u.apply("염재선"));

        BinaryOperator<String> b = (str1, str2) -> str1 + str2 + " 안녕? ";
        System.out.println(b.apply("염재선", "염민선"));

        Predicate<String> e = Predicate.isEqual("염재선");
        boolean result = e.test("염재선");
        System.out.println(result);

    }
}
