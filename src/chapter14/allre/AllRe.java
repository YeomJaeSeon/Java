package chapter14.allre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

//람다식 - 익명객체 (메서드, 함수를 간단하게표현)
// 객체이므로 참조변수필요, 참조변수 탕비은 함수형 인터페이스로(추상메서드 단한개! 에너테이션도 존재함)
// 함수형인터페이스 표준들이 존재 그걸이용하자.
public class AllRe {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("안녕");
        runnable.run();

        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Hello My World!!");

        Supplier<Integer> s = () -> 100;
        System.out.println(s.get());

        Function<String, Integer> f = (a) -> Integer.parseInt(a);
        System.out.println(f.apply("1000") + 200);

        Function<Integer, int[]> intArr = (i) -> new int[i];
        int[] apply = intArr.apply(10);
        Arrays.fill(apply, -100);
        System.out.println(Arrays.toString(apply));

        BiConsumer<Integer, String> biConsumer = (a, b) -> System.out.println(a + Integer.parseInt(b));
        biConsumer.accept(100, "200");

        Predicate<String> predicate = (a) -> a.equals("염재선");
        System.out.println(predicate.test("염재선"));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.forEach(a -> {
            if(a % 2 == 0)
                System.out.println(a);
        });

        List<Integer> list2 = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            list2.add(i);
        }
        list2.removeIf(a -> a == 5);
        list2.forEach(i -> System.out.println(i));

        Function<String, Integer> function = String::length;
        Integer length = function.apply("기나긴 여정을 마치고..");
        System.out.println("length = " + length);

        Function<Integer, Home> myHome = (i) -> new Home(i);
        Home house = myHome.apply(2000);
        System.out.println(house);

        Function<Integer, String[]> strArr = (i) -> {
            return new String[i];
        };
        String[] realStringArr = strArr.apply(10);
        Arrays.fill(realStringArr, "안뇽");
        System.out.println(Arrays.toString(realStringArr));



    }

}

class Home{
    int price;
    public Home(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("home price : %d%n", price);
    }
}