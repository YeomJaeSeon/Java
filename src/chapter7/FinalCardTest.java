package chapter7;

final class CardF{
    final int NUMBER;
    final String KIND;//final키워드가 붙은 멤버변수는 상수지만 이렇게 선언과동시에 초기ㅗ하를 안할수있따.
    //선언과동시에초기화하면 모든 인스턴스가 동일한값을 갖는 static변수와 다를게없다.
    static int width = 100;
    static int height = 200;

    CardF(int number, String kind){
        NUMBER = number;
        KIND = kind;
    }
    CardF(){
        this(5, "HEART");
    }

    @Override
    public String toString() {
        return KIND + " " + this.NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        CardF card1 = new CardF(5, "SPADE");
//        card1.NUMBER = 100; // final이므로 상수이므로, 변경불가
        System.out.println(card1.KIND);
        System.out.println(card1.NUMBER);

        System.out.println(card1);
        // toStirng이 나오는거알쥐? Object클래스의 메서드 오버라이딩한거임. (자동으로 상속받고있는)
    }
}
