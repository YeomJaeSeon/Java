package chapter14.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Num1 {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>(5);
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a + b == 6;


            for(int i = 1; i <= 6; i++){
                for(int j = 1; j <= 6; j++){
                    if(biPredicate.test(i, j)){
                        list.add(new int[]{i, j});
                    }
                }
            }

        list.forEach(i -> System.out.println("["+i[0]+", "+i[1]+"]"));
    }
}

/**
 1번
 (String name, int i) -> System.out.println(name + "=" + i)
 x -> x * x
 () -> (int) (Math.random() * 6)
 (int[] arr) -> {
 int sum = 0;
 for(int i : arr) sum += i;
 return sum;
 }
 () -> new int[]{}

 2번
 String::length
 int[]::new
 Arrays::stream
 String::equals
 Integer::compare
 Card::new
 System.out::println
 Math::random
 String::toUpperCase
 NullpointException::new
 Optional::get
 StringBuffer.append
 System.out::println

 3번
 d. BinaryOperator - 매개변수 두개 반환값 하나 - 모두 타입이 int로같음


 **/