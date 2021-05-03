package restudy.collection;

enum FruitKind { BANANA, APPLE, KIWI, MANGO}
enum GameKind {
    SUDDEN_ATTACK(5), MAPLE_STORY(1), LOL(4); // 평점

    private int rate;

    @Deprecated
    GameKind(int rate) {
        this.rate = rate;
    }

    @Deprecated
    public int getRate() {
        return rate;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        FruitKind fruitKind = FruitKind.APPLE;
        System.out.println(fruitKind);
        System.out.println(fruitKind.ordinal()); // 순서 자동으로 할당됨(0부터) 값과는다름
        System.out.println(fruitKind.name());

        FruitKind[] values = FruitKind.values();
        for (FruitKind value : values) {
            System.out.println("value.name() = " + value.name());
            System.out.println("value.ordinal() = " + value.ordinal());
        }

        System.out.println(fruitKind == FruitKind.APPLE);
        System.out.println(fruitKind.equals(FruitKind.APPLE));
        System.out.println(fruitKind.compareTo(FruitKind.KIWI)); // Comparable인터페이스 - 정렬기준인 compareTo메서드를 제공
        // 왼 - 오 > 로 크기나타냄
        // Compar
        // 열거형각 상수들은 객체이다. ==주소비교, equals :

        System.out.println(FruitKind.valueOf("APPLE").name());

        GameKind[] values1 = GameKind.values();
        for (GameKind gameKind : values1) {
            System.out.println(gameKind + " " + gameKind.ordinal()); // 순서일뿐
            System.out.println(gameKind.name() + " " + gameKind.getRate());
        }
    }
}
