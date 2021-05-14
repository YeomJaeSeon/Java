package chapter14.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test2 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1; // 반환값만있음
        Consumer<Integer> c = (a) -> System.out.println(a + " "); // 매개변수만잇음
        Predicate<Integer> p = (i) -> i % 2 == 0; // 매개변수 반환값있는데반환값이 boolean
        Function<Integer, Integer> f = i -> i / 10 * 10; //매개변수 반환값 둘다있음 그러나 매개변수 하나!

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);

    }
    static <T> List<T> doSomething(Function<T, T> f, List<T> list){
        List<T> newList = new ArrayList<>(list.size());
        for (T i : list) {
            newList.add(f.apply(i));
        }
        return newList;
    }
    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.println("[");
        for (T i : list) {
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }
    static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for(int i = 0; i < 10; i++){
            list.add(s.get());
        }
    }
}
