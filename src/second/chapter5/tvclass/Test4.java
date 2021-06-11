package second.chapter5.tvclass;

import second.chapter5.tvclass2.Card;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(Card.width);
        Card card = new Card("spade", 10);
        System.out.println(Card.height);
        System.out.println(Card.width);
        System.out.println(card.getKind());
        System.out.println(card.getNum());

        Card card1 = new Card("heart", 5);



    }
}
