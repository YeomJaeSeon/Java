package chapter12.tests;

enum Direction{
    EAST(100), WEST(200), SOUTH(300), NORTH(400);

    private int value;
    public int getValue(){
        return value;
    }

    Direction(int value){
        this.value = value;
    }
}

public class EnumTest {
    static Direction dir;
    static void init(Direction dir){
        EnumTest.dir = dir;
    }
    public static void main(String[] args) {
        Direction[] values = Direction.values();
        for (Direction value : values) {
            System.out.println(value.ordinal());
            System.out.println(value.getValue());
        }

    }
}
