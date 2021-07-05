package second.chapter14;

import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MyFunction2{
    void run();
}
public class Test2 {
    static void execute(MyFunction2 f){
        f.run();
    }
    static MyFunction2 getMyFunction(){
        return () -> System.out.println("run()");
    }
    public static void main(String[] args) {
        MyFunction2 function2 = () -> System.out.println("helli");
        function2.run();
        MyFunction2 f2 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("f2.run!!");
            }
        };
        f2.run();

        MyFunction2 f3 = getMyFunction();
        f3.run();

        execute(f3);

        Runnable run = () -> System.out.println("hi!");
        run.run();

        Supplier<Integer> supplier = () -> 10;
        int result = supplier.get();
        System.out.println("result = " + result);
        Predicate<Integer> predicate = (a) -> a == 10;

        System.out.println("predicate.test(10) = " + predicate.test(10));
        System.out.println("predicate.test(2) = " + predicate.test(2));

    }
}
