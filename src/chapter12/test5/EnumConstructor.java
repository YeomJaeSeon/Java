package chapter12.test5;

enum Direction{
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
    // enum 생성자를 호출하는것이다.
    // ordinal과다르다.

    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;
    private Direction(int value, String symbol){
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Direction of(int dir){
        if(dir < 1 || dir > 4){
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir - 1];
    }

    public Direction rotate(int num){
        num %= 4;
        if(num < 0) num += 4;
        return DIR_ARR[(value - 1 + num) % 4];
    }



    @Override
    public String toString() {
        return name() + " " + symbol;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        Direction direction = Direction.EAST;
        System.out.println("direction = " + direction);

        System.out.println(direction.getSymbol());
        System.out.println(direction.getValue());
        System.out.println(direction.ordinal());
        // oridnal은 순서임 값과다름. 값인 enum클래스의 iv와는 다르다.

        Direction[] d = Direction.values();
        for (Direction direction1 : d) {
            System.out.printf("%s=%d%n", direction1.name(), direction1.getValue());
        }

        Direction d1 = Direction.EAST;
        System.out.println("d1 = " + d1);

        Direction d2 = Direction.of(1);
        System.out.println(d2);

        Direction direction1 = Direction.valueOf("EAST");
        System.out.println("direction1 = " + direction1);

    }
}
