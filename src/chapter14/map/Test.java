package chapter14.map;

import java.io.File;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        File[] fileArr = new File[]{
                new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"),
                new File("Ex1.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr); // 스트림 생성
        Stream<String> fileNameString = fileStream.map((f) -> f.getName()); // Stream<File> -> Stream<String>
        // Stream 변환 - map
        fileNameString.forEach((s)-> System.out.println(s));
        System.out.println();

        fileStream = Stream.of(fileArr);
        fileStream.map(File::getName) // Stream<File> -> Stream<String> 변환
                .filter(s -> s.indexOf('.') != -1)
                .peek(s -> System.out.printf("fileName : %s%n", s))
                .map(s -> s.substring(s.indexOf('.') + 1)) // Stream<String> -> Stream<String>변환
                .peek(s -> System.out.printf("extension = %s%n", s))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
    }
}
