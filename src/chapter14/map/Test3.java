package chapter14.map;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;


// 스트림 중간연산 2 -map, peek, flatMap
public class Test3 {
    public static void main(String[] args) {
        File[] fileArr = new File[]{
                new File("hello.java"),
                new File("why.html"),
                new File("myFile.jpg"),
                new File("java2")
        };
        Stream<File> fileStream = Stream.of(fileArr);
        fileStream.map((f) -> f.getName())
//                .peek(System.out::println)
                .filter(i -> i.indexOf('.') != -1)
//                .peek(System.out::println)
                .map(i -> i.substring(i.indexOf('.') + 1))
                .peek(System.out::println)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Stream<String[]> strStream = Stream.of(
                new String[]{"김자바", "박자바", "염자바"},
                new String[]{"박선배", "김선배", "최선배"}
        );
        Stream<Stream<String>> streamStream = strStream.map(i -> Arrays.stream(i));
        strStream = Stream.of(
                new String[]{"김자바", "박자바", "염자바"},
                new String[]{"박선배", "김선배", "최선배"}
        );
        strStream.flatMap(i -> Arrays.stream(i)).forEach(System.out::print);

        System.out.println();
        String[] lineArr = {
                "I want you i love you so much",
                "hello bonjour, mihao hihi!!"
        };
        Stream<String> lineStream = Stream.of(lineArr);
//        lineStream.forEach(System.out::println);
        lineStream.flatMap(i -> Stream.of(i.split(" +"))).map(String::toLowerCase).distinct().sorted(Comparator.comparing((String s) -> s.length())).forEach(System.out::println);
        //flatMap - 중간연산이데 Stream의 스트림을 만드는게아닌 1차원의 스트림을만듬
        //그냥 map을하면 스트림의 스트림을 만든다.
    }
}

/**
 map 중간연산 : 요소변환 length는 고대로~
 Stream<File> -> Stream<String>
 peek : forEach와같은데 중간연산임! - 스트림을 반환함
 flatMap : 차원변환, map과같은데 차원을변환
 **/