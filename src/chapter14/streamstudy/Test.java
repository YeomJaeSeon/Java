package chapter14.streamstudy;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    static List<SoccerTeam>[] winnerList = new List[3];
    public static void main(String[] args) {
        // stream생성
        List
                <Integer> list = Arrays.asList(1, 2, 3, 4 ,5);
        //컬렉션 -> 스트림
        Stream<Integer> stream = list.stream(); //Collection 인터페이스의 stream()메서드로 스트림생성
        stream.sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
        System.out.println();

        // 배열 -> 스트림
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5 ,6 ,7);
        stream1.map(i -> String.valueOf(i)).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();

        Stream<Integer> stream2 = Arrays.stream(new Integer[]{10, 11, 12, 13, 14});
        stream2.skip(3).forEach(System.out::println);
        System.out.println();

        //IntStream사용
        IntStream intStream = IntStream.of(5, 10, 15, 20);
        intStream.forEach(System.out::print);
        System.out.println();

        IntStream intStream1 = Arrays.stream(new int[]{2, 4, 6,8, 10, 12});
        intStream1.forEach(System.out::print);
        System.out.println();

        //특정범위
        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.forEach(System.out::print);
        System.out.println();

        // 난수 스트림 - 무한스트림에 주의
        IntStream intStream3 = new Random().ints(100, 200);
        intStream3.limit(10).forEach(System.out::println);
        System.out.println();

        // iterator(), generator()이용. - 이 메서드 파라미터에 람다식 전달 -> 람다식 결과에맞는 데이터소스를 갖는 스트림 생성
        IntStream intStream4 = IntStream.iterate(0, n -> n + 2); // 0부터 2의배수 - 무한스트림에 주의
        intStream4.limit(10).forEach(System.out::println);
        System.out.println();

        Stream<String> stringStream = Stream.generate(() -> "염재선");
        stringStream.limit(10).forEach(System.out::println);
        System.out.println();

        // 중간연산
        IntStream intStream5 = IntStream.of(1, 2, 3, 4, 5, 6, 7,8, 9, 10);
        intStream5.skip(5).forEach(System.out::println);
        System.out.println();

        IntStream intStream6 = IntStream.iterate(0, n -> n + 5);
        intStream6.filter(n -> n % 10 != 0).limit(10).forEach(System.out::println);
        System.out.println();

        Stream<String> stream3 = Stream.of("염재선", "염재선", "염재선", "강수호", "강수호", "김유성");
        stream3.distinct().forEach(System.out::println);
        System.out.println();

        Stream<SoccerTeam> soccerTeamStream = Stream.of(
                new SoccerTeam("첼시", 1, 10),
                new SoccerTeam("맨유", 1, 15),
                new SoccerTeam("미들즈브러", 2, 30),
                new SoccerTeam("토트넘", 1, 13),
                new SoccerTeam("블랙번", 2, 5),
                new SoccerTeam("번리", 1, 5),
                new SoccerTeam("스드리프필드", 3, 4),
                new SoccerTeam("파이어브레스", 3, 25),
                new SoccerTeam("백보닝", 2, 25)
                );
        for(int i = 0; i < 3; i++){
            winnerList[i] = new ArrayList<>();
        }
        soccerTeamStream
                .sorted(Comparator.comparing((SoccerTeam i) -> i.getLevel()).thenComparing(Comparator.naturalOrder()))
                .forEach(i -> {
                    if(winnerList[i.getLevel() - 1].size() == 0) winnerList[i.getLevel() - 1].add(i);
                    System.out.println(i);
                });
        System.out.println();
        System.out.println("각 리그 일등팀");
        for (List<SoccerTeam> soccerTeams : winnerList) {
            System.out.println(soccerTeams.get(0));
        }

        //중간연산 변환 - map
        soccerTeamStream = Stream.of(
                new SoccerTeam("첼시", 1, 10),
                new SoccerTeam("맨유", 1, 15),
                new SoccerTeam("미들즈브러", 2, 30),
                new SoccerTeam("토트넘", 1, 13),
                new SoccerTeam("블랙번", 2, 5),
                new SoccerTeam("번리", 1, 5),
                new SoccerTeam("스드리프필드", 3, 4),
                new SoccerTeam("파이어브레스", 3, 25),
                new SoccerTeam("백보닝", 2, 25)
        );

        System.out.println();
        soccerTeamStream
                .filter(i -> i.getLevel() == 1)
                .peek(System.out::println)
                .map(i -> i.getName())
                .peek(System.out::println)
                .filter(i -> i.length() > 2)
                .peek(System.out::println)
                .forEach(System.out::println);
        System.out.println();

        //Stream<SoccerTeam> -> Stream<String>

        Stream<String[]> stream4 = Stream.of(new String[]{"김", "이", "박"},
                new String[]{"최", "정", "황"},
                new String[]{"홍", "석", "염"}
                );
        stream4.map(i -> Arrays.stream(i)).forEach(System.out::println);
        stream4 = Stream.of(new String[]{"김", "이", "박"},
                new String[]{"최", "정", "황"},
                new String[]{"홍", "석", "염"}
        );

        // flatMap - 차원변환환
       stream4.flatMap(Arrays::stream).forEach(System.out::println);
        System.out.println();



    }
}

class SoccerTeam implements Comparable<SoccerTeam>{
    String name;
    int level; // ~부리그
    int totalScore;

    public SoccerTeam(String name, int level, int totalScore){
        this.name = name;
        this.level =level;
        this.totalScore =totalScore;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getLevel() {
        return level;
    }


    @Override
    public int compareTo(SoccerTeam o) {
        return o.totalScore - totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s %d %d]", name, level, totalScore);
    }
}
