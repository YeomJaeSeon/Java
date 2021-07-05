package second.chapter14;

import java.util.function.*;

// java.util.function 패키지의 함수형인터페이스들 (자주사용되는 함수형인터페이스)
public class Test3 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("run!");
        runnable.run();

        Supplier<String> supplier = () -> "염재선"; //아낌없이 주는 나뮤..
        String name = supplier.get();
        System.out.println("name = " + name);

        Consumer<Integer> consumer = (a) -> System.out.println(a);
        //난쓰기만해
        consumer.accept(10);

        Function<String, Integer> stoi = (a) -> Integer.parseInt(a);
        Integer convertResult = stoi.apply("10");
        System.out.println("convertResult = " + convertResult.getClass());

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + ", " + b);
        biConsumer.accept(10, 20);

        BiFunction<Integer, String, Integer> biFunction = (a, b) ->{
            int c = a + Integer.parseInt(b);
            return c;
        };
        Integer result = biFunction.apply(10, "20");
        System.out.println("result = " + result);

        BiPredicate<Integer, String> biPredicate = (a, b) -> a == Integer.parseInt(b);
        boolean test = biPredicate.test(10, "10");
        System.out.println("t = " + test);

        //매개변수, 반환타입 모두같을경우
        UnaryOperator<Integer> unaryOperator = (a) -> a * 10;
        System.out.println(unaryOperator.apply(10));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(10, 20));



    }
}
