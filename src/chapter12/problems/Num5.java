package chapter12.problems;

public class Num5 {
    public static void main(String[] args) {
        Deck d = new Deck(); // (Deck) . 카드 한 벌 을 만든다
        Card c = d.pick(0); // . 섞기 전에 제일 위의 카드를 뽑는다
        System.out.println(c); // System.out.println(c.toString()); . 과 같다
        d.shuffle(); // . 카드를 섞는다
        c = d.pick(0); // . 섞은 후에 제일 위의 카드를 뽑는다
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = Card.Kind.values().length
            * Card.Number.values().length; // 카드의 개수
    Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함

    Deck () {
        // 초기화
        int k = 0;
        for (Card.Kind value : Card.Kind.values()) {
            for (Card.Number number : Card.Number.values()) {
                cardArr[k] = new Card(value, number);
                k++;
            }
        }

    }
    Card pick(int index) { // (index) 지정된 위치 에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }
    Card pick() { // Deck . 에서 카드 하나를 선택한다
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }
    void shuffle() { // . 카드의 순서를 섞는다
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
} // Deck클래스의 끝

class Card {
    enum Kind { CLOVER, HEART, DIAMOND, SPADE }
    enum Number {
        ACE, TWO, THREE, FOUR, FIVE,
        SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING
    }
    Kind kind;
    Number num;
    Card() {
        this(Kind.SPADE, Number.ACE);
    }
    Card(Kind kind, Number num) {
        this.kind = kind;
        this.num = num;
    }
    public String toString() {
        return "[" + kind.name() + "," + num.name() + "]";
    } // toString()의 끝
}
/**
 * 6.
 * 메타 에너테이셔 : 에너테이션을 위한 에너테이션(표준 에너테이션과다름)
 * c. Native
 *
 * 7.
 * b. - @TestInfo(count = 1) 이렇게해야함
 * d. - value라 생략가능한데 두개 이상이면 {}해야함 적절한 답: @TestInfo({"bbb", "ccc"})
 *
 * 애너테이션 생성과 사용, 외울필욘없지만 스프링에서 에너테이션을 자주사용하므로 한번 어떤식으로 애너테이션만들수있고 사용할수있는지 알아보는것 굳!
 */
