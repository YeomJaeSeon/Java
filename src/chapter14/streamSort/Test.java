package chapter14.streamSort;

import java.util.Comparator;
import java.util.stream.Stream;

class Gamer implements Comparable<Gamer>{
    private String name;
    private int age;
    private int ranks;

    public Gamer(String name, int age, int ranks) {
        this.name = name;
        this.age = age;
        this.ranks = ranks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRanks() {
        return ranks;
    }

    @Override
    public int compareTo(Gamer other) {
        return this.ranks - other.ranks;
    }

    @Override
    public String toString() {
        return String.format("[%s %d %d]", name, age, ranks);
    }
}

public class Test {
    public static void main(String[] args) {
        Gamer[] gamers = new Gamer[]{
                new Gamer("염재선", 20, 1),
                new Gamer("김장수", 23, 5),
                new Gamer("강수호", 22, 2),
                new Gamer("박용", 30, 40),
                new Gamer("김유", 15, 42),
                new Gamer("김첨", 42, 33),
                new Gamer("박용우", 30, 20),
                new Gamer("김유성", 15, 4),
                new Gamer("김첨지", 42, 3)
        };
        Stream<Gamer> gamerStream = Stream.of(gamers);
        gamerStream.sorted(Comparator.comparing(Gamer::getAge).reversed()
                .thenComparing(Comparator.naturalOrder()).reversed())
                .forEach(System.out::println);

        // strea의 정렬

    }
}
