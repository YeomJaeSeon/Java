package chapter12.t;

// 열거형 : 관련된 상수들을 묶은것. - 열거형의 상수는 사실 객체이다.
enum Direction{EAST, SOUTH, WEST, NORTH};

public class EnumTest {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST; // 상수사용하려면 열거형 이름.상수이름
        Direction d2 = Direction.valueOf("SOUTH");
        Direction d3 = Direction.valueOf(Direction.class, "EAST");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1==d2 ? " + (d1 == d2));
        System.out.println("d1==d3 ? " + (d1 == d3));

        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d2));

//        System.out.println(d1 > d2); 열거형 상수끼리 비교는 안된다.
        System.out.println(d1.compareTo(d2));
        // d1 - d2 ( 0 - 1) = -1
        System.out.println(d1.compareTo(d3));
        // d1 - d3 = 0 - 같음

        // compareTo : 빼기로비교
        Direction[] dArr = Direction.values();

        for (Direction d : dArr) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
            // name(), ordianl() - Enum클래스의 메서드
        }

    }
}
