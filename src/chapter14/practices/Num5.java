package chapter14.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Num5 {
    public static void main(String[] args) {
        //5번
        String[] strArr = {"aaa", "bb", "c", "dddd"};
         int sum = Stream.of(strArr).mapToInt(String::length).sum();
        System.out.println("sum = " + sum);

        //6번
        IntStream intStream = Stream.of(strArr).mapToInt(String::length);
        OptionalInt max = intStream.max();
        System.out.println("max.getAsInt() = " + max.getAsInt());

        //7번
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            list.add(num);
        }
        list.stream().sorted().forEach(System.out::println);




    }
}
