package chapter14.function;


//java.util.function패키지에는 뭐가있을까?
// 바로바로~ 자주사용되는 함수형인터페이스가 모여있다
//왜 이걸사용해야돼? 그냥 내가 함수형인터페이스만들어서 람다식 사용하면안됨?
// 표준화를 해주기때문에 사용하는게좋지.. 나혼자 코딩할꺼야? 협업할떄 표준화를 시키면 유지보수가 좋잖아.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class Test3 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1; // 1 ~ 100 random, 반환값만있어
        Consumer<Integer> c = (i) -> System.out.print(i + ", ");
        Function<Integer, Integer> f = (i) -> i / 10 * 10; //일의자리 없애기
        Predicate<Integer> p = (i) -> i % 2 == 1; // 반환값이 boolean

        BiFunction<Integer, Integer, int[]> biFunction = (a, b) -> new int[]{a, b};

        List<Integer> list = new ArrayList<>();


        makeRandom(s, list);
        System.out.println(list);
        printOdd(c, p, list);
        List<Integer> newList = removeFirst(f, list);
        System.out.println(newList);

        List<int[]> ints = oneToTwo(biFunction, newList);

        Iterator<int[]> iterator = ints.iterator();
        while(iterator.hasNext()){
            int[] next = iterator.next();
            System.out.print(Arrays.toString(next) + ", ");
        }


    }
    static <T> void makeRandom(Supplier<T> s, List<T> list){
        for(int i = 0; i < 10; i++){
            list.add(s.get());
        }
    }
    static <T> void printOdd(Consumer<T> c, Predicate<T> p, List<T> list){
        System.out.print("[ ");
        for (T t : list) {
            if(p.test(t))
                c.accept(t);
        }
        System.out.println("]");
    }
    static <T> List<T> removeFirst(Function<T, T> f, List<T> list){
        List<T> newList = new ArrayList<>(list.size());
        for (T t : list) {
            newList.add(f.apply(t));
        }
        return newList;
    }

    static <T> List<int[]> oneToTwo(BiFunction<Integer, Integer, int[]> biFunction, List<Integer> list){
        List<int[]> newList = new ArrayList<>(list.size() / 2 + 1);
        int[] tmp = null;
        for(int i = 0; i < list.size(); i++){
            if(i % 2 == 0) tmp = new int[2];
            tmp[i % 2] = list.get(i);
            if(i % 2 == 1){
                newList.add(tmp);
            }
        }
        return newList;
    }
}
